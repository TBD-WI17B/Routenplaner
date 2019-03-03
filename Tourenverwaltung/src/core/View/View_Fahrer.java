package core.View;

import java.awt.Container;

import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;

public class View_Fahrer{
	private JPanel pnl_fahrerverwaltung;
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
	private JScrollPane scrollPane;
	private JTable table;
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
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public View_Fahrer()
	{
		initComp();
	}
	/**
	 * Initialisierung der GUI-Komponenten
	 */
	private void initComp()
	{
		this.pnl_fahrerverwaltung = new JPanel();
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
		this.txtA.setText("F123");
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
				{"R123", "Mosbach", "Heilbronn", "123", "12.1.2019", "K100, K25, K14"},
				{"R122",  "Stuttgart", "Mosbach", "111", "20.2.2019", "K201, K122"},
				{"R22",  "Heilbronn", "Stuttgart", "50", "1.1.2019", "K15, K225, K147"},
			},
			new String[] {
				"Route", "Start-Standort", "Ziel-Standort", "Distanz", "Datum", "Kunden"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Object.class, Object.class, Object.class, Object.class
			};
			@Override
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		this.table.getColumnModel().getColumn(5).setPreferredWidth(71);
		
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
//		
//		this.btnNewButton_1 = new JButton("\u00DCbernehmen");
//		this.btnNewButton_1.setBounds(710, 212, 104, 23);
//		this.pnl_fahrerverwaltung.add(this.btnNewButton_1);
		
		this.btnSpeichern = new JButton("Speichern");
		this.btnSpeichern.setBounds(824, 212, 104, 23);
		this.pnl_fahrerverwaltung.add(this.btnSpeichern);
		
		this.btnAbbrechen = new JButton("Abbrechen");
		this.btnAbbrechen.setBounds(938, 212, 104, 23);
		this.pnl_fahrerverwaltung.add(this.btnAbbrechen);
		
		this.separator = new JSeparator();
		this.separator.setBounds(230, 200, 812, 1);
		this.pnl_fahrerverwaltung.add(this.separator);
	}
	public JPanel getSubPanel()
	{
		return pnl_fahrerverwaltung;
	}
}
