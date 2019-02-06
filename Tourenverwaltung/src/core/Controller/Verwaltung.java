package core.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingWorker;

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
	 * Eventhandler für den Testbereich. Ruft eine Test URL auf und parst das erhaltene JSON in einen String. 
	 * Gibt String in den TextArea aus. Aufruf erfolgt asynchron.
	 * @author Manuel
	 *
	 */
	class testHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			new SwingWorker<Void, Void>() {
				protected Void doInBackground() throws Exception {
					window.setTest(parser.getJSONfromURL("https://jsonplaceholder.typicode.com/todos/1").toString());
					return null;
				}
				protected void done() {					
				}				
			}.execute();						
		}
	}

}


