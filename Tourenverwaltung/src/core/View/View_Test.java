package core.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import core.Controller.JSONParser;
import javax.swing.JList;

public class View_Test {

	private JPanel pnl_test;
	private JButton btnNewButton;
	private JTextArea txttest;
	private JList list;
	private JButton btnNewButton_1;
	private DefaultListModel listModel;
	
	public View_Test()
	{
		createComp();
	}
	private void createComp() {
		pnl_test = new JPanel();
		pnl_test.setLayout(null);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 6, 89, 23);
		
		pnl_test.add(btnNewButton);
		
		txttest = new JTextArea();
		txttest.setBounds(105, 5, 542, 737);
		txttest.setColumns(20);
		txttest.setRows(5);
		txttest.setLineWrap(true);
		txttest.setText("sdfsdfsdf");
		pnl_test.add(txttest);
		
		listModel = new DefaultListModel();
		list = new JList(listModel);
		list.setBounds(707, 78, 191, 229);
		
		pnl_test.add(list);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(707, 30, 89, 23);
		pnl_test.add(btnNewButton_1);
	}
	
	public void addListElement(String s) {
		listModel.addElement(s);
	}
	
	public JPanel getSubPanel() {
			return pnl_test;
	}
	public void addTestListHandler(ActionListener al) {
		btnNewButton_1.addActionListener(al);
	}
	public void addTesthandler(ActionListener al)
	{
		btnNewButton.addActionListener(al);
	}
	public void setTestTA(String txt) {
		txttest.setText(txt);
	}
}
