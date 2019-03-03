package core.Model;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import core.Controller.Connector;

/**
 * Model-Class der Kundenverwaltung
 */
public class Model_Kunde {

	/**
	 * Konstruktor
	 */
	public Model_Kunde() {
		
	}
	/**
	 * Gibt Liste aller Kunden zurück
	 * @return
	 */
	public String[] getList() {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT kundenId FROM Kunde");
			String[] ids = result.get("kundenId");
			return ids; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * Gibt Daten eines Kunden zurück.
	 * @param id KundenId
	 * @return
	 */
	public Map<String,String> getDataFromCustomer(int id) {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT * FROM kunde k, adresse a WHERE k.kundenId = "+id+" AND k.adressId=a.adressId");
			Map<String,String> mapResult = new HashMap<String, String>();
			mapResult.put("name",result.get("name")[0]);
			mapResult.put("vorname",result.get("vorname")[0]);
			mapResult.put("plz",result.get("plz")[0]);
			mapResult.put("ort",result.get("stadt")[0]);
			mapResult.put("straße",result.get("straße")[0]);
			mapResult.put("hausNr",result.get("hausnummer")[0]);
			mapResult.put("telefon",result.get("telefon")[0]);
			mapResult.put("kundenId",result.get("kundenId")[0]);
			mapResult.put("handicap",result.get("handicap")[0]);
			return mapResult;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * speichert Daten eines Kunden.
	 * @param id KundenId
	 * @param data Map mit Kundendaten
	 */
	public void saveCustomer(int id,Map<String,String> data) {
		try {
			String handicap="";
			//Abfragen der Daten vom Kunden wegen Adressen update
			Map<String,String[]> result = Connector.getQueryResult("SELECT plz,stadt,straße,hausnummer,k.adressId FROM kunde k, adresse a WHERE k.kundenId = "+id+" AND k.adressId=a.adressId");
			int adressId = Integer.parseInt(result.get("adressId")[0]);
			//Wenn Adressen Attribute geändert dann neue anlegen
			if(!result.get("plz")[0].equals(data.get("plz"))||!result.get("stadt")[0].equals(data.get("ort"))
					||!result.get("straße")[0].equals(data.get("street"))||!result.get("hausnummer")[0].equals(data.get("hausNr"))) {
				adressId = Connector.insertIntoTable("INSERT INTO `adresse`(`plz`, `stadt`, `straße`, `hausnummer`,`adresszusatz`) "
						+ "VALUES('"+data.get("plz")+"','"+data.get("ort")+"','"+data.get("street")+"','"+data.get("hausNr")+"','')");
				if(adressId==-1)adressId = Integer.parseInt(result.get("adressId")[0]);
			}
			//Kunden Tabelle 
			if(data.get("handicap")=="true")handicap="`handicap`=1";
			else handicap="`handicap`= 0";
			Connector.updateTable("UPDATE kunde k SET "
					+"`name`='"+data.get("name")+"',"
					+"`vorname`='"+data.get("vorname")+"',"
					+"`telefon`='"+data.get("telefon")+"', "
					+"`adressId`= '"+adressId+"', "
					+ handicap + " "
					+"WHERE k.kundenId = "+id);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Erzeugt neuen Kunden.
	 * @return
	 */
	public int addCustomer() {
		try {
			int adressid = Connector.insertIntoTable("INSERT INTO `adresse`(`plz`, `stadt`, `straße`, `hausnummer`, `adresszusatz`) VALUES ('','','','','')");
			return Connector.insertIntoTable("INSERT INTO `kunde` (`name`, `vorname`, `telefon`, `handicap`, `adressId`) VALUES ('','','',0,"+adressid+")");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	/**
	 * öscht Kunden anhand einer ID.
	 * @param id KundenId
	 */
	public void deleteCustomer(int id) {
		//nur löschen wenn kein offener Auftrag mehr ist als wenn Datum Timestamp kleiner als aktueller Timestamp
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT datumDerFahrt FROM auftrag WHERE kundenId="+id);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			for(int i=0;i<result.get("datumDerFahrt").length;i++) {
				Date date = sdf.parse(result.get("datumDerFahrt")[i]);
				if(date.getTime()>System.currentTimeMillis())return;
			}
			Connector.deleteRecordFromTable("DELETE FROM `kunde` WHERE kundenId = "+id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Gibt Daten für die Tabelle in der Kundenverwaltung zurück.
	 * @param id
	 */
	@Deprecated
	public void getCustomerAuftrag(int id) {
		//TODO für Tabelle
		//Alle Aufträge bekommen mit Datum,auftragsId,start,ziel, Distanz und Betrag
		
		
	}
}
