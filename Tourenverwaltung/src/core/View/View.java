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
import javax.swing.ButtonGroup;

public class View {
	
	private Model model;

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
	private final ButtonGroup buttonGroup = new ButtonGroup();
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
		frmTourenverwaltung.setBounds(100, 100, 1342, 841);
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
		frmTourenverwaltung.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		pnl_routenplaner = new JPanel();
		tabbedPane.addTab("Routenplaner", null, pnl_routenplaner, null);
		this.pnl_routenplaner.setLayout(null);
		
		this.lbl_map = new JLabel("");
		this.lbl_map.setVerticalAlignment(SwingConstants.TOP);
		this.lbl_map.setHorizontalAlignment(SwingConstants.RIGHT);
		this.lbl_map.setIcon(new ImageIcon(View.class.getResource("/images/500px-Karte_Deutschland.svg.png")));
		this.lbl_map.setBounds(795, 11, 508, 684);
		this.pnl_routenplaner.add(this.lbl_map);
		
		this.ls_routen = new JList();
		this.ls_routen.setValueIsAdjusting(true);
		this.ls_routen.setModel(new AbstractListModel() {
			String[] values = new String[] {"Route 1", "Route 2", "Route 3", "Mosbach - Heilbronn"};
			@Override
			public int getSize() {
				return values.length;
			}
			@Override
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		this.ls_routen.setSelectedIndex(0);
		this.ls_routen.setBounds(10, 36, 227, 217);
		this.pnl_routenplaner.add(this.ls_routen);
		
		this.lbl_routen = new JLabel("Routen");
		this.lbl_routen.setLabelFor(this.ls_routen);
		this.lbl_routen.setBounds(10, 11, 88, 14);
		this.pnl_routenplaner.add(this.lbl_routen);
		
		this.lbl_haltepunkte = new JLabel("Haltepunkte");
		this.lbl_haltepunkte.setBounds(269, 11, 98, 14);
		this.pnl_routenplaner.add(this.lbl_haltepunkte);
		
		this.ls_haltepunkte = new JList();
		this.ls_haltepunkte.setModel(new AbstractListModel() {
			String[] values = new String[] {"Mosbach", "\u00D6hringen", "Oedheim", "Stuttgart", "Heilbronx"};
			@Override
			public int getSize() {
				return values.length;
			}
			@Override
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		this.lbl_haltepunkte.setLabelFor(this.ls_haltepunkte);
		this.ls_haltepunkte.setBounds(269, 36, 227, 217);
		this.pnl_routenplaner.add(this.ls_haltepunkte);
		
		this.txtAuftragsnummer = new JTextField();
		this.txtAuftragsnummer.setText("Auftragsnummer");
		this.txtAuftragsnummer.setBounds(109, 373, 112, 20);
		this.pnl_routenplaner.add(this.txtAuftragsnummer);
		this.txtAuftragsnummer.setColumns(10);
		
		this.txtFahrer = new JTextField();
		this.txtFahrer.setText("Fahrer");
		this.txtFahrer.setBounds(109, 404, 86, 20);
		this.pnl_routenplaner.add(this.txtFahrer);
		this.txtFahrer.setColumns(10);
		
		this.txtKm = new JTextField();
		this.txtKm.setText("km");
		this.txtKm.setBounds(109, 466, 86, 20);
		this.pnl_routenplaner.add(this.txtKm);
		this.txtKm.setColumns(10);
		
		this.txtDauer = new JTextField();
		this.txtDauer.setText("dauer");
		this.txtDauer.setBounds(109, 435, 86, 20);
		this.pnl_routenplaner.add(this.txtDauer);
		this.txtDauer.setColumns(10);
		
		this.ls_fahrer = new JList();
		this.ls_fahrer.setModel(new AbstractListModel() {
			String[] values = new String[] {"Karl, M\u00FCller", "Heinz, Ketchup"};
			@Override
			public int getSize() {
				return values.length;
			}
			@Override
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		this.ls_fahrer.setSelectedIndex(0);
		this.ls_fahrer.setBounds(526, 36, 227, 217);
		this.pnl_routenplaner.add(this.ls_fahrer);
		
		this.lblNewLabel = new JLabel("Fahrer");
		this.lblNewLabel.setLabelFor(this.ls_fahrer);
		this.lblNewLabel.setBounds(526, 11, 88, 14);
		this.pnl_routenplaner.add(this.lblNewLabel);
		
		this.btnNeueRoute = new JButton("Neue Route");
		this.btnNeueRoute.setBounds(10, 264, 89, 23);
		this.pnl_routenplaner.add(this.btnNeueRoute);
		
		this.btnLschen = new JButton("L\u00F6schen");
		this.btnLschen.setBounds(109, 264, 89, 23);
		this.pnl_routenplaner.add(this.btnLschen);
		
		this.btnBearbeiten = new JButton("Bearbeiten");
		this.btnBearbeiten.setBounds(10, 298, 89, 23);
		this.pnl_routenplaner.add(this.btnBearbeiten);
		
		this.btnHinzufgen = new JButton("Hinzuf\u00FCgen");
		this.btnHinzufgen.setBounds(269, 264, 89, 23);
		this.pnl_routenplaner.add(this.btnHinzufgen);
		
		this.btnEntfernen = new JButton("Entfernen");
		this.btnEntfernen.setBounds(368, 264, 89, 23);
		this.pnl_routenplaner.add(this.btnEntfernen);
		
		this.btnZuweisen = new JButton("Zuweisen");
		this.btnZuweisen.setBounds(526, 264, 89, 23);
		this.pnl_routenplaner.add(this.btnZuweisen);
		
		this.lblAuftragsnummer = new JLabel("Auftragsnummer");
		this.lblAuftragsnummer.setBounds(10, 373, 88, 14);
		this.pnl_routenplaner.add(this.lblAuftragsnummer);
		
		this.lblFahrer = new JLabel("Fahrer");
		this.lblFahrer.setBounds(10, 404, 88, 14);
		this.pnl_routenplaner.add(this.lblFahrer);
		
		this.lblDauer = new JLabel("Dauer");
		this.lblDauer.setBounds(10, 435, 88, 14);
		this.pnl_routenplaner.add(this.lblDauer);
		
		this.lblDistanz = new JLabel("Distanz");
		this.lblDistanz.setBounds(10, 466, 88, 14);
		this.pnl_routenplaner.add(this.lblDistanz);
		
		this.lblInfos = new JLabel("Infos");
		this.lblInfos.setBounds(10, 497, 88, 14);
		this.pnl_routenplaner.add(this.lblInfos);
		
		this.lblInfos_1 = new JLabel("Infos");
		this.lblInfos_1.setBounds(10, 528, 88, 14);
		this.pnl_routenplaner.add(this.lblInfos_1);
		
		this.txtAbc = new JTextField();
		this.txtAbc.setText("abc");
		this.txtAbc.setColumns(10);
		this.txtAbc.setBounds(109, 497, 86, 20);
		this.pnl_routenplaner.add(this.txtAbc);
		
		this.txtZzz = new JTextField();
		this.txtZzz.setText("zzz");
		this.txtZzz.setColumns(10);
		this.txtZzz.setBounds(109, 528, 86, 20);
		this.pnl_routenplaner.add(this.txtZzz);
		
		this.lblZusatz = new JLabel("Zusatz");
		this.lblZusatz.setBounds(10, 553, 88, 14);
		this.pnl_routenplaner.add(this.lblZusatz);
		
		this.txtpnLoremIpsumOder = new JTextPane();
		this.txtpnLoremIpsumOder.setText("Lorem Ipsum oder so");
		this.txtpnLoremIpsumOder.setBounds(109, 559, 358, 118);
		this.pnl_routenplaner.add(this.txtpnLoremIpsumOder);
		
		pnl_fahrerverwaltung = new JPanel();
		tabbedPane.addTab("Fahrerverwaltung", null, pnl_fahrerverwaltung, null);
		this.pnl_fahrerverwaltung.setLayout(null);
		
		this.list = new JList();
		this.list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Karl, M\u00FCller", "Heinz, Ketchup"};
			@Override
			public int getSize() {
				return values.length;
			}
			@Override
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		this.list.setSelectedIndex(0);
		this.list.setBounds(10, 45, 210, 367);
		this.pnl_fahrerverwaltung.add(this.list);
		
		this.txtMller = new JTextField();
		this.txtMller.setText("M\u00FCller");
		this.txtMller.setBounds(338, 45, 119, 20);
		this.pnl_fahrerverwaltung.add(this.txtMller);
		this.txtMller.setColumns(10);
		
		this.textField_1 = new JTextField();
		this.textField_1.setText("12346");
		this.textField_1.setColumns(10);
		this.textField_1.setBounds(338, 76, 73, 20);
		this.pnl_fahrerverwaltung.add(this.textField_1);
		
		this.txtNestare = new JTextField();
		this.txtNestare.setText("Nestar\u00DFe");
		this.txtNestare.setColumns(10);
		this.txtNestare.setBounds(338, 107, 195, 20);
		this.pnl_fahrerverwaltung.add(this.txtNestare);
		
		this.textField_3 = new JTextField();
		this.textField_3.setText("01234568");
		this.textField_3.setColumns(10);
		this.textField_3.setBounds(338, 138, 248, 20);
		this.pnl_fahrerverwaltung.add(this.textField_3);
		
		this.textField_4 = new JTextField();
		this.textField_4.setText("012345644");
		this.textField_4.setColumns(10);
		this.textField_4.setBounds(338, 169, 248, 20);
		this.pnl_fahrerverwaltung.add(this.textField_4);
		
		this.lblNewLabel_1 = new JLabel("Name, Vorname");
		this.lblNewLabel_1.setBounds(230, 46, 98, 14);
		this.pnl_fahrerverwaltung.add(this.lblNewLabel_1);
		
		this.lblPlzOrt = new JLabel("PLZ, Ort");
		this.lblPlzOrt.setBounds(230, 79, 98, 14);
		this.pnl_fahrerverwaltung.add(this.lblPlzOrt);
		
		this.lblStrae = new JLabel("Stra\u00DFe, Nr.");
		this.lblStrae.setBounds(230, 110, 98, 14);
		this.pnl_fahrerverwaltung.add(this.lblStrae);
		
		this.lblTelefon = new JLabel("Telefon");
		this.lblTelefon.setBounds(230, 141, 98, 14);
		this.pnl_fahrerverwaltung.add(this.lblTelefon);
		
		this.lblMobil = new JLabel("Mobil");
		this.lblMobil.setBounds(230, 172, 98, 14);
		this.pnl_fahrerverwaltung.add(this.lblMobil);
		
		this.txtKarl = new JTextField();
		this.txtKarl.setText("Karl");
		this.txtKarl.setColumns(10);
		this.txtKarl.setBounds(467, 45, 119, 20);
		this.pnl_fahrerverwaltung.add(this.txtKarl);
		
		this.txtTesthausen = new JTextField();
		this.txtTesthausen.setText("Testhausen");
		this.txtTesthausen.setColumns(10);
		this.txtTesthausen.setBounds(421, 76, 165, 20);
		this.pnl_fahrerverwaltung.add(this.txtTesthausen);
		
		this.textField = new JTextField();
		this.textField.setText("1");
		this.textField.setColumns(10);
		this.textField.setBounds(543, 107, 43, 20);
		this.pnl_fahrerverwaltung.add(this.textField);
		
		this.lblAngestelltennummer = new JLabel("Angestelltennummer");
		this.lblAngestelltennummer.setBounds(686, 48, 98, 14);
		this.pnl_fahrerverwaltung.add(this.lblAngestelltennummer);
		
		this.txtA = new JTextField();
		this.txtA.setText("A123");
		this.txtA.setColumns(10);
		this.txtA.setBounds(794, 45, 248, 20);
		this.pnl_fahrerverwaltung.add(this.txtA);
		
		this.scrollPane = new JScrollPane();
		this.scrollPane.setBounds(10, 435, 953, 307);
		this.pnl_fahrerverwaltung.add(this.scrollPane);
		
		this.table = new JTable();
		this.table.setFillsViewportHeight(true);
		this.scrollPane.setViewportView(this.table);
		this.table.setModel(new DefaultTableModel(
			new Object[][] {
				{"R123", "A123", "Mosbach", "Heilbronn", "123", "12.1.2019", "K100"},
				{"R122", "A124", "Stuttgart", "Mosbach", "111", "20.2.2019", "K201"},
				{"R22", "A45", "Heilbronn", "Stuttgart", "50", "1.1.2019", "K15"},
			},
			new String[] {
				"Route", "Auftrag", "Start", "Ziel", "Distanz", "Datum", "Kunde"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, String.class, Object.class, Object.class, Object.class, Object.class
			};
			@Override
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		this.table.getColumnModel().getColumn(6).setPreferredWidth(71);
		
		this.lblStatus = new JLabel("Status");
		this.lblStatus.setBounds(686, 73, 98, 14);
		this.pnl_fahrerverwaltung.add(this.lblStatus);
		
		this.rdbtnAktiv = new JRadioButton("Aktiv");
		buttonGroup.add(this.rdbtnAktiv);
		this.rdbtnAktiv.setBounds(794, 72, 64, 23);
		this.pnl_fahrerverwaltung.add(this.rdbtnAktiv);
		
		this.rdbtnInaktiv = new JRadioButton("Inaktiv");
		buttonGroup.add(this.rdbtnInaktiv);
		this.rdbtnInaktiv.setBounds(860, 72, 64, 23);
		this.pnl_fahrerverwaltung.add(this.rdbtnInaktiv);
		
		this.lblFahrer_1 = new JLabel("Fahrer");
		this.lblFahrer_1.setBounds(10, 20, 46, 14);
		this.pnl_fahrerverwaltung.add(this.lblFahrer_1);
		
		this.lblAnschrift = new JLabel("Anschrift");
		this.lblAnschrift.setBounds(230, 20, 46, 14);
		this.pnl_fahrerverwaltung.add(this.lblAnschrift);
		
		this.lblInformationen = new JLabel("Informationen");
		this.lblInformationen.setBounds(686, 20, 98, 14);
		this.pnl_fahrerverwaltung.add(this.lblInformationen);
		
		this.btnNeu = new JButton("Neuer Fahrer");
		this.btnNeu.setBounds(230, 355, 104, 23);
		this.pnl_fahrerverwaltung.add(this.btnNeu);
		
		this.btnLschen_1 = new JButton("L\u00F6schen");
		this.btnLschen_1.setBounds(230, 389, 104, 23);
		this.pnl_fahrerverwaltung.add(this.btnLschen_1);
		
		this.btnNewButton_1 = new JButton("\u00DCbernehmen");
		this.btnNewButton_1.setBounds(710, 212, 104, 23);
		this.pnl_fahrerverwaltung.add(this.btnNewButton_1);
		
		this.btnSpeichern = new JButton("Speichern");
		this.btnSpeichern.setBounds(824, 212, 104, 23);
		this.pnl_fahrerverwaltung.add(this.btnSpeichern);
		
		this.btnAbbrechen = new JButton("Abbrechen");
		this.btnAbbrechen.setBounds(938, 212, 104, 23);
		this.pnl_fahrerverwaltung.add(this.btnAbbrechen);
		
		this.separator = new JSeparator();
		this.separator.setBounds(230, 200, 812, 1);
		this.pnl_fahrerverwaltung.add(this.separator);
		
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
		this.list_1.setBounds(10, 36, 206, 276);
		this.pnl_auftragsverwaltung.add(this.list_1);
		
		this.btnNeuerAuftrag = new JButton("Neuer Auftrag");
		this.btnNeuerAuftrag.setBounds(10, 323, 101, 23);
		this.pnl_auftragsverwaltung.add(this.btnNeuerAuftrag);
		
		this.btnLschen_2 = new JButton("L\u00F6schen");
		this.btnLschen_2.setBounds(115, 323, 101, 23);
		this.pnl_auftragsverwaltung.add(this.btnLschen_2);
		
		this.lblAuftragsnummer_1 = new JLabel("Auftragsnummer");
		this.lblAuftragsnummer_1.setBounds(245, 37, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblAuftragsnummer_1);
		
		this.lblFahrer_2 = new JLabel("Kunde");
		this.lblFahrer_2.setBounds(245, 62, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblFahrer_2);
		
		this.lblRoute = new JLabel("Buchungsdatum");
		this.lblRoute.setBounds(245, 87, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblRoute);
		
		this.label_2 = new JLabel("Auftragsnummer");
		this.label_2.setBounds(245, 112, 101, 14);
		this.pnl_auftragsverwaltung.add(this.label_2);
		
		this.textField_2 = new JTextField();
		this.textField_2.setBounds(356, 34, 86, 20);
		this.pnl_auftragsverwaltung.add(this.textField_2);
		this.textField_2.setColumns(10);
		
		this.textField_5 = new JTextField();
		this.textField_5.setColumns(10);
		this.textField_5.setBounds(356, 59, 86, 20);
		this.pnl_auftragsverwaltung.add(this.textField_5);
		
		this.textField_6 = new JTextField();
		this.textField_6.setColumns(10);
		this.textField_6.setBounds(356, 84, 86, 20);
		this.pnl_auftragsverwaltung.add(this.textField_6);
		
		this.textField_7 = new JTextField();
		this.textField_7.setColumns(10);
		this.textField_7.setBounds(356, 109, 86, 20);
		this.pnl_auftragsverwaltung.add(this.textField_7);
		
		this.lblFahrer_3 = new JLabel("Fahrer");
		this.lblFahrer_3.setBounds(582, 39, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblFahrer_3);
		
		this.lblAusfhrdatum = new JLabel("Datum");
		this.lblAusfhrdatum.setBounds(582, 64, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblAusfhrdatum);
		
		this.lblRoute_1 = new JLabel("Route");
		this.lblRoute_1.setBounds(582, 89, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblRoute_1);
		
		this.lblZiel = new JLabel("Start");
		this.lblZiel.setBounds(582, 114, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblZiel);
		
		this.textField_9 = new JTextField();
		this.textField_9.setColumns(10);
		this.textField_9.setBounds(693, 36, 86, 20);
		this.pnl_auftragsverwaltung.add(this.textField_9);
		
		this.textField_10 = new JTextField();
		this.textField_10.setColumns(10);
		this.textField_10.setBounds(693, 61, 86, 20);
		this.pnl_auftragsverwaltung.add(this.textField_10);
		
		this.textField_11 = new JTextField();
		this.textField_11.setColumns(10);
		this.textField_11.setBounds(693, 86, 86, 20);
		this.pnl_auftragsverwaltung.add(this.textField_11);
		
		this.textField_12 = new JTextField();
		this.textField_12.setColumns(10);
		this.textField_12.setBounds(693, 111, 86, 20);
		this.pnl_auftragsverwaltung.add(this.textField_12);
		
		this.lblZiel_1 = new JLabel("Ziel");
		this.lblZiel_1.setBounds(582, 142, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblZiel_1);
		
		this.textField_8 = new JTextField();
		this.textField_8.setColumns(10);
		this.textField_8.setBounds(693, 139, 86, 20);
		this.pnl_auftragsverwaltung.add(this.textField_8);
		
		pnl_kundenverwaltung = new JPanel();
		tabbedPane.addTab("Kundenverwaltung", null, pnl_kundenverwaltung, null);
		this.pnl_kundenverwaltung.setLayout(null);
		
		pnl_test = new JPanel();
		tabbedPane.addTab("test", null, pnl_test, null);
		pnl_test.setLayout(null);
		
		btnNewButton = new JButton("New button");
		this.btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(156, 26, 89, 23);
		
		pnl_test.add(btnNewButton);
		
		txttest = new JTextArea();
		txttest.setBounds(373, 5, 164, 94);
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
}
