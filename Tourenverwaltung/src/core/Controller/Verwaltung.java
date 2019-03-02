package core.Controller;

import core.View.View;

/**
 * Main-Controller-Class. Verwaltet die anderen Controller
 *
 */
public class Verwaltung {
	private View window;
	private Route route;
	private Auftrag auftrag;
	private Fahrer fahrer;
	private Standort standort;
	private Fahrzeug fahrzeug;
	private Kunde kunde;
	
	public Verwaltung() {
		window = new View();
		
		initController();	
		
		//Macht Fenster jetzt erst sichtbar, da es vorher initialisiert wird
		window.setVisible(true);
	}
	
	/**
	 * Initialisierung der Controller
	 */
	private void initController()
	{
		route = new Route();
		auftrag = new Auftrag();
		fahrer = new Fahrer();
		standort = new Standort();
		fahrzeug = new Fahrzeug();
		kunde = new Kunde();
		
		
		addTabs();
	}
	/**
	 * Hinzufügen der einzelnen Tabs(Views) der einzelnen Controller
	 */
	private void addTabs()
	{
		window.addTabbedPaneTab("Routenverwaltung", route.getPanel());
		window.addTabbedPaneTab("Auftragsverwaltung", auftrag.getPanel());
		window.addTabbedPaneTab("Kundenverwaltung", kunde.getPanel());
		window.addTabbedPaneTab("Fahrerverwaltung", fahrer.getPanel());
		window.addTabbedPaneTab("Fahrzeugverwaltung", fahrzeug.getPanel());
		window.addTabbedPaneTab("Standortverwaltung", standort.getPanel());
		window.addTabbedPaneTab("Standortverwaltung", standort.getPanel());
		
	}
		
}


