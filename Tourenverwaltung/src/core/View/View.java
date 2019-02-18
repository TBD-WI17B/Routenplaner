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
					window.btnNewButton.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							window.txttest.setText("test");
						}
					});
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
		
		
		
		
		//Test ausgelagterte SubPanels
		route = new View_Route();		
		tabbedPane.addTab("Routenplaner", null, route.getSubPanel(), null);
		
		
		fahrer = new View_Fahrer();
		tabbedPane.addTab("Fahrerverwaltung", null, fahrer.getSubPanel(), null);
		
		
		auftrag = new View_Auftrag();
		tabbedPane.addTab("Auftragsverwaltung", null, auftrag.getSubPanel(), null);

		
		
		pnl_kundenverwaltung = new JPanel();
		tabbedPane.addTab("Kundenverwaltung", null, pnl_kundenverwaltung, null);
		this.pnl_kundenverwaltung.setLayout(null);
		
		txtDude = new JTextField();
		txtDude.setText("Dude");
		txtDude.setColumns(10);
		txtDude.setBounds(381, 36, 119, 20);
		pnl_kundenverwaltung.add(txtDude);
		
		textField_14 = new JTextField();
		textField_14.setText("12346");
		textField_14.setColumns(10);
		textField_14.setBounds(381, 67, 73, 20);
		pnl_kundenverwaltung.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("Nestar\u00DFe");
		textField_15.setColumns(10);
		textField_15.setBounds(381, 98, 195, 20);
		pnl_kundenverwaltung.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText("01234568");
		textField_16.setColumns(10);
		textField_16.setBounds(381, 129, 248, 20);
		pnl_kundenverwaltung.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("012345644");
		textField_17.setColumns(10);
		textField_17.setBounds(381, 160, 248, 20);
		pnl_kundenverwaltung.add(textField_17);
		
		label = new JLabel("Name, Vorname");
		label.setBounds(273, 37, 98, 14);
		pnl_kundenverwaltung.add(label);
		
		label_1 = new JLabel("PLZ, Ort");
		label_1.setBounds(273, 70, 98, 14);
		pnl_kundenverwaltung.add(label_1);
		
		label_3 = new JLabel("Stra\u00DFe, Nr.");
		label_3.setBounds(273, 101, 98, 14);
		pnl_kundenverwaltung.add(label_3);
		
		label_4 = new JLabel("Telefon");
		label_4.setBounds(273, 132, 98, 14);
		pnl_kundenverwaltung.add(label_4);
		
		label_5 = new JLabel("Mobil");
		label_5.setBounds(273, 163, 98, 14);
		pnl_kundenverwaltung.add(label_5);
		
		txtTim = new JTextField();
		txtTim.setText("Tim");
		txtTim.setColumns(10);
		txtTim.setBounds(510, 36, 119, 20);
		pnl_kundenverwaltung.add(txtTim);
		
		textField_19 = new JTextField();
		textField_19.setText("Testhausen");
		textField_19.setColumns(10);
		textField_19.setBounds(464, 67, 165, 20);
		pnl_kundenverwaltung.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText("1");
		textField_20.setColumns(10);
		textField_20.setBounds(586, 98, 43, 20);
		pnl_kundenverwaltung.add(textField_20);
		
		label_6 = new JLabel("Anschrift");
		label_6.setBounds(273, 11, 46, 14);
		pnl_kundenverwaltung.add(label_6);
		
		JList list_2 = new JList();
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"K135", "K12"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_2.setSelectedIndex(0);
		list_2.setBounds(10, 36, 253, 377);
		pnl_kundenverwaltung.add(list_2);
		
		lblKunden = new JLabel("Kunden");
		lblKunden.setBounds(10, 11, 46, 14);
		pnl_kundenverwaltung.add(lblKunden);
		
		btnNeu_1 = new JButton("Neu");
		btnNeu_1.setBounds(10, 424, 89, 23);
		pnl_kundenverwaltung.add(btnNeu_1);
		
		btnLschen_3 = new JButton("L\u00F6schen");
		btnLschen_3.setBounds(109, 424, 89, 23);
		pnl_kundenverwaltung.add(btnLschen_3);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(273, 213, 689, 2);
		pnl_kundenverwaltung.add(separator_2);
		
		btnSpeichern_2 = new JButton("Speichern");
		btnSpeichern_2.setBounds(273, 226, 89, 23);
		pnl_kundenverwaltung.add(btnSpeichern_2);
		
		btnAbbrechen_2 = new JButton("Abbrechen");
		btnAbbrechen_2.setBounds(381, 226, 89, 23);
		pnl_kundenverwaltung.add(btnAbbrechen_2);
		
		lblKundennummer = new JLabel("Kundennummer");
		lblKundennummer.setBounds(694, 39, 89, 14);
		pnl_kundenverwaltung.add(lblKundennummer);
		
		txtK = new JTextField();
		txtK.setText("K135");
		txtK.setColumns(10);
		txtK.setBounds(793, 36, 195, 20);
		pnl_kundenverwaltung.add(txtK);
		
		JLabel lblAuftrger = new JLabel("Auftr\u00E4ge");
		lblAuftrger.setBounds(10, 496, 98, 14);
		pnl_kundenverwaltung.add(lblAuftrger);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 458, 974, 2);
		pnl_kundenverwaltung.add(separator_3);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 521, 1233, 207);
		pnl_kundenverwaltung.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setFillsViewportHeight(true);
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"A112", "Tim", "Dude", "K135", "N\u00FCrnberg", "Berlin", "20.3.2019", "400", "1501,35"},
				{"A155", "Tim", "Dude", "K135", "Berlin", "N\u00FCrnberg", "25.3.2019", "400", "1522,00"},
			},
			new String[] {
				"Auftrag", "Name", "Vorname", "Kunde", "Start", "Ziel", "Datum", "Distanz", "Betrag"
			}
		));
		
		this.lblHandicap = new JLabel("Handicap");
		this.lblHandicap.setBounds(694, 70, 89, 14);
		this.pnl_kundenverwaltung.add(this.lblHandicap);
		
		this.rdbtnJa_1 = new JRadioButton("Ja");
		this.rdbtnJa_1.setBounds(793, 66, 43, 23);
		this.pnl_kundenverwaltung.add(this.rdbtnJa_1);
		
		this.rdbtnNein_1 = new JRadioButton("Nein");
		this.rdbtnNein_1.setSelected(true);
		this.rdbtnNein_1.setBounds(838, 66, 55, 23);
		this.pnl_kundenverwaltung.add(this.rdbtnNein_1);
		
		JPanel pnl_fahrzeugverwaltung = new JPanel();
		tabbedPane.addTab("Fahrzeuggverwaltung", null, pnl_fahrzeugverwaltung, null);
		pnl_fahrzeugverwaltung.setLayout(null);
		
		JLabel lblFahrzeuge = new JLabel("Fahrzeuge");
		lblFahrzeuge.setBounds(10, 11, 82, 14);
		pnl_fahrzeugverwaltung.add(lblFahrzeuge);
		
		JList list_3 = new JList();
		list_3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_3.setModel(new AbstractListModel() {
			String[] values = new String[] {"V12", "V1", "V5"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_3.setSelectedIndex(0);
		list_3.setBounds(10, 36, 197, 373);
		pnl_fahrzeugverwaltung.add(list_3);
		
		JLabel lblKennzeichen = new JLabel("Kennzeichen");
		lblKennzeichen.setBounds(217, 73, 145, 14);
		pnl_fahrzeugverwaltung.add(lblKennzeichen);
		
		JLabel lblMarke = new JLabel("Marke");
		lblMarke.setBounds(217, 98, 145, 14);
		pnl_fahrzeugverwaltung.add(lblMarke);
		
		JLabel lblVersicherungsnummer = new JLabel("Versicherungsnummer");
		lblVersicherungsnummer.setBounds(217, 149, 145, 14);
		pnl_fahrzeugverwaltung.add(lblVersicherungsnummer);
		
		txtKnms = new JTextField();
		txtKnms.setText("K\u00DCN-MS-1993");
		txtKnms.setBounds(372, 72, 136, 20);
		pnl_fahrzeugverwaltung.add(txtKnms);
		txtKnms.setColumns(10);
		
		txtMan = new JTextField();
		txtMan.setColumns(10);
		txtMan.setBounds(371, 97, 136, 20);
		pnl_fahrzeugverwaltung.add(txtMan);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(371, 148, 136, 20);
		pnl_fahrzeugverwaltung.add(textField_22);
		
		JLabel lblSitzpltze = new JLabel("Sitzpl\u00E4tze");
		lblSitzpltze.setBounds(217, 177, 145, 14);
		pnl_fahrzeugverwaltung.add(lblSitzpltze);
		
		textField_23 = new JTextField();
		textField_23.setText("5");
		textField_23.setColumns(10);
		textField_23.setBounds(372, 176, 136, 20);
		pnl_fahrzeugverwaltung.add(textField_23);
		
		lblFahrzeuginformationen = new JLabel("Fahrzeuginformationen");
		lblFahrzeuginformationen.setBounds(217, 11, 118, 14);
		pnl_fahrzeugverwaltung.add(lblFahrzeuginformationen);
		
		lblBehindertenGerecht = new JLabel("Behindertengerecht");
		lblBehindertenGerecht.setBounds(217, 202, 145, 14);
		pnl_fahrzeugverwaltung.add(lblBehindertenGerecht);
		
		JRadioButton rdbtnJa = new JRadioButton("ja");
		rdbtnJa.setBounds(372, 203, 47, 23);
		pnl_fahrzeugverwaltung.add(rdbtnJa);
		
		JRadioButton rdbtnNein = new JRadioButton("Nein");
		rdbtnNein.setSelected(true);
		rdbtnNein.setBounds(421, 203, 58, 23);
		pnl_fahrzeugverwaltung.add(rdbtnNein);
		
		JLabel lblStandortdaten = new JLabel("Standortdaten");
		lblStandortdaten.setBounds(562, 11, 118, 14);
		pnl_fahrzeugverwaltung.add(lblStandortdaten);
		
		textField_33 = new JTextField();
		textField_33.setText("12346");
		textField_33.setColumns(10);
		textField_33.setBounds(670, 68, 73, 20);
		pnl_fahrzeugverwaltung.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setText("Nestar\u00DFe");
		textField_34.setColumns(10);
		textField_34.setBounds(670, 99, 195, 20);
		pnl_fahrzeugverwaltung.add(textField_34);
		
		JLabel label_7 = new JLabel("PLZ, Ort");
		label_7.setBounds(562, 71, 98, 14);
		pnl_fahrzeugverwaltung.add(label_7);
		
		JLabel label_8 = new JLabel("Stra\u00DFe, Nr.");
		label_8.setBounds(562, 102, 98, 14);
		pnl_fahrzeugverwaltung.add(label_8);
		
		textField_35 = new JTextField();
		textField_35.setText("Testhausen");
		textField_35.setColumns(10);
		textField_35.setBounds(753, 68, 165, 20);
		pnl_fahrzeugverwaltung.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setText("1");
		textField_36.setColumns(10);
		textField_36.setBounds(875, 99, 43, 20);
		pnl_fahrzeugverwaltung.add(textField_36);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 505, 1287, 237);
		pnl_fahrzeugverwaltung.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setFillsViewportHeight(true);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"R122", "\u00D6hringen", "Heilbronn", "2", "150", "12.12.2018"},
				{"R155", "Leipzig", "Jena", "5", "235", "10.01.2019"},
			},
			new String[] {
				"Route", "Start-Standort", "Ziel-Standort", "Anzahl Haltestellen", "Distanz", "Datum"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JLabel lblFahrzeugid = new JLabel("Fahrzeug-ID");
		lblFahrzeugid.setBounds(217, 43, 145, 14);
		pnl_fahrzeugverwaltung.add(lblFahrzeugid);
		
		txtF = new JTextField();
		txtF.setText("F12");
		txtF.setColumns(10);
		txtF.setBounds(372, 42, 136, 20);
		pnl_fahrzeugverwaltung.add(txtF);
		
		JLabel lblTyp = new JLabel("Typ");
		lblTyp.setBounds(217, 123, 145, 14);
		pnl_fahrzeugverwaltung.add(lblTyp);
		
		textField_21 = new JTextField();
		textField_21.setText("K\u00DCN-MS-1993");
		textField_21.setColumns(10);
		textField_21.setBounds(372, 122, 136, 20);
		pnl_fahrzeugverwaltung.add(textField_21);
		
		JButton btnNeu_2 = new JButton("Neu");
		btnNeu_2.setBounds(10, 420, 89, 23);
		pnl_fahrzeugverwaltung.add(btnNeu_2);
		
		JButton btnLschen_4 = new JButton("L\u00F6schen");
		btnLschen_4.setBounds(109, 420, 89, 23);
		pnl_fahrzeugverwaltung.add(btnLschen_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(217, 239, 840, 2);
		pnl_fahrzeugverwaltung.add(separator_5);
		
		JButton btnNewButton_2 = new JButton("Speichern");
		btnNewButton_2.setBounds(217, 252, 89, 23);
		pnl_fahrzeugverwaltung.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Abbrechen");
		btnNewButton_3.setBounds(316, 252, 89, 23);
		pnl_fahrzeugverwaltung.add(btnNewButton_3);
		
		this.lblStandortId = new JLabel("Standort ID");
		this.lblStandortId.setBounds(562, 43, 96, 14);
		pnl_fahrzeugverwaltung.add(this.lblStandortId);
		
		this.txtS = new JTextField();
		this.txtS.setText("S50");
		this.txtS.setBounds(670, 34, 86, 20);
		pnl_fahrzeugverwaltung.add(this.txtS);
		this.txtS.setColumns(10);
		
		this.pnl_standortverwaltung = new JPanel();
		this.tabbedPane.addTab("Standortverwaltung", null, this.pnl_standortverwaltung, null);
		this.pnl_standortverwaltung.setLayout(null);
		
		this.list_standorte = new JList();
		this.list_standorte.setModel(new AbstractListModel() {
			String[] values = new String[] {"S15", "S55", "S01"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		this.list_standorte.setSelectedIndex(0);
		this.list_standorte.setBounds(10, 38, 219, 377);
		this.pnl_standortverwaltung.add(this.list_standorte);
		
		this.btnNeuerStandort = new JButton("Neu");
		this.btnNeuerStandort.setBounds(10, 427, 89, 23);
		this.pnl_standortverwaltung.add(this.btnNeuerStandort);
		
		this.list_4 = new JList();
		this.list_4.setModel(new AbstractListModel() {
			String[] values = new String[] {"V12", "V25"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		this.list_4.setBounds(239, 38, 242, 377);
		this.pnl_standortverwaltung.add(this.list_4);
		
		this.lblStandorte = new JLabel("Standorte");
		this.lblStandorte.setBounds(10, 13, 127, 14);
		this.pnl_standortverwaltung.add(this.lblStandorte);
		
		this.lblFahrzeuge_1 = new JLabel("Fahrzeuge");
		this.lblFahrzeuge_1.setBounds(239, 13, 82, 14);
		this.pnl_standortverwaltung.add(this.lblFahrzeuge_1);
		
		this.list_5 = new JList();
		this.list_5.setModel(new AbstractListModel() {
			String[] values = new String[] {"F155", "F22", "F10"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		this.list_5.setBounds(491, 38, 242, 377);
		this.pnl_standortverwaltung.add(this.list_5);
		
		this.lblFahrer_4 = new JLabel("Fahrer");
		this.lblFahrer_4.setBounds(491, 13, 89, 14);
		this.pnl_standortverwaltung.add(this.lblFahrer_4);
		
		this.btnLschen_5 = new JButton("L\u00F6schen");
		this.btnLschen_5.setBounds(109, 426, 89, 23);
		this.pnl_standortverwaltung.add(this.btnLschen_5);
		
		this.btnHinzufgen_1 = new JButton("Hinzuf\u00FCgen");
		this.btnHinzufgen_1.setBounds(239, 427, 89, 23);
		this.pnl_standortverwaltung.add(this.btnHinzufgen_1);
		
		this.btnEntfernen_1 = new JButton("Entfernen");
		this.btnEntfernen_1.setBounds(338, 427, 89, 23);
		this.pnl_standortverwaltung.add(this.btnEntfernen_1);
		
		this.btnHinzufgen_2 = new JButton("Hinzuf\u00FCgen");
		this.btnHinzufgen_2.setBounds(491, 427, 89, 23);
		this.pnl_standortverwaltung.add(this.btnHinzufgen_2);
		
		this.btnEntfernen_2 = new JButton("Entfernen");
		this.btnEntfernen_2.setBounds(590, 427, 89, 23);
		this.pnl_standortverwaltung.add(this.btnEntfernen_2);
		
		this.lblName = new JLabel("Name");
		this.lblName.setBounds(10, 485, 89, 14);
		this.pnl_standortverwaltung.add(this.lblName);
		
		this.lblStandortid = new JLabel("Standort-ID");
		this.lblStandortid.setBounds(10, 510, 89, 14);
		this.pnl_standortverwaltung.add(this.lblStandortid);
		
		this.textField_13 = new JTextField();
		this.textField_13.setText("12346");
		this.textField_13.setColumns(10);
		this.textField_13.setBounds(118, 535, 73, 20);
		this.pnl_standortverwaltung.add(this.textField_13);
		
		this.textField_18 = new JTextField();
		this.textField_18.setText("Nestar\u00DFe");
		this.textField_18.setColumns(10);
		this.textField_18.setBounds(118, 566, 195, 20);
		this.pnl_standortverwaltung.add(this.textField_18);
		
		this.label_9 = new JLabel("PLZ, Ort");
		this.label_9.setBounds(10, 538, 98, 14);
		this.pnl_standortverwaltung.add(this.label_9);
		
		this.label_10 = new JLabel("Stra\u00DFe, Nr.");
		this.label_10.setBounds(10, 569, 98, 14);
		this.pnl_standortverwaltung.add(this.label_10);
		
		this.textField_24 = new JTextField();
		this.textField_24.setText("Testhausen");
		this.textField_24.setColumns(10);
		this.textField_24.setBounds(201, 535, 165, 20);
		this.pnl_standortverwaltung.add(this.textField_24);
		
		this.textField_25 = new JTextField();
		this.textField_25.setText("1");
		this.textField_25.setColumns(10);
		this.textField_25.setBounds(323, 566, 43, 20);
		this.pnl_standortverwaltung.add(this.textField_25);
		
		this.txtS_1 = new JTextField();
		this.txtS_1.setText("S15");
		this.txtS_1.setBounds(118, 507, 73, 20);
		this.pnl_standortverwaltung.add(this.txtS_1);
		this.txtS_1.setColumns(10);
		
		this.txtMosbach = new JTextField();
		this.txtMosbach.setText("Mosbach -1 ");
		this.txtMosbach.setBounds(118, 482, 248, 20);
		this.pnl_standortverwaltung.add(this.txtMosbach);
		this.txtMosbach.setColumns(10);
		
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
