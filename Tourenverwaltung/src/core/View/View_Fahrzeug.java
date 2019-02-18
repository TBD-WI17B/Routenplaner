package core.View;

import java.awt.Component;

import javax.swing.JPanel;

public class View_Fahrzeug {
	
	
	
	private JPanel pnl_fahrzeugverwaltung;
	public View_Fahrzeug()
	{
		
	}
	private void initComp()
	{
		pnl_fahrzeugverwaltung = new JPanel();
	}
	public JPanel getSubPanel()
	{
		return pnl_fahrzeugverwaltung;
	}
}
