package core.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class View_Test {

	private JPanel pnl_test;
	private JButton btnNewButton;
	private JTextArea txttest;
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
	}
	public JPanel getSubPanel() {
			return pnl_test;
	}
	public void addTesthandler(ActionListener al)
	{
		btnNewButton.addActionListener(al);
	}
	public void setTestTA(String txt) {
		txttest.setText(txt);
	}
}
