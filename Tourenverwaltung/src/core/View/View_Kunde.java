package core.View;

import javax.swing.AbstractListModel;
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

public class View_Kunde {

	private JPanel pnl_kundenverwaltung;
	private JTextField textField_14;
	private JTextField txtDude;
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
	private JScrollPane scrollPane_1;
	private JSeparator separator_3;
	private JLabel lblAuftrger;
	private JList list_2;
	private JTable table_1;
	private JLabel lblHandicap;
	private JRadioButton rdbtnJa_1;
	private JRadioButton rdbtnNein_1;	
	
	public View_Kunde() {
		this.createComp();
	}
	
	private void createComp() {
		this.pnl_kundenverwaltung = new JPanel();		
		this.pnl_kundenverwaltung.setLayout(null);
		
		this.txtDude = new JTextField();
		this.txtDude.setText("Dude");
		this.txtDude.setColumns(10);
		this.txtDude.setBounds(381, 36, 119, 20);
		this.pnl_kundenverwaltung.add(this.txtDude);
		
		this.textField_14 = new JTextField();
		this.textField_14.setText("12346");
		this.textField_14.setColumns(10);
		this.textField_14.setBounds(381, 67, 73, 20);
		this.pnl_kundenverwaltung.add(this.textField_14);
		
		this.textField_15 = new JTextField();
		this.textField_15.setText("Nestar\u00DFe");
		this.textField_15.setColumns(10);
		this.textField_15.setBounds(381, 98, 195, 20);
		this.pnl_kundenverwaltung.add(this.textField_15);
		
		this.textField_16 = new JTextField();
		this.textField_16.setText("01234568");
		this.textField_16.setColumns(10);
		this.textField_16.setBounds(381, 129, 248, 20);
		this.pnl_kundenverwaltung.add(this.textField_16);
		
		this.textField_17 = new JTextField();
		this.textField_17.setText("012345644");
		this.textField_17.setColumns(10);
		this.textField_17.setBounds(381, 160, 248, 20);
		this.pnl_kundenverwaltung.add(this.textField_17);
		
		this.label = new JLabel("Name, Vorname");
		this.label.setBounds(273, 37, 98, 14);
		this.pnl_kundenverwaltung.add(this.label);
		
		this.label_1 = new JLabel("PLZ, Ort");
		this.label_1.setBounds(273, 70, 98, 14);
		this.pnl_kundenverwaltung.add(this.label_1);
		
		this.label_3 = new JLabel("Stra\u00DFe, Nr.");
		this.label_3.setBounds(273, 101, 98, 14);
		this.pnl_kundenverwaltung.add(this.label_3);
		
		this.label_4 = new JLabel("Telefon");
		this.label_4.setBounds(273, 132, 98, 14);
		this.pnl_kundenverwaltung.add(this.label_4);
		
		this.label_5 = new JLabel("Mobil");
		this.label_5.setBounds(273, 163, 98, 14);
		this.pnl_kundenverwaltung.add(this.label_5);
		
		this.txtTim = new JTextField();
		this.txtTim.setText("Tim");
		this.txtTim.setColumns(10);
		this.txtTim.setBounds(510, 36, 119, 20);
		this.pnl_kundenverwaltung.add(this.txtTim);
		
		this.textField_19 = new JTextField();
		this.textField_19.setText("Testhausen");
		this.textField_19.setColumns(10);
		this.textField_19.setBounds(464, 67, 165, 20);
		this.pnl_kundenverwaltung.add(this.textField_19);
		
		this.textField_20 = new JTextField();
		this.textField_20.setText("1");
		this.textField_20.setColumns(10);
		this.textField_20.setBounds(586, 98, 43, 20);
		this.pnl_kundenverwaltung.add(this.textField_20);
		
		this.label_6 = new JLabel("Anschrift");
		this.label_6.setBounds(273, 11, 46, 14);
		this.pnl_kundenverwaltung.add(this.label_6);
		
		this.list_2 = new JList();
		this.list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"K135", "K12"};
			@Override
			public int getSize() {
				return this.values.length;
			}
			@Override
			public Object getElementAt(int index) {
				return this.values[index];
			}
		});
		this.list_2.setSelectedIndex(0);
		this.list_2.setBounds(10, 36, 253, 377);
		this.pnl_kundenverwaltung.add(this.list_2);
		
		this.lblKunden = new JLabel("Kunden");
		this.lblKunden.setBounds(10, 11, 46, 14);
		this.pnl_kundenverwaltung.add(this.lblKunden);
		
		this.btnNeu_1 = new JButton("Neu");
		this.btnNeu_1.setBounds(10, 424, 89, 23);
		this.pnl_kundenverwaltung.add(this.btnNeu_1);
		
		this.btnLschen_3 = new JButton("L\u00F6schen");
		this.btnLschen_3.setBounds(109, 424, 89, 23);
		this.pnl_kundenverwaltung.add(this.btnLschen_3);
		
		this.separator_2 = new JSeparator();
		this.separator_2.setBounds(273, 213, 689, 2);
		this.pnl_kundenverwaltung.add(this.separator_2);
		
		this.btnSpeichern_2 = new JButton("Speichern");
		this.btnSpeichern_2.setBounds(273, 226, 89, 23);
		this.pnl_kundenverwaltung.add(this.btnSpeichern_2);
		
		this.btnAbbrechen_2 = new JButton("Abbrechen");
		this.btnAbbrechen_2.setBounds(381, 226, 89, 23);
		this.pnl_kundenverwaltung.add(this.btnAbbrechen_2);
		
		this.lblKundennummer = new JLabel("Kundennummer");
		this.lblKundennummer.setBounds(694, 39, 89, 14);
		this.pnl_kundenverwaltung.add(this.lblKundennummer);
		
		this.txtK = new JTextField();
		this.txtK.setText("K135");
		this.txtK.setColumns(10);
		this.txtK.setBounds(793, 36, 195, 20);
		this.pnl_kundenverwaltung.add(this.txtK);
		
		this.lblAuftrger = new JLabel("Auftr\u00E4ge");
		this.lblAuftrger.setBounds(10, 496, 98, 14);
		this.pnl_kundenverwaltung.add(this.lblAuftrger);
		
		this.separator_3 = new JSeparator();
		this.separator_3.setBounds(10, 458, 974, 2);
		this.pnl_kundenverwaltung.add(this.separator_3);
		
		this.scrollPane_1 = new JScrollPane();
		this.scrollPane_1.setBounds(10, 521, 1233, 207);
		this.pnl_kundenverwaltung.add(this.scrollPane_1);
		
		this.table_1 = new JTable();
		this.table_1.setFillsViewportHeight(true);
		this.scrollPane_1.setViewportView(this.table_1);
		this.table_1.setModel(new DefaultTableModel(
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
	}
	public JPanel getSubPanel() {
		return this.pnl_kundenverwaltung;		
	}
}
