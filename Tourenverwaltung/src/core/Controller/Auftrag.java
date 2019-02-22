package core.Controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JList;
import javax.swing.JPanel;

import core.Model.Model_Auftrag;
import core.Model.Model_Kunde;
import core.View.View_Auftrag;
import core.View.View_Kunde;

public class Auftrag {
	private View_Auftrag view;
	private Model_Auftrag model;

	public Auftrag() {
		this.view = new View_Auftrag();
		this.model = new Model_Auftrag();
		
		view.addListHandler(new AuftragListSelectionHandler(model,view));
		this.view.updateList(this.model.getList());
	}
	public JPanel getPanel()
	{
		return view.getSubPanel();
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
		int newIndex = list.getSelectedIndex()+1;
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