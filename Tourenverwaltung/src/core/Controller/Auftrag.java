package core.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JPanel;

import com.sun.crypto.provider.JceKeyStore;

import core.Model.Model_Auftrag;
import core.View.View_Auftrag;

public class Auftrag {
	private View_Auftrag view;
	private Model_Auftrag model;

	public Auftrag() {
		this.view = new View_Auftrag();
		this.model = new Model_Auftrag();
		
		//Listeners binden
		view.addListHandler(new AuftragListSelectionHandler(model,view));
		view.addSavingListener(new saveAction(model, view));
		view.addAddingListener(new newAction(model,view));
		view.addDeletingListener(new deleteAction(model,view));
		view.addResetListener(new abbruchAction(model,view));
		view.checkboxListener(new checkboxListener(model,view));
		view.hidePopUp(new popUpListener(model, view));
		//view.createBill(new billingAction(model,view));		//TODO Klasse billingAction und Funktion
		
		//Preload
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
	
	class saveAction implements ActionListener{
		View_Auftrag view;
		Model_Auftrag model;
		public saveAction(Model_Auftrag model, View_Auftrag view) {
			this.view = view;
			this.model = model;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int id = view.getCurrentSelectedAuftragId();
			if(id==-1)return;
			if(!model.saveAuftrag(id,view.getData()))this.view.openPopup(this.model.getFehlermeldung());
		}
		
	}
	
	class AuftragListSelectionHandler implements MouseListener{
		private int lastIndex=0;
		Model_Auftrag model;
		View_Auftrag view;
		public AuftragListSelectionHandler(Model_Auftrag model,View_Auftrag view) {
			this.model = model;
			this.view = view;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			JList list = (JList) e.getSource();
			int newIndex = Integer.parseInt((String) list.getSelectedValue());
			this.view.loadCombobox(this.model.getCustomers());
			if(lastIndex==newIndex)return;
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
	
	class deleteAction implements ActionListener{
		View_Auftrag view;
		Model_Auftrag model;
		public deleteAction(Model_Auftrag model, View_Auftrag view) {
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
			//TODO besere Entscheidungsfunktion finden
			if(box.getLabel().equals("Kunden Adresse für Start"))this.view.updateStartAdresse(this.model.getCustomerAdress(this.view.getCurrentSelectedAuftragId()));
			else if(box.getLabel().equals("Kunden Adresse für Ziel"))this.view.updateZielAdresse(this.model.getCustomerAdress(this.view.getCurrentSelectedAuftragId()));
		}
		
	}
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
