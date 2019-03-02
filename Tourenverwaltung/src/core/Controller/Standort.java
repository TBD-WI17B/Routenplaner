package core.Controller;

import javax.swing.JPanel;

import core.Model.Model_Standort;
import core.View.View_Standort;

/**
 * Controller-Class der Standortverwaltung
 *
 */
public class Standort {
	private View_Standort view;
	private Model_Standort model;

	public Standort() {
		this.view = new View_Standort();
		this.model = new Model_Standort();
	}
	public JPanel getPanel()
	{
		return view.getSubPanel();
	}
}
