package core.Model;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import core.Controller.Connector;
import core.Controller.Requesthandler;

public class Model_Auftrag {

	String fehlermeldung = "";

	public String[] getList() {
		try {
			Map<String, String[]> result = Connector.getQueryResult("SELECT auftragId FROM auftrag");
			String[] ids = result.get("auftragId");
			return ids;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Map<String, String> getDataFromAuftrag(int id) {
		try {
			Map<String, String[]> auftrag = Connector.getQueryResult(
					"SELECT auftrag.auftragId,auftrag.entfernung,auftrag.datumDerFahrt,auftrag.letztesƒnderungsDatum,auftrag.entfernung, "
							+ "ziel.plz as zielPlz,ziel.stadt as zielStadt,ziel.straﬂe as zielStraﬂe,ziel.hausnummer as zielHausnummer,ziel.adresszusatz as zielAdresszusatz, "
							+ "startAdresse.plz as startPlz,startAdresse.stadt as startStadt,startAdresse.straﬂe as startStraﬂe,startAdresse.hausnummer as startHausnummer,startAdresse.adresszusatz as startAdresszusatz, "
							+ "kunde.name, kunde.vorname, kunde.kundenId as kId " + "FROM `auftrag` "
							+ "LEFT JOIN adresse ziel on auftrag.zielAdresseId = ziel.adressId "
							+ "LEFT JOIN kunde on auftrag.kundenId=kunde.kundenId "
							+ "LEFT JOIN adresse startAdresse on auftrag.startAdresseId = startAdresse.adressId "
							+ "WHERE auftrag.auftragId = " + id);
			Map<String, String[]> route = Connector.getQueryResult(
					"SELECT routenId FROM auftragzuroute,auftrag WHERE auftrag.auftragId=auftragzuroute.auftragId AND auftrag.auftragId="
							+ id + " LIMIT 1");
			try {
				Map<String, String> mapResult = new HashMap<String, String>();
				mapResult.put("auftragsnummer", auftrag.get("auftragId")[0]);
				if(auftrag.get("kId")[0]==null) {
					mapResult.put("kunde",null);
				}else {
					mapResult.put("kunde", auftrag.get("name")[0] + ", " + auftrag.get("vorname")[0] + " (ID :"
							+ auftrag.get("kId")[0] + ")");
				}
				mapResult.put("lastChange", auftrag.get("letztesƒnderungsDatum")[0]);
				mapResult.put("fahrtDatum", auftrag.get("datumDerFahrt")[0]);
				mapResult.put("distance", auftrag.get("entfernung")[0]);

				if (route.get("routenId").length != 0)
					mapResult.put("route", route.get("routenId")[0]);
				else
					mapResult.put("route", "Noch nicht verplant");

				mapResult.put("startPlz", auftrag.get("startPlz")[0]);
				mapResult.put("startOrt", auftrag.get("startStadt")[0]);
				mapResult.put("startStraﬂe", auftrag.get("startStraﬂe")[0]);
				mapResult.put("startHausNr", auftrag.get("startHausnummer")[0]);

				mapResult.put("zielPlz", auftrag.get("zielPlz")[0]);
				mapResult.put("zielOrt", auftrag.get("zielStadt")[0]);
				mapResult.put("zielStraﬂe", auftrag.get("zielStraﬂe")[0]);
				mapResult.put("zielHausNr", auftrag.get("zielHausnummer")[0]);
				return mapResult;
			} catch (Exception e) {
				Map<String, String> mapResult = new HashMap<String, String>();
				mapResult.put("auftragsnummer", String.valueOf(id));
				mapResult.put("kunde", " ");
				mapResult.put("lastChange", "");
				mapResult.put("fahrtDatum", "");
				mapResult.put("distance", "");

				mapResult.put("route", "Noch nicht verplant");

				mapResult.put("startPlz", "");
				mapResult.put("startOrt", "");
				mapResult.put("startStraﬂe", "");
				mapResult.put("startHausNr", "");

				mapResult.put("zielPlz", "");
				mapResult.put("zielOrt", "");
				mapResult.put("zielStraﬂe", "");
				mapResult.put("zielHausNr", "");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String[] getCustomers() {
		try {
			Map<String, String[]> kunden = Connector.getQueryResult("SELECT * FROM kunde GROUP BY name,vorname");
			String[] kundenList;
			kundenList = new String[kunden.get("kundenId").length+1];
				kundenList[0]=" ";
				for (int i = 1; i < kundenList.length; i++) {
					kundenList[i-1] = kunden.get("name")[i-1] + ", " + kunden.get("vorname")[i-1] + " (ID :"
							+ kunden.get("kundenId")[i-1] + ")";
				}
			return kundenList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new String[] { "" };
	}

	public boolean saveAuftrag(int id, Map<String, String> data) {
		try {
			Map<String, String[]> auftrag = Connector.getQueryResult(
					"SELECT auftrag.auftragId,auftrag.entfernung,auftrag.datumDerFahrt,auftrag.letztesƒnderungsDatum,auftrag.entfernung,auftrag.startAdresseId,auftrag.zielAdresseId, "
							+ "ziel.plz as zielPlz,ziel.stadt as zielOrt,ziel.straﬂe as zielStreet,ziel.hausnummer as zielHausNr,ziel.adresszusatz as zielAdresszusatz, "
							+ "startAdresse.plz as startPlz,startAdresse.stadt as startOrt,startAdresse.straﬂe as startStreet,startAdresse.hausnummer as startHausNr,startAdresse.adresszusatz as startAdresszusatz, "
							+ "kunde.name, kunde.vorname, kunde.kundenId as kId, startAdresse.lat as startLAT, startAdresse.lon as startLON, ziel.lat as zielLAT, ziel.lon as zielLON, auftrag.dauer AS dauer "
							+ "FROM `auftrag` " + "LEFT JOIN adresse ziel on auftrag.zielAdresseId = ziel.adressId "
							+ "LEFT JOIN kunde on auftrag.kundenId=kunde.kundenId "
							+ "LEFT JOIN adresse startAdresse on auftrag.startAdresseId = startAdresse.adressId "
							+ "WHERE auftrag.auftragId = " + id);

			// getKunden
			String kundenString = data.get("kunde");
			int kundenId= this.getKundenId(kundenString);
			
			
			double startLAT = 0;
			double startLON = 0;
			double zielLAT = 0;
			double zielLON = 0;
			if (!(auftrag.get("startLAT")[0] == null))
				startLAT = Double.parseDouble(auftrag.get("startLAT")[0]);
			if (!(auftrag.get("startLON")[0] == null))
				startLON = Double.parseDouble(auftrag.get("startLON")[0]);
			if (!(auftrag.get("zielLAT")[0] == null))
				zielLAT = Double.parseDouble(auftrag.get("zielLAT")[0]);
			if (!(auftrag.get("zielLON")[0] == null))
				zielLON = Double.parseDouble(auftrag.get("zielLON")[0]);

			double entfernung = Double.parseDouble(auftrag.get("entfernung")[0]);
			double dauer = 0;
			if (!(auftrag.get("dauer")[0] == null))
				dauer = Double.parseDouble(auftrag.get("dauer")[0]);
					
			boolean startChanged = false;
			boolean zielChanged = false;

			// Adresse nur speichern wenn ƒndererung(start)
			int startAdressId;
			if (auftrag.get("startAdresseId")[0] == null)
				startAdressId = -1;
			else
				startAdressId = Integer.parseInt(auftrag.get("startAdresseId")[0]);

			if (hasChanged(data, auftrag, "startPlz") || hasChanged(data, auftrag, "startOrt")
					|| hasChanged(data, auftrag, "startStreet") || hasChanged(data, auftrag, "startHausNr")) {
				startChanged = true;

				String startLATString = "NULL";
				String startLONString = "Null";
				if (!data.get("startPlz").isEmpty() && !data.get("startOrt").isEmpty()
						&& !data.get("startStreet").isEmpty() && !data.get("startHausNr").isEmpty()) {
					JSONArray coords = Requesthandler.getGeocoding(
							data.get("startHausNr") + " " + data.get("startStreet") + ", " + data.get("startOrt"));
					startLAT = coords.getDouble(0);
					startLON = coords.getDouble(1);
					startLATString = String.valueOf(coords.getDouble(0));
					startLONString = String.valueOf(coords.getDouble(1));
				} else {
					startChanged = false;
				}

				int startAdressIdTmp = Connector
						.insertIntoTable("INSERT INTO `adresse`(`plz`, `stadt`, `straﬂe`, `hausnummer`,`lat`,`lon`) "
								+ "VALUES('" + data.get("startPlz") + "','" + data.get("startOrt") + "','"
								+ data.get("startStreet") + "','" + data.get("startHausNr") + "','" + startLATString
								+ "','" + startLONString + "')");
				if (startAdressIdTmp != -1)
					startAdressId = startAdressIdTmp;
			}

			// Adresse nur speichern wenn ƒndererung(ziel)
			int zielAdressId;
			if (auftrag.get("zielAdresseId")[0] == null)
				zielAdressId = -1;
			else
				zielAdressId = Integer.parseInt(auftrag.get("zielAdresseId")[0]);

			if (hasChanged(data, auftrag, "zielPlz") || hasChanged(data, auftrag, "zielOrt")
					|| hasChanged(data, auftrag, "zielStreet") || hasChanged(data, auftrag, "zielHausNr")) {
				zielChanged = true;

				String zielLATString = "NULL";
				String zielLONString = "Null";
				if (!data.get("zielPlz").isEmpty() && !data.get("zielOrt").isEmpty()
						&& !data.get("zielStreet").isEmpty() && !data.get("zielHausNr").isEmpty()) {
					JSONArray coords = Requesthandler.getGeocoding(
							data.get("zielHausNr") + " " + data.get("zielStreet") + ", " + data.get("zielOrt"));
					zielLAT = coords.getDouble(0);
					zielLON = coords.getDouble(1);
					zielLATString = Double.toString(zielLAT);
					zielLONString = Double.toString(zielLON);
				} else {
					zielChanged = false;
				}

				int zielAdressIdTmp = Connector
						.insertIntoTable("INSERT INTO `adresse`(`plz`, `stadt`, `straﬂe`, `hausnummer`,`lat`,`lon`) "
								+ "VALUES('" + data.get("zielPlz") + "','" + data.get("zielOrt") + "','"
								+ data.get("zielStreet") + "','" + data.get("zielHausNr") + "','" + zielLATString
								+ "','" + zielLONString + "')");
				if (zielAdressIdTmp != -1)
					zielAdressId = zielAdressIdTmp;
			}

			// Gecoding f¸r entfernung benutzen
			if (zielChanged || startChanged) {
				JSONObject request=Requesthandler.getSummary(startLAT, startLON, zielLAT, zielLON);
				entfernung = request.getDouble("distance");
				dauer = request.getDouble("duration");
			}

			//Datum anpassen //2019-02-27 12:36:07
			String datum = "Null";
			if (data.get("fahrtDatum").isEmpty() || data.get("fahrtDatum") == null) {
				this.fehlermeldung = "Es muss ein FahrtDatum angegeben werden";
				return false;
			}
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date date = sdf.parse(data.get("fahrtDatum"));
				datum = data.get("fahrtDatum");
			}catch(java.text.ParseException e) {
				this.fehlermeldung = "Falsches Datums Format(yyyy-MM-dd HH:mm:ss)";
				return false;
			}
			
			// speicher alles auf dem Auftrag
			Connector.updateTable("UPDATE auftrag a SET " + "`zielAdresseId`='" + zielAdressId + "',"
					+ "`startAdresseId`='" + startAdressId + "'," + "`kundenId`='" + kundenId + "'," + "`entfernung`='"
					+ entfernung + "'," + "`datumDerFahrt`='" + datum + "', `dauer`= " + dauer + " " + "WHERE a.auftragId = " + id);
			return true;
		} catch (SQLException | JSONException e) {
			e.printStackTrace();
			this.fehlermeldung="Es war nicht mˆglich den Auftrag zu speichern";
		}
		return false;
	}

	public Map<String, String> getCustomerAdress(int id) {
		try {
			Map<String, String[]> kunde = Connector.getQueryResult("SELECT * FROM kunde k, adresse a WHERE k.kundenId = " + id + " AND k.adressId=a.adressId");
			Map<String, String> data = new HashMap<String, String>();
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
			return Connector.insertIntoTable(
					"INSERT INTO `auftrag` (`auftragId`, `zielAdresseId`, `startAdresseId`, `kundenId`, `entfernung`, `datumDerFahrt`) VALUES (NULL, NULL, NULL, NULL, 0, NULL)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	public void deleteAuftrag(int id) {

		try {
			Map<String, String[]> result = Connector
					.getQueryResult("SELECT datumDerFahrt FROM auftrag WHERE auftragId=" + id);
			if (result.get("datumDerFahrt")[0] == null) {
				Connector.deleteRecordFromTable("DELETE FROM `auftrag` WHERE auftragId = " + id);
				return;
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			for (int i = 0; i < result.get("datumDerFahrt").length; i++) {
				Date date = sdf.parse(result.get("datumDerFahrt")[i]);
				if (date.getTime() > System.currentTimeMillis())
					return;
			}
			Connector.deleteRecordFromTable("DELETE FROM `auftrag` WHERE auftragId = " + id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private boolean hasChanged(Map<String, String> data, Map<String, String[]> query, String key) {
		return !data.get(key).equals(query.get(key)[0]);
	}

	public String getFehlermeldung() {
		String tmpFehlermeldung = this.fehlermeldung;
		this.fehlermeldung = "";
		return tmpFehlermeldung;
	}
	public int getKundenId(String kundenString) {
		if(kundenString==null) {
			this.fehlermeldung="Zuerst einen Kunden ausw‰hlen";
			return -1;
		}
		int idPosStart = kundenString.indexOf("(ID :") + 5;
		int idPosEnd = kundenString.indexOf(")");
		return Integer.parseInt(kundenString.substring(idPosStart, idPosEnd));
	}
}