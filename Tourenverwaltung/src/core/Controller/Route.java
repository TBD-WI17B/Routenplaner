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
		
		//bind Handler
		
		
		//Preload
		view.updateListeRoute(model.getRoutenList());
		view.updateListeAuftraege(model.getAuftraegeList());
		view.updateListeFahrer(model.getFahrerList());
	}
	public JPanel getPanel()
	{
		return view.getSubPanel();
	}
}
