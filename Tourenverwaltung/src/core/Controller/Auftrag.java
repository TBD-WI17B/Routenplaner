package core.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JPanel;

import core.Model.Model_Auftrag;
import core.View.View_Auftrag;

/**
 * Controller-Class für die Auftragsverwaltung
 *
 */
public class Auftrag {
	private View_Auftrag view;
	private Model_Auftrag model;

	public Auftrag() {
		//Model und View generieren
		this.view = new View_Auftrag();
		this.model = new Model_Auftrag();
		
		//Eventhandler für die einzelnen Schaltflächen binden
		view.addListHandler(new AuftragListSelectionHandler(model,view));
		view.addSavingListener(new saveAction(model, view));
		view.addAddingListener(new newAction(model,view));
		view.addDeletingListener(new deleteAction(model,view));
		view.addResetListener(new abbruchAction(model,view));
		view.checkboxListener(new checkboxListener(model,view));
		view.hidePopUp(new popUpListener(model, view));
		//view.createBill(new billingAction(model,view));		//TODO Klasse billingAction und Funktion
		
		//Preload
		this.reload();
	}
	/**
	 * Aktualisierung der Daten in der GUI
	 */
	public void reload() {
		String[] list = this.model.getList();
		this.view.loadCombobox(this.model.getCustomers());
		this.view.updateList(list);
		if(list.length>0) {
			this.view.setListSelectionOn(0);
			this.view.updateGUIFromCustomer(this.model.getDataFromAuftrag(Integer.parseInt(list[0])));
		} 
	}
	
	public JPanel getPanel()
	{
		return view.getSubPanel();
	}
	/**
	 * Eventhandler umd Auftrag zu speichern.
	 *
	 */
	class saveAction implements ActionListener{
		View_Auftrag view;
		Model_Auftrag model;
		/**
		 * Konstruktor des Eventhandlers
		 * @param model Model der Auftragsverwaltung
		 * @param view View der Auftragsverwaltung
		 */
		public saveAction(Model_Auftrag model, View_Auftrag view) {
			this.view = view;
			this.model = model;
		}
		/**
		 * Holt die ID des ausgewählten Auftrages. Holt entsprechende Daten aus der GUI und übergibt diese.
		 * Gibt evtl. Fehlermeldung aus (experimental)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			int id = view.getCurrentSelectedAuftragId();
			if(id==-1)return;
			if(!model.saveAuftrag(id,view.getData()))this.view.openPopup(this.model.getFehlermeldung());
		}
		
	}
	/**
	 * Eventhandler für das Auswählen eines Auftrages. Aktualisiert die angezeigten Daten in der GUI.
	 *
	 */
	class AuftragListSelectionHandler implements MouseListener{
		private int lastIndex=0;
		Model_Auftrag model;
		View_Auftrag view;
		public AuftragListSelectionHandler(Model_Auftrag model,View_Auftrag view) {
			this.model = model;
			this.view = view;
		}
		/**
		 * Action wird aufgerufen, wenn per Mausklick ein andere Auftrag ausgewählt wurde. 
		 * Holt Daten aus dem Model und übergibt diese an die GUI.
		 */
		@Override
		public void mouseClicked(MouseEvent e) {
			JList list = (JList) e.getSource();
			int newIndex = Integer.parseInt((String) list.getSelectedValue());
			if(lastIndex==newIndex)return;
			this.view.loadCombobox(this.model.getCustomers());
			view.updateGUIFromCustomer(model.getDataFromAuftrag(newIndex));
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
	 * Eventhandler umd Auftrag zu löschen.
	 *
	 */
	class deleteAction implements ActionListener{
		View_Auftrag view;
		Model_Auftrag model;
		public deleteAction(Model_Auftrag model, View_Auftrag view) {
			this.view = view;
			this.model = model;
		}
		/**
		 * Löscht Auftrag aus der DB und aktualisiert die GUI.
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			int id = view.getCurrentSelectedAuftragId();
			if(id==-1) {
				System.out.println("Es gibt keine Daten die Zurückgesetzt werden müssen");
				return;
			}
			model.deleteAuftrag(id);
			String[] list = this.model.getList();
			if(list.length>0) {
				this.view.loadCombobox(this.model.getCustomers());
				view.updateList(list);
				view.setListSelectionOn(0);
				view.updateGUIFromCustomer(model.getDataFromAuftrag(Integer.parseInt(list[0])));
			}
		}
		
	}
	/**
	 * 
	 *
	 */
	class newAction implements ActionListener{
		View_Auftrag view;
		Model_Auftrag model;
		public newAction(Model_Auftrag model, View_Auftrag view) {
			this.view = view;
			this.model = model;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int id = model.addAuftrag();
			String[] list = this.model.getList();
			
			this.view.loadCombobox(this.model.getCustomers());
			view.updateList(list);
			view.setListSelectionOn(list.length-1);
			view.updateGUIFromCustomer(model.getDataFromAuftrag(id));
		}
		
	}
	/**
	 * Eventhandler für den Abbruch der Eingabe. Verwirft eingegbene Daten und lädt die Ürsprünglichen Daten neu aus der Datenbank.
	 *
	 */
	class abbruchAction implements ActionListener{
		View_Auftrag view;
		Model_Auftrag model;
		public abbruchAction(Model_Auftrag model, View_Auftrag view) {
			this.view = view;
			this.model = model;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int id = view.getCurrentSelectedAuftragId();
			if(id==-1) {
				System.out.println("Es gibt keine Daten die Zurückgesetzt werden müssen");
				return;
			}
			view.updateGUIFromCustomer(model.getDataFromAuftrag(id));
		}
		
	}
	/**
	 * Eventhandler für die Auswahl des Kunden.
	 * Bei Auswahl eines Kunden werden Daten des Kunden in die Felder der GUI geschrieben.
	 */
	class checkboxListener implements ActionListener{
		View_Auftrag view;
		Model_Auftrag model;
		public checkboxListener(Model_Auftrag model, View_Auftrag view) {
			this.view = view;
			this.model = model;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JCheckBox box = (JCheckBox) e.getSource();
			
			if(box.isSelected()) {
				int kundenId = this.model.getKundenId(this.view.getData().get("kunde"));
				if(kundenId==-1) {
					this.view.openPopup(this.model.getFehlermeldung());
					return;
				}
				if(box.getLabel().equals("Kunden Adresse für Start"))this.view.updateStartAdresse(this.model.getCustomerAdress(kundenId));
				else if(box.getLabel().equals("Kunden Adresse für Ziel"))this.view.updateZielAdresse(this.model.getCustomerAdress(kundenId));
			}else {
				String kundenIdString = this.model.getDataFromAuftrag(this.view.getCurrentSelectedAuftragId()).get("kunde");
				int kundenId;
				if(kundenIdString!=null) {
					kundenId = this.model.getKundenId(kundenIdString);
					if(box.getLabel().equals("Kunden Adresse für Start"))this.view.updateStartAdresse(this.model.getCustomerAdress(kundenId));
					else if(box.getLabel().equals("Kunden Adresse für Ziel"))this.view.updateZielAdresse(this.model.getCustomerAdress(kundenId));
				}
			}
		
		}
	}
	/**
	 * Eventhandler für die Fehlermeldung
	 *
	 */
	class popUpListener implements ActionListener{
		View_Auftrag view;
		Model_Auftrag model;
		public popUpListener(Model_Auftrag model, View_Auftrag view) {
			this.view = view;
			this.model = model;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			this.view.closePopUp();
		}
	}
	
}
