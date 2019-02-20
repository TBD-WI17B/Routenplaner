package core.Controller;

import javax.swing.JPanel;

import core.Model.Model_Kunde;
import core.View.View_Kunde;

public class Kunde {
	private View_Kunde view;
	private Model_Kunde model;

	public Kunde() {
		this.view = new View_Kunde();
		this.model = new Model_Kunde();
	}
	public JPanel getPanel()
	{
		return view.getSubPanel();
	}
}
