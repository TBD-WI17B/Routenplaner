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

public class View_Kunde extends JPanel{

	private JTextField txtDude;
	private JTextField textField_14,textField_15,textField_16,textField_17,txtTim,textField_19,textField_20;
	private JLabel label,label_1,label_3,label_4,label_5,label_6,lblKunden;
	private JButton btnNeu_1,btnLschen_3,btnSpeichern_2,btnAbbrechen_2;
	private JSeparator separator_2;
	private JLabel lblKundennummer;
	private JTextField txtK;
	private JScrollPane scrollPane_1;
	private JTable table_1;
	private JLabel lblHandicap;
	private JRadioButton rdbtnJa_1;
	private JRadioButton rdbtnNein_1;
	private JList list_2;
	
	public View_Kunde() {
		setLayout(null);
		txtDude = new JTextField();
		txtDude.setText("Dude");
		txtDude.setColumns(10);
		txtDude.setBounds(381, 36, 119, 20);
		add(txtDude);
		
		textField_14 = new JTextField();
		textField_14.setText("12346");
		textField_14.setColumns(10);
		textField_14.setBounds(381, 67, 73, 20);
		add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("Nestar\u00DFe");
		textField_15.setColumns(10);
		textField_15.setBounds(381, 98, 195, 20);
		add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText("01234568");
		textField_16.setColumns(10);
		textField_16.setBounds(381, 129, 248, 20);
		add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("012345644");
		textField_17.setColumns(10);
		textField_17.setBounds(381, 160, 248, 20);
		add(textField_17);
		
		label = new JLabel("Name, Vorname");
		label.setBounds(273, 37, 98, 14);
		add(label);
		
		label_1 = new JLabel("PLZ, Ort");
		label_1.setBounds(273, 70, 98, 14);
		add(label_1);
		
		label_3 = new JLabel("Stra\u00DFe, Nr.");
		label_3.setBounds(273, 101, 98, 14);
		add(label_3);
		
		label_4 = new JLabel("Telefon");
		label_4.setBounds(273, 132, 98, 14);
		add(label_4);
		
		label_5 = new JLabel("Mobil");
		label_5.setBounds(273, 163, 98, 14);
		add(label_5);
		
		txtTim = new JTextField();
		txtTim.setText("Tim");
		txtTim.setColumns(10);
		txtTim.setBounds(510, 36, 119, 20);
		add(txtTim);
		
		textField_19 = new JTextField();
		textField_19.setText("Testhausen");
		textField_19.setColumns(10);
		textField_19.setBounds(464, 67, 165, 20);
		add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText("1");
		textField_20.setColumns(10);
		textField_20.setBounds(586, 98, 43, 20);
		add(textField_20);
		
		label_6 = new JLabel("Anschrift");
		label_6.setBounds(273, 11, 46, 14);
		add(label_6);
		
		list_2 = new JList();
		
		list_2.setSelectedIndex(0);
		list_2.setBounds(10, 36, 253, 377);
		add(list_2);
		
		lblKunden = new JLabel("Kunden");
		lblKunden.setBounds(10, 11, 46, 14);
		add(lblKunden);
		
		btnNeu_1 = new JButton("Neu");
		btnNeu_1.setBounds(10, 424, 89, 23);
		add(btnNeu_1);
		
		btnLschen_3 = new JButton("L\u00F6schen");
		btnLschen_3.setBounds(109, 424, 89, 23);
		add(btnLschen_3);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(273, 213, 689, 2);
		add(separator_2);
		
		btnSpeichern_2 = new JButton("Speichern");
		btnSpeichern_2.setBounds(273, 226, 89, 23);
		add(btnSpeichern_2);
		
		btnAbbrechen_2 = new JButton("Abbrechen");
		btnAbbrechen_2.setBounds(381, 226, 89, 23);
		add(btnAbbrechen_2);
		
		lblKundennummer = new JLabel("Kundennummer");
		lblKundennummer.setBounds(694, 39, 89, 14);
		add(lblKundennummer);
		
		txtK = new JTextField();
		txtK.setText("K135");
		txtK.setColumns(10);
		txtK.setBounds(793, 36, 195, 20);
		add(txtK);
		
		JLabel lblAuftrger = new JLabel("Auftr\u00E4ge");
		lblAuftrger.setBounds(10, 496, 98, 14);
		add(lblAuftrger);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 458, 974, 2);
		add(separator_3);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 521, 1233, 207);
		add(scrollPane_1);
		
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
		
		lblHandicap = new JLabel("Handicap");
		lblHandicap.setBounds(694, 70, 89, 14);
		add(this.lblHandicap);
		
		rdbtnJa_1 = new JRadioButton("Ja");
		rdbtnJa_1.setBounds(793, 66, 43, 23);
		add(this.rdbtnJa_1);
		
		rdbtnNein_1 = new JRadioButton("Nein");
		rdbtnNein_1.setSelected(true);
		rdbtnNein_1.setBounds(838, 66, 55, 23);
		add(this.rdbtnNein_1);
		setVisible(true);
	}
	
	public void updateList(String[] names) {
		list_2.setModel(new AbstractListModel() {
			String[] values = names;
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
	}
}
