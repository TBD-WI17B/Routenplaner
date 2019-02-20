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
	private Route route;
	private Auftrag auftrag;
	private Fahrer fahrer;
	private Standort standort;
	private Fahrzeug fahrzeug;
	private Kunde kunde;
	private Test test;
	
	public Verwaltung() {
		model = new Model_View();//Bis jetzt nicht benutzt??
		window = new View(model);
		
		initController();	

		window.setVisible(true);//Macht Fenster jetzt erst sichtbar, da es vorher initialisiert wird
	}
	
	private void initController()
	{
		route = new Route();
		auftrag = new Auftrag();
		fahrer = new Fahrer();
		standort = new Standort();
		fahrzeug = new Fahrzeug();
		kunde = new Kunde();
		
		/*Tab fuer Testzwecke */
		test = new Test();
		
		addTabs();
	}
	private void addTabs()
	{
		window.addTabbedPaneTab("Routenverwaltung", route.getPanel());
		window.addTabbedPaneTab("Auftragsverwaltung", auftrag.getPanel());
		window.addTabbedPaneTab("Kundenverwaltung", kunde.getPanel());
		window.addTabbedPaneTab("Fahrerverwaltung", fahrer.getPanel());
		window.addTabbedPaneTab("Fahrzeugverwaltung", fahrzeug.getPanel());
		window.addTabbedPaneTab("Standortverwaltung", standort.getPanel());
		window.addTabbedPaneTab("Standortverwaltung", standort.getPanel());
		
		/*Tab fuer Testzwecke */
		window.addTabbedPaneTab("Test", test.getPanel());
	}

}


