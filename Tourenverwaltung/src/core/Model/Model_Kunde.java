package core.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
}
