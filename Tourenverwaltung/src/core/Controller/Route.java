package core.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import core.Model.Model_Route;
import core.View.View_Route;

/**
 * Controller-Class f�r die Routenverwaltung
 *
 */
public class Route {
	
	private View_Route view;
	private Model_Route model;

	/**
	 * Konstruktor. Generiert View und Model der Routenverwaltung.
	 * Bindet Eventhandler an die GUI-Elemente.
	 * L�dt Vorabdaten und aktualisiert die GUI.
	 */
	public Route() {
		this.view = new View_Route();
		this.model = new Model_Route();
		
		//Preload
		view.updateListeRoute(model.getRoutenList());
		view.updateListeAuftraege(model.getAuftraegeList(1));
		view.updateListeFahrer(model.getFahrerList());
		view.updateFahrzeuge(model.getFahrzeugeList());
		
		//bind Handler
		this.view.addRoutenListListener(new RouteListSelectionHandler(model, view));
		this.view.addNewRouteListener(new NewRouteAction(model, view));
		this.view.addAddingListener(new AddAuftragAction(model, view));
		this.view.addAssignListener(new AssignFahrerAction(model, view));
		this.view.addDeleteRouteListener(new DeleteRouteAction(model, view));
		this.view.addFahzeugChangeListener(new ChangeFahrzeugAction(model, view));
		this.view.addRemoveListener(new RemoveAuftragAction(model, view));
		this.view.addRouteGenListener(new GenerateRouteAction(model, view));
		
		
		
	}
	public JPanel getPanel()
	{
		return view.getSubPanel();
	}
	
	
	/**
	 * Eventhandler f�r das erstellen einer neuen Route.
	 * Anschlie�ende aktualisierung der Routenliste.
	 *
	 */
	class NewRouteAction implements ActionListener{
		Model_Route model;
		View_Route view;

		/**
		 * Konstruktor des Eventhandlers. Ben�tigt Die View und Model aus der Oberklasse.
		 * @param model
		 * @param view
		 */
		public NewRouteAction(Model_Route model,View_Route view) {
			this.model = model;
			this.view = view;
		}
		@Override
		public void actionPerformed(ActionEvent e) {			
			this.model.addRoute();
			this.view.updateListeRoute(this.model.getRoutenList());
		}
		
	}
	/**
	 * Eventhandler f�r das L�schen einer Route.
	 * Aktualisierung der Routenliste.
	 */
	class DeleteRouteAction implements ActionListener{
		Model_Route model;
		View_Route view;

		/**
		 * Konstruktor des Eventhandlers. Ben�tigt Die View und Model aus der Oberklasse.
		 * @param model
		 * @param view
		 */
		public DeleteRouteAction(Model_Route model,View_Route view) {
			this.model = model;
			this.view = view;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			int routenId = Integer.parseInt(this.view.getSelectedRoute());
			this.model.deleteRoute(routenId);
			this.view.updateListeRoute(this.model.getRoutenList());
			
		}
		
	}
	/**
	 * Eventhandler f�r das automatische erzeugen der Routen.
	 * Aktulisierung der Routenliste.
	 */
	class GenerateRouteAction implements ActionListener{
		Model_Route model;
		View_Route view;

		/**
		 * Konstruktor des Eventhandlers. Ben�tigt Die View und Model aus der Oberklasse.
		 * @param model
		 * @param view
		 */
		public GenerateRouteAction(Model_Route model,View_Route view) {
			this.model = model;
			this.view = view;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			this.model.generateRoutes();
			this.view.updateListeRoute(this.model.getRoutenList());
			
		}
	}
	/**
	 * Eventhandler f�r die Auswahl einer Route aus der Liste.
	 * L�dt neue Daten und aktualisiert die GUI.
	 *
	 */
	class RouteListSelectionHandler implements MouseListener{
		private int lastIndex=0;
		Model_Route model;
		View_Route view;
		
