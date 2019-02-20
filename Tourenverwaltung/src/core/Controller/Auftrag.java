package core.Controller;

import javax.swing.JPanel;

import core.Model.Model_Auftrag;
import core.View.View_Auftrag;

public class Auftrag {
	private View_Auftrag view;
	private Model_Auftrag model;

	public Auftrag() {
		this.view = new View_Auftrag();
		this.model = new Model_Auftrag();
	}
	public JPanel getPanel()
	{
		return view.getSubPanel();
	}
}
