package core.Model;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import core.Controller.Connector;

public class Model_Route {

	public Model_Route() {
		
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
			int id = Integer.parseInt(result.get("fahrzeugId")[0]);
			return id; 
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
			Map<String,String[]> result = Connector.getQueryResult("SELECT MAX(position) FROM auftragzuroute WHERE routenId ="+routenId);
			int pos = Integer.parseInt(result.get("position")[0]) +1 ;
			return Connector.insertIntoTable(
					"INSERT INTO `auftragzuroute` (`routenId`, `auftragId`, `position`,`entfernung`) VALUES (`"+routenId+"`, `"+auftragId+"`, "+pos+", NULL)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	public void removeAuftrag(int auftragId) {
		try {
			Connector.deleteRecordFromTable(
					"DELETE FROM `auftragzuroute` WHERE routeId = " + auftragId);
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
		return null;
	}
	public int berechneEntfernungen(int routenId) {
		return -1;
	}
	public double berechneDauer(int routenId) {
		return -1;
	}
	
	
	
}
