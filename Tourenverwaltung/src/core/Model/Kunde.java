package core.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import core.Controller.Connector;



public class Kunde {
	ArrayList<Kunde> kundenlist = new ArrayList<>();
	
	//Alle Kunden laden
	public Kunde() {
		
	
	}

	public String[] getListNames() {
		//Query und nur Nummer
		try {
			ResultSet count = Connector.test("SELECT count(kundenId) as count From Kunde");
			count.next();
			String[] names =new String[Integer.parseInt(count.getString("count"))];
			
			ResultSet rs = Connector.test("SELECT kundenId From Kunde");
			int i=0;
			while(rs.next()) {
				names[i] = rs.getString("kundenId");
				i++;
			}
			return names;
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//Einzelnen Kunden laden
	public Kunde(int id) {
		System.out.println("Neuer Kunde angelegt");
	}
	
	public boolean neuerKunde() {
		kundenlist.add(new Kunde(getLastKundenListenId()));
		return true;
	}
	
	public int getLastKundenListenId() {
		return kundenlist.size();
	}
}
