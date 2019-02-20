package core.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;

import core.Model.Model;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.ListSelectionModel;
import java.awt.Component;

public class View {
	//TODO Bennen die Variablen bitte mit Sinn Manu ^^ (TextField_2)
	
	//Models
	private Model model;
	private View_Auftrag auftrag;
	private View_Fahrer fahrer;
	private View_Fahrzeug fahrzeug;
	private View_Kunde kunde;
	private View_Route route;
	
	//Globale Fenster Einstellungen
	private int x = 100;
	private int y= 100;
	private int height= 840;
	private int width = 1340;

	private JFrame frmTourenverwaltung;
	
	private JPanel pnl_test, pnl_auftragsverwaltung, pnl_standortverwaltung, test;
	
	private JTextArea txttest;
	private JMenuBar menuBar;
	private JTabbedPane tabbedPane;
	private JButton btnNewButton;
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
		this.route = new View_Route();
		
		initialize();	
	}

	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * Wenn möglich hier kein Custom Code, da hier alles auto generiert wird.
	 */

	
	public void addTabbed(String name,JPanel p) {
		tabbedPane.addTab(name, null, p, null);
	}
	
	private void initialize() {
		frmTourenverwaltung = new JFrame();
		frmTourenverwaltung.setIconImage(Toolkit.getDefaultToolkit().getImage(View.class.getResource("/images/72-200.png")));
		frmTourenverwaltung.setTitle("Tourenverwaltung");
		frmTourenverwaltung.setBounds(x, y, width, height);
		frmTourenverwaltung.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		tabbedPane = new JTabbedPane(SwingConstants.TOP);
		
		frmTourenverwaltung.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		//Test ausgelagterte SubPanels
		route = new View_Route();		
		test = new JPanel();
		for (Component comp : route.getComp()) {
			test.add(comp);
			//System.out.println(comp);
		}
		//test = route.getSubPanel();
		tabbedPane.addTab("Routenplaner", null, test, null);
		
		
		fahrer = new View_Fahrer();
		tabbedPane.addTab("Fahrerverwaltung", null, fahrer.getSubPanel(), null);
		
		
		pnl_auftragsverwaltung = new JPanel();
		tabbedPane.addTab("Auftragsverwaltung", null, pnl_auftragsverwaltung, null);
		this.pnl_auftragsverwaltung.setLayout(null);
		
		this.lblAuftrge = new JLabel("Auftr\u00E4ge");
		this.lblAuftrge.setBounds(10, 11, 46, 14);
		this.pnl_auftragsverwaltung.add(this.lblAuftrge);
		
		this.list_1 = new JList();
		this.list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"A123", "A221", "A55"};
			@Override
			public int getSize() {
				return values.length;
			}
			@Override
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		this.list_1.setBounds(10, 36, 206, 410);
		this.pnl_auftragsverwaltung.add(this.list_1);
		
		this.btnNeuerAuftrag = new JButton("Neuer Auftrag");
		this.btnNeuerAuftrag.setBounds(10, 457, 101, 23);
		this.pnl_auftragsverwaltung.add(this.btnNeuerAuftrag);
		
		this.btnLschen_2 = new JButton("L\u00F6schen");
		this.btnLschen_2.setBounds(115, 457, 101, 23);
		this.pnl_auftragsverwaltung.add(this.btnLschen_2);
		
		this.lblAuftragsnummer_1 = new JLabel("Auftragsnummer");
		this.lblAuftragsnummer_1.setBounds(244, 57, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblAuftragsnummer_1);
		
		this.lblFahrer_2 = new JLabel("Kunde");
		this.lblFahrer_2.setBounds(244, 82, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblFahrer_2);
		
		this.lblRoute = new JLabel("Buchungsdatum");
		this.lblRoute.setBounds(244, 107, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblRoute);
		
		this.label_2 = new JLabel("Auftragsnummer");
		this.label_2.setBounds(244, 132, 101, 14);
		this.pnl_auftragsverwaltung.add(this.label_2);
		
		this.textField_2 = new JTextField();
		this.textField_2.setBounds(355, 54, 163, 20);
		this.pnl_auftragsverwaltung.add(this.textField_2);
		this.textField_2.setColumns(10);
		
		this.textField_5 = new JTextField();
		this.textField_5.setColumns(10);
		this.textField_5.setBounds(355, 79, 163, 20);
		this.pnl_auftragsverwaltung.add(this.textField_5);
		
		this.textField_6 = new JTextField();
		this.textField_6.setColumns(10);
		this.textField_6.setBounds(355, 104, 163, 20);
		this.pnl_auftragsverwaltung.add(this.textField_6);
		
		this.textField_7 = new JTextField();
		this.textField_7.setColumns(10);
		this.textField_7.setBounds(355, 129, 163, 20);
		this.pnl_auftragsverwaltung.add(this.textField_7);
		
		this.lblFahrer_3 = new JLabel("Fahrer");
		this.lblFahrer_3.setBounds(581, 59, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblFahrer_3);
		
		this.lblAusfhrdatum = new JLabel("Datum");
		this.lblAusfhrdatum.setBounds(581, 84, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblAusfhrdatum);
		
		this.lblRoute_1 = new JLabel("Route");
		this.lblRoute_1.setBounds(581, 109, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblRoute_1);
		
		this.lblZiel = new JLabel("Start");
		this.lblZiel.setBounds(581, 134, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblZiel);
		
		this.textField_9 = new JTextField();
		this.textField_9.setColumns(10);
		this.textField_9.setBounds(692, 56, 136, 20);
		this.pnl_auftragsverwaltung.add(this.textField_9);
		
		this.textField_10 = new JTextField();
		this.textField_10.setColumns(10);
		this.textField_10.setBounds(692, 81, 136, 20);
		this.pnl_auftragsverwaltung.add(this.textField_10);
		
		this.textField_11 = new JTextField();
		this.textField_11.setColumns(10);
		this.textField_11.setBounds(692, 106, 136, 20);
		this.pnl_auftragsverwaltung.add(this.textField_11);
		
		this.textField_12 = new JTextField();
		this.textField_12.setColumns(10);
		this.textField_12.setBounds(692, 131, 136, 20);
		this.pnl_auftragsverwaltung.add(this.textField_12);
		
		this.lblZiel_1 = new JLabel("Ziel");
		this.lblZiel_1.setBounds(581, 162, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblZiel_1);
		
		this.textField_8 = new JTextField();
		this.textField_8.setColumns(10);
		this.textField_8.setBounds(692, 159, 136, 20);
		this.pnl_auftragsverwaltung.add(this.textField_8);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(245, 276, 889, 2);
		pnl_auftragsverwaltung.add(separator_1);
		
		JButton btnSpeichern_1 = new JButton("Speichern");
		btnSpeichern_1.setBounds(245, 289, 89, 23);
		pnl_auftragsverwaltung.add(btnSpeichern_1);
		
		JButton btnAbbrechen_1 = new JButton("Abbrechen");
		btnAbbrechen_1.setBounds(344, 289, 89, 23);
		pnl_auftragsverwaltung.add(btnAbbrechen_1);
		
		JLabel lblDistanz_1 = new JLabel("Distanz");
		lblDistanz_1.setBounds(244, 177, 101, 14);
		pnl_auftragsverwaltung.add(lblDistanz_1);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(355, 174, 136, 20);
		pnl_auftragsverwaltung.add(textField_26);
		
		JLabel lblBetrag = new JLabel("Betrag");
		lblBetrag.setBounds(244, 205, 101, 14);
		pnl_auftragsverwaltung.add(lblBetrag);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(355, 202, 136, 20);
		pnl_auftragsverwaltung.add(textField_27);
		
		JLabel lblSteuercode = new JLabel("Steuercode");
		lblSteuercode.setBounds(886, 59, 101, 14);
		pnl_auftragsverwaltung.add(lblSteuercode);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(997, 56, 136, 20);
		pnl_auftragsverwaltung.add(textField_28);
		
		JLabel lblNetto = new JLabel("Netto");
		lblNetto.setBounds(886, 87, 101, 14);
		pnl_auftragsverwaltung.add(lblNetto);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(997, 84, 136, 20);
		pnl_auftragsverwaltung.add(textField_29);
		
		JLabel lblBrutto = new JLabel("Brutto");
		lblBrutto.setBounds(886, 117, 101, 14);
		pnl_auftragsverwaltung.add(lblBrutto);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(997, 114, 136, 20);
		pnl_auftragsverwaltung.add(textField_30);
		
		JLabel lblPauschale = new JLabel("Pauschale");
		lblPauschale.setBounds(886, 145, 101, 14);
		pnl_auftragsverwaltung.add(lblPauschale);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(997, 142, 136, 20);
		pnl_auftragsverwaltung.add(textField_31);
		
		JLabel lblRechnungsinformation = new JLabel("Rechnungsinformation");
		lblRechnungsinformation.setBounds(886, 11, 114, 14);
		pnl_auftragsverwaltung.add(lblRechnungsinformation);
		
		JLabel lblGesamt = new JLabel("Gesamt");
		lblGesamt.setBounds(886, 202, 101, 14);
		pnl_auftragsverwaltung.add(lblGesamt);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(997, 199, 136, 20);
		pnl_auftragsverwaltung.add(textField_32);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(886, 174, 248, 2);
		pnl_auftragsverwaltung.add(separator_4);
		
		JButton btnRechnungErstellen = new JButton("Rechnung erstellen");
		btnRechnungErstellen.setBounds(1009, 289, 125, 23);
		pnl_auftragsverwaltung.add(btnRechnungErstellen);
		
		
		
		
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
