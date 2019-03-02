package core.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JList;
import javax.swing.JPanel;

import core.Model.Model_Kunde;
import core.View.View_Kunde;

/**
 * Controller-Class f�r die Kundenverwaltung
 *
 */
public class Kunde {
	private View_Kunde view;
	private Model_Kunde model;

	/**
	 * Konstruktor. Generiert dieView und Model der Kundenverwaltung.
	 * Bindet die Eventhandler an die GUI-Elemente.
	 * L�dt vorab Daten und aktualisiert die GUI.
	 */
	public Kunde() {
		this.view = new View_Kunde();
		this.model = new Model_Kunde();
		
		//Listeners binden
		view.addListHandler(new ListSelectionHandler(model,view));
		view.addSavingListener(new saveAction(model, view));
		view.addAddingListener(new newAction(model,view));
		view.addDeletingListener(new deleteAction(model,view));
		view.addResetListener(new abbruchAction(model,view));
		
		//Preload
		String[] list = this.model.getList();
		this.view.updateList(list);
		if(list.length>0) {
			this.view.setListSelectionOn(0);
			this.view.updateGUIFromCustomer(this.model.getDataFromCustomer(Integer.parseInt(list[0])));
		} 
	}
	
	public JPanel getPanel()
	{
		return view.getSubPanel();
	}
}
/**
 * Eventhandler f�r die Aushwal eines Kunden aus der Liste
 * Aktualisiert die Daten und Darstellung der GUI mit den Daten des ausgew�hlten Kunden.
 *
 */
class ListSelectionHandler implements MouseListener{
	private int lastIndex=0;
	Model_Kunde model;
	View_Kunde view;
	public ListSelectionHandler(Model_Kunde model,View_Kunde view) {
		this.model = model;
		this.view = view;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		JList list = (JList) e.getSource();
		int newIndex = Integer.parseInt((String) list.getSelectedValue());
		if(lastIndex==newIndex)return;
		view.updateGUIFromCustomer(model.getDataFromCustomer(newIndex));
		lastIndex = newIndex;
	}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
}
/**
 * Eventhandler f�r die ge�nderten Kundendaten.
 *
 */
class saveAction implements ActionListener{
	View_Kunde view;
	Model_Kunde model;
	public saveAction(Model_Kunde model, View_Kunde view) {
		this.view = view;
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int id = view.getCurrentSelectedCustomerId();
		if(id==-1)return;
		model.saveCustomer(id,view.getData());
	}
	
}
/**
 * Eventhandler f�r das L�schen eines Kunden.
 * Aktualsiert anshclie�end die GUI.
 */
class deleteAction implements ActionListener{
	View_Kunde view;
	Model_Kunde model;
	public deleteAction(Model_Kunde model, View_Kunde view) {
		this.view = view;
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int id = view.getCurrentSelectedCustomerId();
		if(id==-1) {
			System.out.println("Es gibt keine Daten die Zur�ckgesetzt werden m�ssen");
			return;
		}
		model.deleteCustomer(id);
		String[] list = this.model.getList();
		if(list.length>0) {
			view.updateList(list);
			view.setListSelectionOn(0);
			view.updateGUIFromCustomer(model.getDataFromCustomer(Integer.parseInt(list[0])));
		}
	}
	
}
/**
 * Eventhandler f�r das Anlegen eines neuen Kunden.
 * Anschlie�ende aktualisierung der GUI
 *
 */
class newAction implements ActionListener{
	View_Kunde view;
	Model_Kunde model;
	public newAction(Model_Kunde model, View_Kunde view) {
		this.view = view;
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int id = model.addCustomer();
		String[] list = this.model.getList();
		view.updateList(list);
		view.setListSelectionOn(list.length-1);
		view.updateGUIFromCustomer(model.getDataFromCustomer(id));
	}
	
}
/**
 * Eventhandler f�r den Abbruch.
 * Eingegebene Daten werden verworfen.
 *
 */
class abbruchAction implements ActionListener{
	View_Kunde view;
	Model_Kunde model;
	public abbruchAction(Model_Kunde model, View_Kunde view) {
		this.view = view;
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int id = view.getCurrentSelectedCustomerId();
		if(id==-1) {
			System.out.println("Es gibt keine Daten die Zur�ckgesetzt werden m�ssen");
			return;
		}
		view.updateGUIFromCustomer(model.getDataFromCustomer(id));
	}
	
}