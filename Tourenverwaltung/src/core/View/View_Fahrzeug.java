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
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class View_Fahrzeug {	
	private JPanel pnl_fahrzeugverwaltung;
	private JLabel lblFahrzeuge;
	private JList list_3;
	private JLabel lblKennzeichen;
	private JLabel lblMarke;
	private JLabel lblVersicherungsnummer;
	private JTextField txtKnms;
	private JTextField txtMan;
	private JTextField textField_22;
	private JLabel lblSitzpltze;
	private JTextField textField_23;
	private JLabel lblFahrzeuginformationen;
	private JLabel lblBehindertenGerecht;
	private JRadioButton rdbtnJa;
	private JRadioButton rdbtnNein;
	private JLabel lblStandortdaten;
	private JTextField textField_33;
	private JTextField textField_34;
	private JLabel label_8;
	private JLabel label_7;
	private JTextField textField_35;
	private JTextField textField_36;
	private JScrollPane scrollPane_2;
	private JTable table_2;
	private JLabel lblFahrzeugid;
	private JTextField txtF;
	private JLabel lblTyp;
	private JTextField textField_21;
	private JButton btnLschen_4;
	private JButton btnNeu_2;
	private JButton btnNewButton_2;
	private JSeparator separator_5;
	private JButton btnNewButton_3;
	private JLabel lblStandortId;
	private JTextField txtS;
	
	public View_Fahrzeug()
	{
		this.createComp();
	}
	private void createComp()
	{
		this.pnl_fahrzeugverwaltung = new JPanel();
		this.pnl_fahrzeugverwaltung.setLayout(null);
		
		this.lblFahrzeuge = new JLabel("Fahrzeuge");
		this.lblFahrzeuge.setBounds(10, 11, 82, 14);
		this.pnl_fahrzeugverwaltung.add(this.lblFahrzeuge);
		
		this.list_3 = new JList();
		this.list_3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.list_3.setModel(new AbstractListModel() {
			String[] values = new String[] {"V12", "V1", "V5"};
			@Override
			public int getSize() {
				return this.values.length;
			}
			@Override
			public Object getElementAt(int index) {
				return this.values[index];
			}
		});
		this.list_3.setSelectedIndex(0);
		this.list_3.setBounds(10, 36, 197, 373);
		this.pnl_fahrzeugverwaltung.add(this.list_3);
		
		this.lblKennzeichen = new JLabel("Kennzeichen");
		this.lblKennzeichen.setBounds(217, 73, 145, 14);
		this.pnl_fahrzeugverwaltung.add(this.lblKennzeichen);
		
		this.lblMarke = new JLabel("Marke");
		this.lblMarke.setBounds(217, 98, 145, 14);
		this.pnl_fahrzeugverwaltung.add(this.lblMarke);
		
		this.lblVersicherungsnummer = new JLabel("Versicherungsnummer");
		this.lblVersicherungsnummer.setBounds(217, 149, 145, 14);
		this.pnl_fahrzeugverwaltung.add(this.lblVersicherungsnummer);
		
		this.txtKnms = new JTextField();
		this.txtKnms.setText("K\u00DCN-MS-1993");
		this.txtKnms.setBounds(372, 72, 136, 20);
		this.pnl_fahrzeugverwaltung.add(this.txtKnms);
		this.txtKnms.setColumns(10);
		
		this.txtMan = new JTextField();
		this.txtMan.setColumns(10);
		this.txtMan.setBounds(371, 97, 136, 20);
		this.pnl_fahrzeugverwaltung.add(this.txtMan);
		
		this.textField_22 = new JTextField();
		this.textField_22.setColumns(10);
		this.textField_22.setBounds(371, 148, 136, 20);
		this.pnl_fahrzeugverwaltung.add(this.textField_22);
		
		this.lblSitzpltze = new JLabel("Sitzpl\u00E4tze");
		this.lblSitzpltze.setBounds(217, 177, 145, 14);
		this.pnl_fahrzeugverwaltung.add(this.lblSitzpltze);
		
		this.textField_23 = new JTextField();
		this.textField_23.setText("5");
		this.textField_23.setColumns(10);
		this.textField_23.setBounds(372, 176, 136, 20);
		this.pnl_fahrzeugverwaltung.add(this.textField_23);
		
		this.lblFahrzeuginformationen = new JLabel("Fahrzeuginformationen");
		this.lblFahrzeuginformationen.setBounds(217, 11, 118, 14);
		this.pnl_fahrzeugverwaltung.add(this.lblFahrzeuginformationen);
		
		this.lblBehindertenGerecht = new JLabel("Behindertengerecht");
		this.lblBehindertenGerecht.setBounds(217, 202, 145, 14);
		this.pnl_fahrzeugverwaltung.add(this.lblBehindertenGerecht);
		
		this.rdbtnJa = new JRadioButton("ja");
		this.rdbtnJa.setBounds(372, 203, 47, 23);
		this.pnl_fahrzeugverwaltung.add(this.rdbtnJa);
		
		this.rdbtnNein = new JRadioButton("Nein");
		this.rdbtnNein.setSelected(true);
		this.rdbtnNein.setBounds(421, 203, 58, 23);
		this.pnl_fahrzeugverwaltung.add(this.rdbtnNein);
		
		this.lblStandortdaten = new JLabel("Standortdaten");
		this.lblStandortdaten.setBounds(562, 11, 118, 14);
		this.pnl_fahrzeugverwaltung.add(this.lblStandortdaten);
		
		this.textField_33 = new JTextField();
		this.textField_33.setText("12346");
		this.textField_33.setColumns(10);
		this.textField_33.setBounds(670, 68, 73, 20);
		this.pnl_fahrzeugverwaltung.add(this.textField_33);
		
		this.textField_34 = new JTextField();
		this.textField_34.setText("Nestar\u00DFe");
		this.textField_34.setColumns(10);
		this.textField_34.setBounds(670, 99, 195, 20);
		this.pnl_fahrzeugverwaltung.add(this.textField_34);
		
		this.label_7 = new JLabel("PLZ, Ort");
		this.label_7.setBounds(562, 71, 98, 14);
		this.pnl_fahrzeugverwaltung.add(this.label_7);
		
		this.label_8 = new JLabel("Stra\u00DFe, Nr.");
		this.label_8.setBounds(562, 102, 98, 14);
		this.pnl_fahrzeugverwaltung.add(this.label_8);
		
		this.textField_35 = new JTextField();
		this.textField_35.setText("Testhausen");
		this.textField_35.setColumns(10);
		this.textField_35.setBounds(753, 68, 165, 20);
		this.pnl_fahrzeugverwaltung.add(this.textField_35);
		
		this.textField_36 = new JTextField();
		this.textField_36.setText("1");
		this.textField_36.setColumns(10);
		this.textField_36.setBounds(875, 99, 43, 20);
		this.pnl_fahrzeugverwaltung.add(this.textField_36);
		
		this.scrollPane_2 = new JScrollPane();
		this.scrollPane_2.setBounds(10, 505, 1287, 237);
		this.pnl_fahrzeugverwaltung.add(this.scrollPane_2);
		
		this.table_2 = new JTable();
		this.table_2.setFillsViewportHeight(true);
		this.table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"R122", "\u00D6hringen", "Heilbronn", "2", "150", "12.12.2018"},
				{"R155", "Leipzig", "Jena", "5", "235", "10.01.2019"},
			},
			new String[] {
				"Route", "Start-Standort", "Ziel-Standort", "Anzahl Haltestellen", "Distanz", "Datum"
			}
		));
		this.scrollPane_2.setViewportView(this.table_2);
		
		this.lblFahrzeugid = new JLabel("Fahrzeug-ID");
		this.lblFahrzeugid.setBounds(217, 43, 145, 14);
		this.pnl_fahrzeugverwaltung.add(this.lblFahrzeugid);
		
		this.txtF = new JTextField();
		this.txtF.setText("F12");
		this.txtF.setColumns(10);
		this.txtF.setBounds(372, 42, 136, 20);
		this.pnl_fahrzeugverwaltung.add(this.txtF);
		
		this.lblTyp = new JLabel("Typ");
		this.lblTyp.setBounds(217, 123, 145, 14);
		this.pnl_fahrzeugverwaltung.add(this.lblTyp);
		
		this.textField_21 = new JTextField();
		this.textField_21.setText("K\u00DCN-MS-1993");
		this.textField_21.setColumns(10);
		this.textField_21.setBounds(372, 122, 136, 20);
		this.pnl_fahrzeugverwaltung.add(this.textField_21);
		
		this.btnNeu_2 = new JButton("Neu");
		this.btnNeu_2.setBounds(10, 420, 89, 23);
		this.pnl_fahrzeugverwaltung.add(this.btnNeu_2);
		
		this.btnLschen_4 = new JButton("L\u00F6schen");
		this.btnLschen_4.setBounds(109, 420, 89, 23);
		this.pnl_fahrzeugverwaltung.add(this.btnLschen_4);
		
		this.separator_5 = new JSeparator();
		this.separator_5.setBounds(217, 239, 840, 2);
		this.pnl_fahrzeugverwaltung.add(this.separator_5);
		
		this.btnNewButton_2 = new JButton("Speichern");
		this.btnNewButton_2.setBounds(217, 252, 89, 23);
		this.pnl_fahrzeugverwaltung.add(this.btnNewButton_2);
		
		this.btnNewButton_3 = new JButton("Abbrechen");
		this.btnNewButton_3.setBounds(316, 252, 89, 23);
		this.pnl_fahrzeugverwaltung.add(this.btnNewButton_3);
		
		this.lblStandortId = new JLabel("Standort ID");
		this.lblStandortId.setBounds(562, 43, 96, 14);
		this.pnl_fahrzeugverwaltung.add(this.lblStandortId);
		
		this.txtS = new JTextField();
		this.txtS.setText("S50");
		this.txtS.setBounds(670, 34, 86, 20);
		this.pnl_fahrzeugverwaltung.add(this.txtS);
		this.txtS.setColumns(10);
	}
	public JPanel getSubPanel()
	{
		return this.pnl_fahrzeugverwaltung;
	}
}
