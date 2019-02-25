package core.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.SwingWorker;

import core.Model.Model_Test;
import core.View.View_Test;

public class Test {

	private View_Test view;
	private Model_Test model;	
	private JSONParser parser;
	
	public Test() {
		this.view = new View_Test();
		this.model = new Model_Test();
		
		view.addTestListHandler(new testListHandler());
	}
	
	
	public JPanel getPanel()
	{
		return view.getSubPanel();
	}
	
	
	/**
	 * Eventhandler für den Testbereich. Ruft eine Test URL auf und parst das erhaltene JSON in einen String. 
	 * Gibt String in den TextArea aus. Aufruf erfolgt asynchron.
	 * @author Manuel
	 *
	 */
	class testHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			new SwingWorker<Void, Void>() {
				@Override
				protected Void doInBackground() throws Exception {
					//window.setTest(parser.getJSONfromURL("https://jsonplaceholder.typicode.com/todos/1").toString());
					view.setTestTA(parser.getJSONfromURL("https://api.openrouteservice.org/directions?api_key=5b3ce3597851110001cf62480ff1ca98a26c4b13a279928bac75350b&coordinates=8.34234,48.23424%7C8.34423,48.26424&profile=driving-car").toString());
					return null;
				}
				@Override
				protected void done() {					
				}				
			}.execute();						
		}
	}
	class testListHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//view.addListElement("Hallo");
			
			
		}
		
	}
}
