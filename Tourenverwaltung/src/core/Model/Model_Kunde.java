package core.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import core.Controller.Connector;

public class Model_Kunde {

	
	public Model_Kunde() {
		
	}
	
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
	
	public Map<String,String> getDataFromCustomer(int id) {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT * FROM kunde k, adresse a WHERE k.kundenId = "+id+" AND k.adressId=a.adressId");
			Map<String,String> mapResult = new HashMap<String, String>();
			mapResult.put("name",result.get("name")[0]);
			mapResult.put("vorname",result.get("vorname")[0]);
			mapResult.put("plz",result.get("plz")[0]);
			mapResult.put("ort",result.get("stadt")[0]);
			mapResult.put("straﬂe",result.get("straﬂe")[0]);
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
}
