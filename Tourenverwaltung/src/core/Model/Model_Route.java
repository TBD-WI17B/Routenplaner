package core.Model;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import core.Controller.Connector;
import core.Controller.Requesthandler;

public class Model_Route {

	private DecimalFormat df;
	public Model_Route() {
		df = new DecimalFormat("0.00");
	}
	public String[] getRoutenList() {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT routenId FROM route");
			String[] ids = result.get("routenId");
			return ids; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public String[] getFahrerList() {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT * FROM fahrer");
			String[] fahrer = new String[result.get("fahrerId").length];
			for (int i = 0; i < fahrer.length; i++) {
				fahrer[i] = result.get("fahrerId")[i] + ", " + result.get("name")[i];
			}
			return fahrer; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public String[] getAuftraegeList(int newIndex) {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT auftragId FROM auftragzuroute WHERE routenId = "+newIndex+";");
			String[] ids = result.get("auftragId");
			return ids; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public String[] getFahrzeugeList() {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT fahrzuegId FROM fahrzeug");
			String[] ids = result.get("fahrzuegId");
			return ids; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public String getFahrer(int routenId) {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT * FROM fahrer LEFT JOIN route on fahrer.fahrerId = route.fahrerId WHERE routenId = " +routenId);
			return new String(result.get("fahrerId")[0]+", "+result.get("name")[0]);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public int getFahrzeug(int routenId) {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT fahrzeugId FROM route WHERE routenId = " +routenId);
			if(result.get("fahrzeugId")[0] == null) return -1;
			else return Integer.parseInt(result.get("fahrzeugId")[0]); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	public int addRoute() {
		try {
			return Connector.insertIntoTable(
					"INSERT INTO `route` (`routenId`, `fahrerId`, `fahrzeugId`) VALUES (NULL, NULL, NULL)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	public void deleteRoute(int routeId) {
		try {
			Connector.deleteRecordFromTable(
					"DELETE FROM `route` WHERE routenId = " + routeId);
			Connector.deleteRecordFromTable(
					"DELETE FROM `auftragzuroute` WHERE routenId = " + routeId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public int addAuftrag(int routenId, int auftragId) {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT MAX(position) AS position FROM auftragzuroute WHERE routenId ="+routenId);
			int pos;
			if(result.get("position")[0] == null || result == null) pos = 0;
			else pos = Integer.parseInt(result.get("position")[0]) +1 ;
			
			String query = "INSERT INTO `auftragzuroute` (`routenId`, `auftragId`, `position`,`entfernung`) VALUES ("+routenId+", "+auftragId+", "+pos+", NULL)";
			System.out.println(query);
			return Connector.insertIntoTable(query);
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	public Map<String, String[]> getFreieAuftraege() {
		try {
			return Connector.getQueryResult("SELECT * FROM auftrag WHERE auftragId NOT IN (SELECT auftragId FROM auftragzuroute)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public void removeAuftrag(int auftragId, int routenId) {
		try {
			Connector.deleteRecordFromTable(
					"DELETE FROM `auftragzuroute` WHERE routenId = " + routenId+" AND auftragId = "+auftragId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void updateFahrer(int fahrerId, int routenId) {
		try {
			Connector.updateTable(
					"UPDATE `route` SET `fahrerId` = "+fahrerId+" WHERE `routenId`="+routenId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void updateFahrzeug(int fahrzeugId, int routenId) {
		try {
			Connector.updateTable(
					"UPDATE  `route` SET `fahrzeugId` = "+fahrzeugId+" WHERE `routenId`="+routenId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Map<String,String> getRouteData(int routenId) {
		Map<String,String> data = new HashMap<String,String>();
		data.put("routenId", ""+routenId);
		data.put("fahrerId", this.getFahrer(routenId));
		data.put("duration", ""+this.berechneDauer(routenId));
		data.put("distance", ""+this.berechneEntfernungen(routenId));
		data.put("fahrzeug", ""+this.getFahrzeug(routenId));
		return data;
	}
	public double berechneEntfernungen(int routenId) {
		try {
			Map<String,String[]> auftrag = Connector.getQueryResult("SELECT entfernung FROM auftrag WHERE auftragId IN (SELECT auftragId FROM auftragzuroute WHERE routenId = "+routenId+") ");
			double sum = 0;
			for (String entfernung : auftrag.get("entfernung")) {
				if(entfernung != null)sum = sum + Double.parseDouble(entfernung);
			}
			return Math.round(sum/1000);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 500;
	}
	public double berechneDauer(int routenId) {
		try {
			Map<String,String[]> auftrag = Connector.getQueryResult("SELECT dauer FROM auftrag WHERE auftragId IN (SELECT auftragId FROM auftragzuroute WHERE routenId = "+routenId+") ");
			double sum = 0;
			for (String dauer : auftrag.get("dauer")) {
				if(dauer != null)sum = sum + Double.parseDouble(dauer);
			}
			return Math.round(sum/60);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 26;
	}
	public void generateRoutes() {
		try {
			//der nächste auszuführende, noch nicht zu geteilte Auftrag finden
			Map<String,String[]> auftrag = Connector.getQueryResult("SELECT auftragId, lat as startLAT, lon as startLON, datumDerFahrt, dauer FROM auftrag LEFT JOIN adresse on adresse.adressId = auftrag.startAdresseId WHERE auftragId NOT IN (SELECT auftragId FROM auftragzuroute) ORDER BY datumDerFahrt asc");
			if(auftrag.get("auftragId").length == 0) return;
			
			//Alle Standorte holen
			Map<String,String[]> standort = Connector.getQueryResult("SELECT standortId, lat, lon FROM standort LEFT JOIN adresse a on a.adressId = standort.adressId");
			
			double[] startLATStandort = new double[standort.get("lat").length];
			double[] startLONStandort = new double[standort.get("lon").length];
			
			for(int i=0; i < standort.get("standortId").length;i++) {
				startLATStandort[i] = Double.parseDouble(standort.get("lat")[i]);
				startLONStandort[i] = Double.parseDouble(standort.get("lat")[i]);
			}
			
			//Nächster Standort finden
			JSONObject entfernung = Requesthandler.getMatrix(Double.parseDouble(auftrag.get("startLAT")[0]), Double.parseDouble(auftrag.get("startLON")[0]), startLATStandort, startLONStandort);
			double lowestDis = 999999999;
			int lowsetDisId= 0;
			for(int i=1; i < entfernung.getJSONArray("distances").getJSONArray(0).length() ; i++) {
				double tmp = Double.parseDouble(entfernung.getJSONArray("distances").getJSONArray(0).get(i).toString());
				if( tmp < lowestDis) {
					lowestDis = tmp;
					lowsetDisId = i;
				}
			}
			
			//Aufträge am selbern Tag finden
			String queryDate = auftrag.get("datumDerFahrt")[0].substring(0, 10)+"%";
			String query = "SELECT auftragId, lat as startLAT, lon as startLON, datumDerFahrt, dauer FROM auftrag LEFT JOIN adresse on adresse.adressId = auftrag.startAdresseId WHERE auftragId NOT IN (SELECT auftragId FROM auftragzuroute) AND datumDerFahrt like '"+queryDate+"' ORDER BY datumDerFahrt asc";
			System.out.println(query);
			Map<String,String[]> sameDayAuftraege = Connector.getQueryResult(query);
			
			//Routen Hinzufügen
			this.addRoute();
			int highestRouteId = Integer.parseInt(Connector.getQueryResult("SELECT Max(routenId) FROM route").get("Max(routenId)")[0]);
			//erster auftrag
			this.addAuftrag(highestRouteId, Integer.parseInt(auftrag.get("auftragId")[0]));
			
			if(sameDayAuftraege != null && sameDayAuftraege.get("auftragId").length >1) {
								
				
				double[] startLAT = new double[sameDayAuftraege.get("startLAT").length-1];
				double[] startLON = new double[sameDayAuftraege.get("startLON").length-1];
				
				//zu weit erntfernte nicht (nur zum ersten Auftrag). rekursion möglich, aber...
				for(int i=0; i < sameDayAuftraege.get("auftragId").length-1;i++) {
					startLAT[i] = Double.parseDouble(sameDayAuftraege.get("startLAT")[i]);
					startLON[i] = Double.parseDouble(sameDayAuftraege.get("startLON")[i]);
				}
				entfernung = Requesthandler.getMatrix(Double.parseDouble(auftrag.get("startLAT")[0]), Double.parseDouble(auftrag.get("startLON")[0]), startLAT, startLON);
				for(int i=1; i < entfernung.getJSONArray("distances").getJSONArray(0).length() ; i++) {
					double tmp = Double.parseDouble(entfernung.getJSONArray("distances").getJSONArray(0).get(i).toString());
					System.out.println(tmp);
					if( tmp < 50000) {
						this.addAuftrag(highestRouteId, Integer.parseInt(sameDayAuftraege.get("auftragId")[i]));
					}
				}
				
			}
			//fahrzeug und Fahrer hinzugefügt. dadurch keine Fehler
			this.updateFahrer(1, highestRouteId);
			this.updateFahrzeug(1, highestRouteId);
			
			
			
		} catch (SQLException | JSONException e) {
			e.printStackTrace();
		}
		generateRoutes();
	}
	
	
	
}
