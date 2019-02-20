package core.Controller;



import javax.swing.JPanel;

import core.Model.Kunde;
import core.View.View_Kunde;

public class kundenController extends Controller{
	
	private View_Kunde window;
	private Kunde kunde;
	
	public kundenController() {
		window = new View_Kunde();
		kunde = new Kunde();
		window.setVisible(true);//Macht Fenster jetzt erst sichtbar, da es vorher initialisiert wird
		
		
		window.updateList(kunde.getListNames());
	}
	
	@Override
	public JPanel getView() {
		
		return window;
	}
	
	//Hier kommen die ganzen Button Listener hin
}
