package core.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.SwingWorker;

import core.Model.Model;
import core.View.View;

public class Verwaltung {

	private View window;
	private Model model;
	private JSONParser parser;
	//private Connector sql;
	
	public Verwaltung() {
		Model model = new Model();//Bis jetzt nicht benutzt??
		View window = new View(model);	
	
		this.parser = new JSONParser();		
		bindHandler();
		
		testSQL();
		window.setVisible(true);//Macht Fenster jetzt erst sichtbar, da es vorher initialisiert wird
	}
	
	private void testSQL()
	{
		//ResultSet rs = Connector.test("SELECT * From test");
		
		try {
			ResultSet rs = Connector.test("SELECT * From test");
			String str = "";
			for(int i = 0; rs.next();i++)
			{
				str = str + rs.getString("content");
			}
			System.out.println("test: " + str);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 * Fügt den Komponenten Eventhandler hinzu.
	 * @author Manuel
	 */
	private void bindHandler()
	{
		window.addTesthandler(new testHandler());
	}
	
	/**
	 * Eventhandler für den Testbereich. Ruft eine Test URL auf und parst das erhaltene JSON in einen String. 
	 * Gibt String in den TextArea aus. Aufruf erfolgt asynchron.
	 * @author Manuel
	 *
	 */
	class testHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			new SwingWorker<Void, Void>() {
				@Override
				protected Void doInBackground() throws Exception {
					//window.setTest(parser.getJSONfromURL("https://jsonplaceholder.typicode.com/todos/1").toString());
					window.setTest(parser.getJSONfromURL("https://api.openrouteservice.org/directions?api_key=5b3ce3597851110001cf62480ff1ca98a26c4b13a279928bac75350b&coordinates=8.34234,48.23424%7C8.34423,48.26424&profile=driving-car").toString());
					return null;
				}
				@Override
				protected void done() {					
				}				
			}.execute();						
		}
	}

}


