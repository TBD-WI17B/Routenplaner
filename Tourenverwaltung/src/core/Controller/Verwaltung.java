package core.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Model.Model;
import core.View.View;

public class Verwaltung {

	private View window;
	private Model model;
	private JSONParser parser;
	
	public Verwaltung(View v, Model m) {
		this.model = m;
		this.window = v;
		this.parser = new JSONParser();
		
		bindHandler();
		
	}
	
	/**
	 * 
	 * Fügt den Komponenten Eventhandler hinzu.
	 * @author Manuel
	 */
	private void bindHandler()
	{
		window.addTesthandler(new testHandler());
	}
	
	/**
	 * Eventhandler für den Testbereich.
	 * @author Manuel
	 *
	 */
	class testHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			window.setTest(parser.getJSONfromURL("https://jsonplaceholder.typicode.com/todos/1").toString());			
		}
	}

}


