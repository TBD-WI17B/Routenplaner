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
	
	private int x = 100;
	private int y= 100;
	private int height= 840;
	private int width = 1340;

	private JFrame frmTourenverwaltung;
	private JPanel pnl_test;
	private JPanel pnl_kundenverwaltung;
	private JPanel pnl_auftragsverwaltung;
	private JPanel pnl_fahrerverwaltung;
	private JPanel pnl_routenplaner;
	private JTextArea txttest;
	private JMenuBar menuBar;
	private JTabbedPane tabbedPane;
	private JButton btnNewButton;
	private JLabel lbl_map;
	private JList ls_routen;
	private JLabel lbl_routen;
	private JLabel lbl_haltepunkte;
	private JList ls_haltepunkte;
	private JTextField txtAuftragsnummer;
	private JTextField txtFahrer;
	private JTextField txtKm;
	private JTextField txtDauer;
	private JList ls_fahrer;
	private JLabel lblNewLabel;
	private JButton btnNeueRoute;
	private JButton btnLschen;
	private JButton btnBearbeiten;
	private JButton btnHinzufgen;
	private JButton btnEntfernen;
	private JButton btnZuweisen;
	private JLabel lblAuftragsnummer;
	private JLabel lblFahrer;
	private JLabel lblDauer;
	private JLabel lblDistanz;
	private JLabel lblInfos;
	private JLabel lblInfos_1;
	private JTextField txtAbc;
	private JTextField txtZzz;
	private JLabel lblZusatz;
	private JTextPane txtpnLoremIpsumOder;
	private JList list;
	private JTextField txtMller;
	private JTextField textField_1;
	private JTextField txtNestare;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_1;
	private JLabel lblPlzOrt;
	private JLabel lblStrae;
	private JLabel lblTelefon;
	private JLabel lblMobil;
	private JTextField txtKarl;
	private JTextField txtTesthausen;
	private JTextField textField;
	private JLabel lblAngestelltennummer;
	private JTextField txtA;
	private JTable table;
	private JScrollPane scrollPane;
	private JLabel lblStatus;
	private JRadioButton rdbtnAktiv;
	private JRadioButton rdbtnInaktiv;
	
	private JLabel lblFahrer_1;
	private JLabel lblAnschrift;
	private JLabel lblInformationen;
	private JButton btnNeu;
	private JButton btnLschen_1;
	private JButton btnNewButton_1;
	private JButton btnSpeichern;
	private JButton btnAbbrechen;
	private JSeparator separator;
	private JLabel lblAuftrge;
	private JList list_1;
	private JButton btnNeuerAuftrag;
	private JButton btnLschen_2;
	private JLabel lblAuftragsnummer_1;
	private JLabel lblFahrer_2;
	private JLabel lblRoute;
	private JLabel label_2;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel lblFahrer_3;
	private JLabel lblAusfhrdatum;
	private JLabel lblRoute_1;
	private JLabel lblZiel;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JLabel lblZiel_1;
	private JTextField textField_8;
	private JTextField txtDude;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JTextField txtTim;
	private JTextField textField_19;
	private JTextField textField_20;
	private JLabel label_6;
	private JLabel lblKunden;
	private JButton btnNeu_1;
	private JButton btnLschen_3;
	private JSeparator separator_2;
	private JButton btnSpeichern_2;
	private JButton btnAbbrechen_2;
	private JLabel lblKundennummer;
	private JTextField txtK;
	private JTable table_1;
	private JScrollPane scrollPane_1;
	private JTextField txtKnms;
	private JTextField txtMan;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JLabel lblFahrzeuginformationen;
	private JLabel lblBehindertenGerecht;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTable table_2;
	private JTextField txtF;
	private JTextField textField_21;
	private JLabel lblHandicap;
	private JRadioButton rdbtnJa_1;
	private JRadioButton rdbtnNein_1;
	private JLabel lblStandortId;
	private JTextField txtS;
	private JPanel pnl_standortverwaltung;
	private JList list_standorte;
	private JButton btnNeuerStandort;
	private JList list_4;
	private JLabel lblStandorte;
	private JLabel lblFahrzeuge_1;
	private JList list_5;
	private JLabel lblFahrer_4;
	private JButton btnLschen_5;
	private JButton btnHinzufgen_1;
	private JButton btnEntfernen_1;
	private JButton btnHinzufgen_2;
	private JButton btnEntfernen_2;
	private JLabel lblName;
	private JLabel lblStandortid;
	private JTextField textField_13;
	private JTextField textField_18;
	private JLabel label_9;
	private JLabel label_10;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField txtS_1;
	private JTextField txtMosbach;
	private JPanel test;
	private View_Standort standort;

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
		
		pnl_test = new JPanel();
		//tabbedPane.addTab("test", null, pnl_test, null);
		pnl_test.setLayout(null);
		
		btnNewButton = new JButton("New button");
		this.btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
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

	public void addTesthandler(ActionListener al)
	{
		btnNewButton.addActionListener(al);
	}
	public void setTest(String txt) {
		txttest.setText(txt);
	}

	public void setVisible(boolean b) {
		this.frmTourenverwaltung.setVisible(b);
		
	}
	/**
	 * @wbp.factory
	 * @wbp.factory.parameter.source arg2 test
	 * @wbp.factory.parameter.source arg2_1 fahrer.getSubPanel()
	 * @wbp.factory.parameter.source arg2_2 pnl_auftragsverwaltung
	 * @wbp.factory.parameter.source arg2_3 pnl_kundenverwaltung
	 * @wbp.factory.parameter.source arg2_4 pnl_fahrzeugverwaltung
	 * @wbp.factory.parameter.source arg2_5 this.pnl_standortverwaltung
	 */
	public static JTabbedPane createJTabbedPane(Component arg2, Component arg2_1, Component arg2_2, Component arg2_3, Component arg2_4, Component arg2_5) {
		JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.TOP);
		tabbedPane.addTab("Routenplaner", null, arg2, null);
		tabbedPane.addTab("Fahrerverwaltung", null, arg2_1, null);
		tabbedPane.addTab("Auftragsverwaltung", null, arg2_2, null);
		tabbedPane.addTab("Kundenverwaltung", null, arg2_3, null);
		tabbedPane.addTab("Fahrzeuggverwaltung", null, arg2_4, null);
		tabbedPane.addTab("Standortverwaltung", null, arg2_5, null);
		return tabbedPane;
	}
}
