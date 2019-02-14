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
import javax.swing.JCheckBox;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class View {
	
	private Model model;
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
	private JLabel lblKrankenkasse;
	private JTextField txtAokKln;
	private JLabel lblKundennummer;
	private JTextField txtK;
	private JTable table_1;
	private JScrollPane scrollPane_1;
	private JTextField txtKnms;
	private JTextField txtMan;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
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
		frmTourenverwaltung.setBounds(x, y, height, width);
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
		this.btnNeueRoute.setBounds(10, 264, 94, 23);
		this.pnl_routenplaner.add(this.btnNeueRoute);
		
		this.btnLschen = new JButton("L\u00F6schen");
		this.btnLschen.setBounds(114, 264, 123, 23);
		this.pnl_routenplaner.add(this.btnLschen);
		
		this.btnBearbeiten = new JButton("Bearbeiten");
		this.btnBearbeiten.setBounds(10, 298, 94, 23);
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
		
		JButton btnRoutenGenerieren = new JButton("Routen generieren");
		btnRoutenGenerieren.setBounds(114, 298, 123, 23);
		pnl_routenplaner.add(btnRoutenGenerieren);
		
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
		
		lblKrankenkasse = new JLabel("Krankenkasse");
		lblKrankenkasse.setBounds(694, 73, 89, 14);
		pnl_kundenverwaltung.add(lblKrankenkasse);
		
		txtAokKln = new JTextField();
		txtAokKln.setText("AOK K\u00F6ln");
		txtAokKln.setBounds(793, 70, 195, 20);
		pnl_kundenverwaltung.add(txtAokKln);
		txtAokKln.setColumns(10);
		
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
				{"K135", "Tim", "Dude", "A112", "N\u00FCrnberg", "Berlin", "20.3.2019", "400", "1501,35"},
				{"K135", "Tim", "Dude", "A155", "Berlin", "N\u00FCrnberg", "25.3.2019", "400", null},
			},
			new String[] {
				"Kunde", "Name", "Vorname", "Auftrag", "Start", "Ziel", "Datum", "Distanz", "Betrag"
			}
		));
		
		JPanel pnl_fahrzeugverwaltung = new JPanel();
		tabbedPane.addTab("Fahrzeuggverwaltung", null, pnl_fahrzeugverwaltung, null);
		pnl_fahrzeugverwaltung.setLayout(null);
		
		JLabel lblFahrzeuge = new JLabel("Fahrzeuge");
		lblFahrzeuge.setBounds(10, 11, 82, 14);
		pnl_fahrzeugverwaltung.add(lblFahrzeuge);
		
		JList list_3 = new JList();
		list_3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_3.setModel(new AbstractListModel() {
			String[] values = new String[] {"F12", "F1", "F5"};
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
		lblVersicherungsnummer.setBounds(217, 174, 145, 14);
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
		textField_22.setText("K\u00DCN-MS-1993");
		textField_22.setColumns(10);
		textField_22.setBounds(371, 173, 136, 20);
		pnl_fahrzeugverwaltung.add(textField_22);
		
		JLabel lblSitzpltze = new JLabel("Sitzpl\u00E4tze");
		lblSitzpltze.setBounds(217, 202, 145, 14);
		pnl_fahrzeugverwaltung.add(lblSitzpltze);
		
		JLabel lblMaxGewicht = new JLabel("Max. Gewicht");
		lblMaxGewicht.setBounds(217, 227, 145, 14);
		pnl_fahrzeugverwaltung.add(lblMaxGewicht);
		
		JLabel label_11 = new JLabel("Kennzeichen");
		label_11.setBounds(217, 252, 145, 14);
		pnl_fahrzeugverwaltung.add(label_11);
		
		textField_23 = new JTextField();
		textField_23.setText("K\u00DCN-MS-1993");
		textField_23.setColumns(10);
		textField_23.setBounds(372, 201, 136, 20);
		pnl_fahrzeugverwaltung.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setText("K\u00DCN-MS-1993");
		textField_24.setColumns(10);
		textField_24.setBounds(371, 226, 136, 20);
		pnl_fahrzeugverwaltung.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setText("K\u00DCN-MS-1993");
		textField_25.setColumns(10);
		textField_25.setBounds(371, 251, 136, 20);
		pnl_fahrzeugverwaltung.add(textField_25);
		
		lblFahrzeuginformationen = new JLabel("Fahrzeuginformationen");
		lblFahrzeuginformationen.setBounds(217, 11, 118, 14);
		pnl_fahrzeugverwaltung.add(lblFahrzeuginformationen);
		
		lblBehindertenGerecht = new JLabel("Behindertengerecht");
		lblBehindertenGerecht.setBounds(217, 277, 145, 14);
		pnl_fahrzeugverwaltung.add(lblBehindertenGerecht);
		
		JRadioButton rdbtnJa = new JRadioButton("ja");
		rdbtnJa.setBounds(372, 278, 47, 23);
		pnl_fahrzeugverwaltung.add(rdbtnJa);
		
		JRadioButton rdbtnNein = new JRadioButton("Nein");
		rdbtnNein.setSelected(true);
		rdbtnNein.setBounds(421, 278, 58, 23);
		pnl_fahrzeugverwaltung.add(rdbtnNein);
		
		JLabel lblStandortdaten = new JLabel("Standortdaten");
		lblStandortdaten.setBounds(562, 11, 118, 14);
		pnl_fahrzeugverwaltung.add(lblStandortdaten);
		
		textField_33 = new JTextField();
		textField_33.setText("12346");
		textField_33.setColumns(10);
		textField_33.setBounds(670, 48, 73, 20);
		pnl_fahrzeugverwaltung.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setText("Nestar\u00DFe");
		textField_34.setColumns(10);
		textField_34.setBounds(670, 79, 195, 20);
		pnl_fahrzeugverwaltung.add(textField_34);
		
		JLabel label_7 = new JLabel("PLZ, Ort");
		label_7.setBounds(562, 51, 98, 14);
		pnl_fahrzeugverwaltung.add(label_7);
		
		JLabel label_8 = new JLabel("Stra\u00DFe, Nr.");
		label_8.setBounds(562, 82, 98, 14);
		pnl_fahrzeugverwaltung.add(label_8);
		
		textField_35 = new JTextField();
		textField_35.setText("Testhausen");
		textField_35.setColumns(10);
		textField_35.setBounds(753, 48, 165, 20);
		pnl_fahrzeugverwaltung.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setText("1");
		textField_36.setColumns(10);
		textField_36.setBounds(875, 79, 43, 20);
		pnl_fahrzeugverwaltung.add(textField_36);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 505, 1287, 237);
		pnl_fahrzeugverwaltung.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setFillsViewportHeight(true);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"A123", "R122", "K12", "\u00D6hringen", "Heilbronn", "2", "150", "12.12.2018", null},
				{"A15", "R155", "K178", "Leipzig", "Jena", "5", "235", "10.01.2019", "20.12.2018"},
			},
			new String[] {
				"Auftrag", "Route", "Kunde", "Start", "Ziel", "Anzahl Haltestellen", "Distanz", "Datum", "Auftragsdatum"
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
		
		JLabel label_9 = new JLabel("Kennzeichen");
		label_9.setBounds(217, 149, 145, 14);
		pnl_fahrzeugverwaltung.add(label_9);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PKW", "BUS", "Limousine"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(372, 146, 136, 20);
		pnl_fahrzeugverwaltung.add(comboBox);
		
		JButton btnNeu_2 = new JButton("Neu");
		btnNeu_2.setBounds(10, 420, 89, 23);
		pnl_fahrzeugverwaltung.add(btnNeu_2);
		
		JButton btnLschen_4 = new JButton("L\u00F6schen");
		btnLschen_4.setBounds(109, 420, 89, 23);
		pnl_fahrzeugverwaltung.add(btnLschen_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(217, 314, 840, 2);
		pnl_fahrzeugverwaltung.add(separator_5);
		
		JButton btnNewButton_2 = new JButton("Speichern");
		btnNewButton_2.setBounds(217, 327, 89, 23);
		pnl_fahrzeugverwaltung.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Abbrechen");
		btnNewButton_3.setBounds(316, 327, 89, 23);
		pnl_fahrzeugverwaltung.add(btnNewButton_3);
		
		pnl_test = new JPanel();
		tabbedPane.addTab("test", null, pnl_test, null);
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
}
