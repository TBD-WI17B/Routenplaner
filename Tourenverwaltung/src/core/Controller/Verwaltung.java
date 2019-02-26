package core.Controller;

import core.View.View;

public class Verwaltung {
	//TODO beim Wechsel vom Tab muss ein Preload von den Tabs gemacht werden
	private View window;
	private Route route;
	private Auftrag auftrag;
	private Fahrer fahrer;
	private Standort standort;
	private Fahrzeug fahrzeug;
	private Kunde kunde;
	private Test test;
	
	public Verwaltung() {
		window = new View();
		
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


