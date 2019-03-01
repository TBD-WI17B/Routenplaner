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

public class Route {
	
	private View_Route view;
	private Model_Route model;

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
	
	
	//Handler
	class NewRouteAction implements ActionListener{
		Model_Route model;
		View_Route view;
		
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
	
	class DeleteRouteAction implements ActionListener{
		Model_Route model;
		View_Route view;
		
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
	
	class GenerateRouteAction implements ActionListener{
		Model_Route model;
		View_Route view;
		
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
	
	class RouteListSelectionHandler implements MouseListener{
		private int lastIndex=0;
		Model_Route model;
		View_Route view;
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
	
	class AddAuftragAction implements ActionListener{
		Model_Route model;
		View_Route view;
		
		public AddAuftragAction(Model_Route model,View_Route view) {
			this.model = model;
			this.view = view;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			int routenId = Integer.parseInt(this.view.getSelectedRoute());
			int auftragId;
			String selection = (String) JOptionPane.showInputDialog(new JFrame("Auftrag auswahl"), 
						        "Auftrag auswählen",
						        "Bittewählen Sie ihren Auftrag aus",
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
	class RemoveAuftragAction implements ActionListener{
		Model_Route model;
		View_Route view;
		
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

	class AssignFahrerAction implements ActionListener{
		Model_Route model;
		View_Route view;
		
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
	class ChangeFahrzeugAction implements ActionListener{
		Model_Route model;
		View_Route view;
		
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




