package core.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.SwingWorker;

import core.Model.Model_View;
import core.View.View;

public class Verwaltung {

	private View window;
	private Model_View model;
	private JSONParser parser;
	private Route route;
	private Auftrag auftrag;
	private Fahrer fahrer;
	private Standort standort;
	private Fahrzeug fahrzeug;
	private Kunde kunde;
	
	public Verwaltung() {
		model = new Model_View();//Bis jetzt nicht benutzt??
		window = new View(model);	
		
		route = new Route();
		auftrag = new Auftrag();
		fahrer = new Fahrer();
		standort = new Standort();
		fahrzeug = new Fahrzeug();
		kunde = new Kunde();
		
		this.parser = new JSONParser();		
		bindHandler();
		
		
		window.addTabbedPaneTab("Routenverwaltung", route.getPanel());
		window.addTabbedPaneTab("Auftragsverwaltung", auftrag.getPanel());
		window.addTabbedPaneTab("Kundenverwaltung", kunde.getPanel());
		window.addTabbedPaneTab("Fahrerverwaltung", fahrer.getPanel());
		window.addTabbedPaneTab("Fahrzeugverwaltung", fahrzeug.getPanel());
		window.addTabbedPaneTab("Standortverwaltung", standort.getPanel());
		

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
		window.bindTesthandler(new testHandler());
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


