package core.View;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View_Standort {

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
	
	public View_Standort() {
		createComp();
	}
	/**
	 * Initialisierung der GUI-Komponenten
	 */
	private void createComp() {
		this.pnl_standortverwaltung = new JPanel();
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
	}
	public JPanel getSubPanel() {
		return pnl_standortverwaltung;
	}
}
