package core.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

import core.Model.Model_View;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class View {
	//TODO Bennen die Variablen bitte mit Sinn Manu ^^ (TextField_2)
	
	//Models
	private Model_View model;
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
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					final View window = new View();
					window.frmTourenverwaltung.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public View(Model_View m) {
		this.model = m;
		this.auftrag = new View_Auftrag();
		this.fahrer = new View_Fahrer();
		this.fahrzeug = new View_Fahrzeug();
		this.kunde = new View_Kunde();
		this.route = new View_Route();
		this.standort = new View_Standort();
		this.test = new View_Test();
		
		this.initialize();		
	}

	/**
	 * Parameter Konstruktor für Testzwecke
	 */
	public View() {
		this.auftrag = new View_Auftrag();
		this.fahrer = new View_Fahrer();
		this.fahrzeug = new View_Fahrzeug();
		this.kunde = new View_Kunde();
		this.route = new View_Route();
		this.standort = new View_Standort();
		this.test = new View_Test();
		
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
		this.tabbedPane.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				switch (View.this.tabbedPane.getSelectedIndex()) {
				case 0:
					View.this.frmTourenverwaltung.setBounds(View.this.frmTourenverwaltung.getX(), View.this.frmTourenverwaltung.getY(), View.this.width, View.this.height);
					break;
				case 1:
					View.this.frmTourenverwaltung.setBounds(View.this.frmTourenverwaltung.getX(), View.this.frmTourenverwaltung.getY(), View.this.width-250, View.this.height);
					break;
				case 2:
					View.this.frmTourenverwaltung.setBounds(View.this.frmTourenverwaltung.getX(), View.this.frmTourenverwaltung.getY(), View.this.width-150, View.this.height-220);
					break;
				case 3:
					View.this.frmTourenverwaltung.setBounds(View.this.frmTourenverwaltung.getX(), View.this.frmTourenverwaltung.getY(), View.this.width-50, View.this.height);
					break;
				case 4:
					View.this.frmTourenverwaltung.setBounds(View.this.frmTourenverwaltung.getX(), View.this.frmTourenverwaltung.getY(), View.this.width, View.this.height);
					break;
				default:
					View.this.frmTourenverwaltung.setBounds(View.this.frmTourenverwaltung.getX(), View.this.frmTourenverwaltung.getY(), View.this.width, View.this.height);
					break;
				}
			}
		});
		this.frmTourenverwaltung.getContentPane().add(this.tabbedPane, BorderLayout.CENTER);		
		
		/**
		 * Ausgelagerte Klassen für die einzelenen Tabs
		 */
		this.tabbedPane.addTab("Routenplaner", null, this.route.getSubPanel(), null);
		this.tabbedPane.addTab("Fahrerverwaltung", null, this.fahrer.getSubPanel(), null);
		this.tabbedPane.addTab("Auftragsverwaltung", null, this.auftrag.getSubPanel(), null);
		this.tabbedPane.addTab("Kundenverwaltung", null, this.kunde.getSubPanel(), null);
		this.tabbedPane.addTab("Fahrzeuggverwaltung", null, this.fahrzeug.getSubPanel(), null);
		this.tabbedPane.addTab("Standortverwaltung", null, this.standort.getSubPanel(), null);
		this.tabbedPane.addTab("test", null, this.test.getSubPanel(), null);
		
	}
	public void bindTesthandler(ActionListener al) {
		this.test.addTesthandler(al);
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
