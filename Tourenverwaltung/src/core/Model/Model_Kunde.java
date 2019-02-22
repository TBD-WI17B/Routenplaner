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
			ResultSet rs = Connector.test("SELECT kundenId FROM Kunde");
			ArrayList<String> list = new ArrayList();
			int i=0;
			while(rs.next()) {
				list.add(rs.getString("kundenId"));
				i++;
			}
			return list.toArray(new String[0]);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Map<String,String> getDataFromCustomer(int id) {
		try {
			Map<String,String[]> result = Connector.getQueryResult("SELECT * FROM kunde k, adresse a WHERE k.kundenId = "+id+" AND k.addresId=a.adressId");
			System.out.println(result.get("name")[0]);
			Map<String,String> mapResult = new HashMap<String, String>();
			mapResult.put("name",result.get("name")[0]);
			mapResult.put("vorname",result.get("name")[0]);
			mapResult.put("plz",result.get("plz")[0]);
			mapResult.put("ort",result.get("name")[0]);
			mapResult.put("straﬂe",result.get("name")[0]);
			mapResult.put("Hausnr",result.get("name")[0]);
			mapResult.put("telefon",result.get("name")[0]);
			mapResult.put("mobil",result.get("name")[0]);
			mapResult.put("kundenid",result.get("name")[0]);
			mapResult.put("handicap",result.get("name")[0]);
			return mapResult;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
