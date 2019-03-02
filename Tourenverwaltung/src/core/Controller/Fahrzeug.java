package core.Controller;

import javax.swing.JPanel;

import core.Model.Model_Fahrzeug;
import core.View.View_Fahrzeug;
 /**
  * Controller-Class für die Fahrzeugverwaltung
  * @author Manuel
  *
  */
public class Fahrzeug {
	private View_Fahrzeug view;
	private Model_Fahrzeug model;

	public Fahrzeug() {
		this.view = new View_Fahrzeug();
		this.model = new Model_Fahrzeug();
	}
	public JPanel getPanel()
	{
		return view.getSubPanel();
	}
}