		/**
		 * Konstruktor des Eventhandlers. Ben�tigt Die View und Model aus der Oberklasse.
		 * @param model
		 * @param view
		 */
		public RouteListSelectionHandler(Model_Route model,View_Route view) {
			this.model = model;
			this.view = view;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			JList list = (JList) e.getSource();
			int newIndex = Integer.parseInt((String) list.getSelectedValue());
			if(lastIndex==newIndex)return;
			this.view.updateListeAuftraege(this.model.getAuftraegeList(newIndex));
			this.view.setFahrzeug(this.model.getFahrzeug(newIndex));
			this.view.setFahrer(this.model.getFahrer(newIndex));
			this.view.updateInfo(this.model.getRouteData(newIndex));
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
	 * Eventhandler f�r das hinzuf�gen eines Auftrages zu einer Route.
	 * �ffnet ein Dialog um einen Auftrag auszuw�hlen.
	 *
	 */
	class AddAuftragAction implements ActionListener{
		Model_Route model;
		View_Route view;

		/**
		 * Konstruktor des Eventhandlers. Ben�tigt die View und Model aus der Oberklasse.
		 * @param model
		 * @param view
		 */
		public AddAuftragAction(Model_Route model,View_Route view) {
			this.model = model;
			this.view = view;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			int routenId = Integer.parseInt(this.view.getSelectedRoute());
			int auftragId;
			String selection = (String) JOptionPane.showInputDialog(new JFrame("Auftrag auswahl"), 
						        "Auftrag ausw�hlen",
						        "Bittew�hlen Sie ihren Auftrag aus",
						        JOptionPane.QUESTION_MESSAGE, 
						        null, 
						        this.model.getFreieAuftraege().get("auftragId"), 
						        this.model.getFreieAuftraege().get("auftragId")[0]
				        		);
			auftragId = Integer.parseInt(selection);
			this.model.addAuftrag(routenId, auftragId);
			this.view.updateListeRoute(this.model.getRoutenList());
			this.view.updateListeAuftraege(this.model.getAuftraegeList(routenId));
			
		}
		
	}
	/**
	 * Eventhandler um einen Auftrag zu entfernen.
	 * Aktualisierung der Auftragsliste
	 *
	 */
	class RemoveAuftragAction implements ActionListener{
		Model_Route model;
		View_Route view;

		/**
		 * Konstruktor des Eventhandlers. Ben�tigt die View und Model aus der Oberklasse.
		 * @param model
		 * @param view
		 */
		public RemoveAuftragAction(Model_Route model,View_Route view) {
			this.model = model;
			this.view = view;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			int auftragId = Integer.parseInt(this.view.getSelectedAuftrag());
			int routeId = Integer.parseInt(this.view.getSelectedRoute());
			
			this.model.removeAuftrag(auftragId,routeId);
			this.view.updateListeAuftraege(this.model.getAuftraegeList(routeId));
		}
		
	}

	/**
	 * Eventhandler f�r das zuweisen eines Fahrers
	 */
	class AssignFahrerAction implements ActionListener{
		Model_Route model;
		View_Route view;

		/**
		 * Konstruktor des Eventhandlers. Ben�tigt die View und Model aus der Oberklasse.
		 * @param model
		 * @param view
		 */
		public AssignFahrerAction(Model_Route model,View_Route view) {
			this.model = model;
			this.view = view;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			String fahrer = this.view.getSelectedFahrer().split(",")[0];
			int fahrerId = Integer.parseInt(fahrer);
			int routenId = Integer.parseInt(this.view.getSelectedRoute());
			
			this.model.updateFahrer(fahrerId, routenId);
			
		}
		
	}
	/**
	 * Eventhandler f�r das wecheln eines Fahres. Wird direkt bei auswahl des Fahrers aufgr�rufen.
	 *
	 */
	class ChangeFahrzeugAction implements ActionListener{
		Model_Route model;
		View_Route view;

		/**
		 * Konstruktor des Eventhandlers. Ben�tigt die View und Model aus der Oberklasse.
		 * @param model
		 * @param view
		 */
		public ChangeFahrzeugAction(Model_Route model,View_Route view) {
			this.model = model;
			this.view = view;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			int fahrzeugId = Integer.parseInt(this.view.getSelectedFahrzeug());
			int routenId = Integer.parseInt(this.view.getSelectedRoute());
			
			this.model.updateFahrzeug(fahrzeugId, routenId);
			
		}
		
	}
}




