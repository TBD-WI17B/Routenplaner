package core.Model;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import core.Controller.Connector;

public class Model_Auftrag {

	public Model_Auftrag() {
		
	}
	public String[] getList() {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT auftragId FROM auftrag");
			String[] ids = result.get("auftragId");
			return ids; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public Map<String,String> getDataFromAuftrag(int id) {
		try {
			Map<String,String[]> auftrag = 
					Connector.getQueryResult("SELECT auftrag.auftragId,auftrag.entfernung,auftrag.datumDerFahrt,auftrag.letztesƒnderungsDatum,auftrag.entfernung, "
										+ "ziel.plz as zielPlz,ziel.stadt as zielStadt,ziel.straﬂe as zielStraﬂe,ziel.hausnummer as zielHausnummer,ziel.adresszusatz as zielAdresszusatz, "
										+ "startAdresse.plz as startPlz,startAdresse.stadt as startStadt,startAdresse.straﬂe as startStraﬂe,startAdresse.hausnummer as startHausnummer,startAdresse.adresszusatz as startAdresszusatz, "
										+ "kunde.name, kunde.vorname, kunde.kundenId as kId "
										+ "FROM `auftrag` "
										+ "LEFT JOIN adresse ziel on auftrag.zielAdresseId = ziel.adressId "
										+ "LEFT JOIN kunde on auftrag.kundenId=kunde.kundenId "
										+ "LEFT JOIN adresse startAdresse on auftrag.startAdresseId = startAdresse.adressId "
										+ "WHERE auftrag.auftragId = "+id);
			Map<String,String[]> route = Connector.getQueryResult("SELECT routenId FROM auftragzuroute,auftrag WHERE auftrag.auftragId=auftragzuroute.auftragId AND auftrag.auftragId="+id+" LIMIT 1");
			try {
			Map<String,String> mapResult = new HashMap<String, String>();
			mapResult.put("auftragsnummer",auftrag.get("auftragId")[0]);
			mapResult.put("kunde",auftrag.get("name")[0]+", "+auftrag.get("vorname")[0]+" (ID :"+auftrag.get("kId")[0]+")");
			mapResult.put("lastChange",auftrag.get("letztesƒnderungsDatum")[0]);
			mapResult.put("fahrtDatum",auftrag.get("datumDerFahrt")[0]);
			mapResult.put("distance",auftrag.get("entfernung")[0]);
			
			if(route.get("routenId").length!=0)mapResult.put("route",route.get("routenId")[0]);
			else mapResult.put("route","Noch nicht verplant");
			
			mapResult.put("startPlz",auftrag.get("startPlz")[0]);
			mapResult.put("startOrt",auftrag.get("startStadt")[0]);
			mapResult.put("startStraﬂe",auftrag.get("startStraﬂe")[0]);
			mapResult.put("startHausNr",auftrag.get("startHausnummer")[0]);
			
			mapResult.put("zielPlz",auftrag.get("zielPlz")[0]);
			mapResult.put("zielOrt",auftrag.get("zielStadt")[0]);
			mapResult.put("zielStraﬂe",auftrag.get("zielStraﬂe")[0]);
			mapResult.put("zielHausNr",auftrag.get("zielHausnummer")[0]);
			return mapResult;
			}catch(Exception e) {
				Map<String,String> mapResult = new HashMap<String, String>();
				mapResult.put("auftragsnummer",String.valueOf(id));
				mapResult.put("kunde"," ");
				mapResult.put("lastChange","");
				mapResult.put("fahrtDatum","");
				mapResult.put("distance","");
				
				mapResult.put("route","Noch nicht verplant");
				
				mapResult.put("startPlz","");
				mapResult.put("startOrt","");
				mapResult.put("startStraﬂe","");
				mapResult.put("startHausNr","");
				
				mapResult.put("zielPlz","");
				mapResult.put("zielOrt","");
				mapResult.put("zielStraﬂe","");
				mapResult.put("zielHausNr","");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String[] getCustomers() {
		try {
			Map<String,String[]> kunden =Connector.getQueryResult("SELECT * FROM kunde GROUP BY name,vorname");
			String[] kundenList = new String[kunden.get("kundenId").length];
			for(int i=0;i<kundenList.length;i++) {
				kundenList[i] = kunden.get("name")[i]+", "+kunden.get("vorname")[i]+" (ID :"+kunden.get("kundenId")[i]+")";
			}
			return kundenList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new String[] {""};
	}
	
	public void saveAuftrag(int id,Map<String,String> data) {
		try {
			Map<String,String[]> auftrag = Connector.getQueryResult("SELECT auftrag.auftragId,auftrag.entfernung,auftrag.datumDerFahrt,auftrag.letztesƒnderungsDatum,auftrag.entfernung,auftrag.startAdresseId,auftrag.zielAdresseId, "
					+ "ziel.plz as zielPlz,ziel.stadt as zielOrt,ziel.straﬂe as zielStreet,ziel.hausnummer as zielHausNr,ziel.adresszusatz as zielAdresszusatz, "
					+ "startAdresse.plz as startPlz,startAdresse.stadt as startOrt,startAdresse.straﬂe as startStreet,startAdresse.hausnummer as startHausNr,startAdresse.adresszusatz as startAdresszusatz, "
					+ "kunde.name, kunde.vorname, kunde.kundenId as kId "
					+ "FROM `auftrag` "
					+ "LEFT JOIN adresse ziel on auftrag.zielAdresseId = ziel.adressId "
					+ "LEFT JOIN kunde on auftrag.kundenId=kunde.kundenId "
					+ "LEFT JOIN adresse startAdresse on auftrag.startAdresseId = startAdresse.adressId "
					+ "WHERE auftrag.auftragId = "+id);
			
			//getKunden
			String kundenString = data.get("kunde");
			int idPosStart = kundenString.indexOf("(ID :")+5;
			int idPosEnd = kundenString.indexOf(")");	
			int kundenId = Integer.parseInt(kundenString.substring(idPosStart, idPosEnd));
			
			//Adresse nur speichern wenn ƒndererung(start)
			int startAdressId = Integer.parseInt(auftrag.get("startAdresseId")[0]);
			if(hasChanged(data, auftrag, "startPlz")||hasChanged(data, auftrag, "startOrt")||hasChanged(data, auftrag, "startStreet")||hasChanged(data, auftrag, "startHausNr")) {
				startAdressId = Connector.insertIntoTable("INSERT INTO `adresse`(`plz`, `stadt`, `straﬂe`, `hausnummer`,`adresszusatz`) "
						+ "VALUES('"+data.get("startPlz")+"','"+data.get("startOrt")+"','"+data.get("startStreet")+"','"+data.get("startHausNr")+"','')");
				if(startAdressId==-1)startAdressId = Integer.parseInt(auftrag.get("startAdresseId")[0]);
			}
			
			//Adresse nur speichern wenn ƒndererung(ziel)
			int zielAdressId = Integer.parseInt(auftrag.get("zielAdresseId")[0]);
			if(hasChanged(data, auftrag, "zielPlz")||hasChanged(data, auftrag, "zielOrt")||hasChanged(data, auftrag, "zielStreet")||hasChanged(data, auftrag, "zielHausNr")) {
				zielAdressId = Connector.insertIntoTable("INSERT INTO `adresse`(`plz`, `stadt`, `straﬂe`, `hausnummer`,`adresszusatz`) "
						+ "VALUES('"+data.get("zielPlz")+"','"+data.get("zielOrt")+"','"+data.get("zielStreet")+"','"+data.get("zielHausNr")+"','')");
				if(zielAdressId==-1)zielAdressId = Integer.parseInt(auftrag.get("zielAdresseId")[0]);
			}
			
			//TODO Gecoding f¸r entfernung benutzen
			float entfernung = 0;
			
			//speicher alles auf dem Auftrag
			Connector.updateTable("UPDATE auftrag a SET "
					+"`zielAdresseId`='"+zielAdressId+"',"
					+"`startAdresseId`='"+startAdressId+"',"
					+"`kundenId`='"+kundenId+"',"
					+"`entfernung`='"+entfernung+"',"
					+"`datumDerFahrt`='"+data.get("fahrtDatum")+"' "
					+"WHERE a.auftragId = "+id);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public Map<String,String>  getCustomerAdress(int id) {
		try {
			Map<String,String[]> kunde = Connector.getQueryResult("SELECT * FROM kunde k, adresse a WHERE k.kundenId = "+id+" AND k.adressId=a.adressId");
			Map<String,String> data = new HashMap<String,String>();
			data.put("plz", kunde.get("plz")[0]);
			data.put("ort", kunde.get("stadt")[0]);
			data.put("street", kunde.get("straﬂe")[0]);
			data.put("hausNr", kunde.get("hausnummer")[0]);
			return data;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public int addAuftrag() {
		try {
			return Connector.insertIntoTable("INSERT INTO `auftrag` (`auftragId`, `zielAdresseId`, `startAdresseId`, `kundenId`, `entfernung`, `datumDerFahrt`) VALUES (NULL, NULL, NULL, NULL, 0, NULL)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	public void deleteAuftrag(int id) {
		
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT datumDerFahrt FROM auftrag WHERE auftragId="+id);
			//System.out.println(result.get("datumDerFahrt")[0]);
			if(result.get("datumDerFahrt")[0]==null) {
				Connector.deleteRecordFromTable("DELETE FROM `auftrag` WHERE auftragId = "+id);
				return;
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			for(int i=0;i<result.get("datumDerFahrt").length;i++) {
				Date date = sdf.parse(result.get("datumDerFahrt")[i]);
				if(date.getTime()>System.currentTimeMillis())return;
			}
			Connector.deleteRecordFromTable("DELETE FROM `auftrag` WHERE auftragId = "+id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private boolean hasChanged(Map<String,String> data,Map<String,String[]> query,String key) {
		return !data.get(key).equals(query.get(key)[0]);
	}
	
}

