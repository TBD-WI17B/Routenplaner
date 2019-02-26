package core.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class View {
	//TODO Bennen die Variablen bitte mit Sinn Manu ^^ (TextField_2)
	
	//Models
	private View_Auftrag auftrag;
	private View_Fahrer fahrer;
	private View_Fahrzeug fahrzeug;
	private View_Kunde kunde;
	private View_Route route;
	private View_Test test;
	private View_Standort standort;
	
	//Globale Fenster Einstellungen
	private int x = 100;
	private int y= 100;
	private int height= 840;
	private int width = 1340;

	private JFrame frmTourenverwaltung;
	
	private JMenuBar menuBar;
	private JTabbedPane tabbedPane;


	/**
	 * Create the application.
	 */
	public View() {
		this.initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * Wenn möglich hier kein Custom Code, da hier alles auto generiert wird.
	 */
	private void initialize() {
		this.frmTourenverwaltung = new JFrame();
		this.frmTourenverwaltung.setIconImage(Toolkit.getDefaultToolkit().getImage(View.class.getResource("/images/72-200.png")));
		this.frmTourenverwaltung.setTitle("Tourenverwaltung");
		this.frmTourenverwaltung.setBounds(this.x, this.y, this.width, this.height);
		this.frmTourenverwaltung.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		this.menuBar = new JMenuBar();
		this.frmTourenverwaltung.setJMenuBar(this.menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		this.menuBar.add(mnMenu);
		
		JMenuItem mntmSettings = new JMenuItem("settings");
		mnMenu.add(mntmSettings);
		
		JMenu mnHelp = new JMenu("Help");
		this.menuBar.add(mnHelp);
		
		JMenu mnMoreStuff = new JMenu("more stuff");
		this.menuBar.add(mnMoreStuff);
		
		this.tabbedPane = new JTabbedPane(SwingConstants.TOP);
		
		this.frmTourenverwaltung.getContentPane().add(this.tabbedPane, BorderLayout.CENTER);		
		
	}
	public void addTabbedPaneTab(String name, JPanel p) {
		this.tabbedPane.addTab(name, null, p, null);
	}
	public void setTest(String txt) 
	{
		this.test.setTestTA(txt);
	}
	public void setVisible(boolean b) 
	{
		this.frmTourenverwaltung.setVisible(b);		
	}
}
