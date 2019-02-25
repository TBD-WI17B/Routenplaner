package core.Model;

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
			String[] ids = result.get("name");
			return ids; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public String[] getAuftraegeList() {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT auftragId FROM auftrag");
			String[] ids = result.get("auftragId");
			return ids; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
