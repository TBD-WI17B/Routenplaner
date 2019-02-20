package core.Controller;

import javax.swing.JPanel;

import core.Model.Model_Route;
import core.View.View_Route;

public class Route {
	
	private View_Route view;
	private Model_Route model;

	public Route() {
		this.view = new View_Route();
		this.model = new Model_Route();
	}
	public JPanel getPanel()
	{
		return view.getSubPanel();
	}
}
