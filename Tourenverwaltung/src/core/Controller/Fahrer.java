package core.Controller;

import javax.swing.JPanel;

import core.Model.Model_Fahrer;
import core.View.View_Fahrer;

/**
 * Controller-Class für die Fahrerverwaltung.
 * @author Manuel
 *
 */
public class Fahrer {
	private View_Fahrer view;
	private Model_Fahrer model;

	public Fahrer() {
		this.view = new View_Fahrer();
		this.model = new Model_Fahrer();
	}
	public JPanel getPanel()
	{
		return view.getSubPanel();
	}
}
