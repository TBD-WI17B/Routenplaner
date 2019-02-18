package core.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

import core.Model.Model;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Component;

public class View {
	
	private Model model;
	private View_Auftrag auftrag;
	private View_Fahrer fahrer;
	private View_Fahrzeug fahrzeug;
	private View_Kunde kunde;
	private View_Route route;
	private View_Test test;
	private View_Standort standort;
	
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
	public View(Model m) {
		this.model = m;
		this.auftrag = new View_Auftrag();
		this.fahrer = new View_Fahrer();
		this.fahrzeug = new View_Fahrzeug();
		this.kunde = new View_Kunde();
		this.route = new View_Route();
		
		initialize();
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					initialize();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});		
	}

	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * Wenn möglich hier kein Custom Code, da hier alles auto generiert wird.
	 */
	private void initialize() {
		frmTourenverwaltung = new JFrame();
		frmTourenverwaltung.setIconImage(Toolkit.getDefaultToolkit().getImage(View.class.getResource("/images/72-200.png")));
		frmTourenverwaltung.setTitle("Tourenverwaltung");
		frmTourenverwaltung.setBounds(x, y, width, height);
		frmTourenverwaltung.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		menuBar = new JMenuBar();
		frmTourenverwaltung.setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmSettings = new JMenuItem("settings");
		mnMenu.add(mntmSettings);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenu mnMoreStuff = new JMenu("more stuff");
		menuBar.add(mnMoreStuff);
		
		tabbedPane = new JTabbedPane(SwingConstants.TOP);
		this.tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				switch (tabbedPane.getSelectedIndex()) {
				case 0:
					frmTourenverwaltung.setBounds(frmTourenverwaltung.getX(), frmTourenverwaltung.getY(), width, height);
					break;
				case 1:
					frmTourenverwaltung.setBounds(frmTourenverwaltung.getX(), frmTourenverwaltung.getY(), width-250, height);
					break;
				case 2:
					frmTourenverwaltung.setBounds(frmTourenverwaltung.getX(), frmTourenverwaltung.getY(), width-150, height-220);
					break;
				case 3:
					frmTourenverwaltung.setBounds(frmTourenverwaltung.getX(), frmTourenverwaltung.getY(), width-50, height);
					break;
				case 4:
					frmTourenverwaltung.setBounds(frmTourenverwaltung.getX(), frmTourenverwaltung.getY(), width, height);
					break;
				default:
					frmTourenverwaltung.setBounds(frmTourenverwaltung.getX(), frmTourenverwaltung.getY(), width, height);
					break;
				}
			}
		});
		frmTourenverwaltung.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		
		
		
		/**
		 * Ausgelagerte Klassen für die einzelenen Tabs
		 */
		route = new View_Route();		
		tabbedPane.addTab("Routenplaner", null, route.getSubPanel(), null);		
		
		fahrer = new View_Fahrer();
		tabbedPane.addTab("Fahrerverwaltung", null, fahrer.getSubPanel(), null);		
		
		auftrag = new View_Auftrag();
		tabbedPane.addTab("Auftragsverwaltung", null, auftrag.getSubPanel(), null);

		kunde = new View_Kunde();
		tabbedPane.addTab("Kundenverwaltung", null, kunde.getSubPanel(), null);
		
		fahrzeug = new View_Fahrzeug();
		tabbedPane.addTab("Fahrzeuggverwaltung", null, fahrzeug.getSubPanel(), null);
		
		standort = new View_Standort();
		this.tabbedPane.addTab("Standortverwaltung", null, standort.getSubPanel(), null);
		
		test = new View_Test();
		this.tabbedPane.addTab("test", null, test.getSubPanel(), null);
	}
	public void bindTesthandler(ActionListener al) {
		test.addTesthandler(al);
	}
	public void setTest(String txt) 
	{
		test.setTestTA(txt);
	}
	public void setVisible(boolean b) 
	{
		this.frmTourenverwaltung.setVisible(b);		
	}
}
