package core.View;

import java.awt.Component;

import javax.swing.JPanel;

public class View_Fahrzeug {
	
	
	
	private JPanel pnl_fahrerverwaltung;
	public View_Fahrzeug()
	{
		
	}
	private void initComp()
	{
		pnl_fahrerverwaltung = new JPanel();
	}
	public JPanel getSubPanel()
	{
		return pnl_fahrerverwaltung;
	}
	public Component[] getComp()
	{
		return pnl_fahrerverwaltung.getComponents();
	}
}
