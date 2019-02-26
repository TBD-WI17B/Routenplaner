package core.Model;

import java.sql.SQLException;
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
			Map<String,String[]> result = Connector.getQueryResult("SELECT name FROM fahrer");
			String[] namen = result.get("name");
			return namen; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public String[] getAuftraegeList(String routenId) {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT auftragId FROM auftragzuroute WHERE routenId = "+routenId+";");
			String[] ids = result.get("auftragId");
			return ids; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public String getFahrer(String routenId) {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT fahrerId FROM route WHERE routenId = "+routenId+";");
			String id = result.get("fahrerId")[0];
			return id; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public String[] getFahrzeuge() {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT fahrzuegId FROM fahrzeug");
			String[] ids = result.get("fahrzuegId");
			return ids; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
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
	public int deleteRoute() {
		return -1;
	}
	public int addAuftrag(int routenId, int auftragId, int pos) {
		try {
			return Connector.insertIntoTable(
					"INSERT INTO `auftragzuroute` (`routenId`, `auftragId`, `position`,`entfernung`) VALUES (`"+routenId+"`, `"+auftragId+"`, "+pos+", NULL)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	public int removeAuftrag() {
		return -1;
	}
	public int updateFahrer() {
		return -1;
	}
	public void getRouteData() {
		
	}
	
	
	
	
}
