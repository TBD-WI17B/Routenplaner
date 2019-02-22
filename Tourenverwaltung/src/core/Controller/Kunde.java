package core.Controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JList;
import javax.swing.JPanel;

import core.Model.Model_Kunde;
import core.View.View_Kunde;

public class Kunde {
	private View_Kunde view;
	private Model_Kunde model;

	public Kunde() {
		this.view = new View_Kunde();
		this.model = new Model_Kunde();
		view.addListHandler(new ListSelectionHandler(model,view));
		this.view.updateList(this.model.getList());
	}
	
	public JPanel getPanel()
	{
		return view.getSubPanel();
	}
	public void bindListHandler() {
		
	}
}

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
		int newIndex = list.getSelectedIndex()+1;
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
