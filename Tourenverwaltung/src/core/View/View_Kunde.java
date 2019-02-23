package core.View;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultListModel;
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
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class View_Kunde {

	private JPanel pnl_kundenverwaltung;
	
	private JTextField plz, name,street,telefon,vorname,ort,hausNr,txtK;
	
	private JLabel labelName, labelOrt,labelStreet,labelTelefon,lblAnschrift,lblKunden,lblKundennummer,lblHandicap, lblAuftrger;
	
	private JButton btnNeu_1;
	private JButton btnLschen_3;
	private JButton btnSpeichern_2;
	private JButton btnAbbrechen_2;
	
	private JRadioButton rdbtnJa_1;
	private JRadioButton rdbtnNein_1;	
	private ButtonGroup group;
	
	private JSeparator separator_2;
	private JSeparator separator_3;
	
	private JScrollPane scrollPane_1;
	private DefaultListModel<String> kundenListenModel;
	private JList<String> kundenlist;
	private JTable table_1;
	
	public View_Kunde() {
		this.createComp();
	}
	
	private void createComp() {
		this.pnl_kundenverwaltung = new JPanel();		
		this.pnl_kundenverwaltung.setLayout(null);
		
		this.name = new JTextField();
		this.name.setColumns(10);
		this.name.setBounds(381, 36, 119, 20);
		this.pnl_kundenverwaltung.add(this.name);
		
		this.plz = new JTextField();
		this.plz.setColumns(10);
		this.plz.setBounds(381, 67, 73, 20);
		this.pnl_kundenverwaltung.add(this.plz);
		
		this.street = new JTextField();
		this.street.setColumns(10);
		this.street.setBounds(381, 98, 195, 20);
		this.pnl_kundenverwaltung.add(this.street);
		
		this.telefon = new JTextField();
		this.telefon.setColumns(10);
		this.telefon.setBounds(381, 129, 248, 20);
		this.pnl_kundenverwaltung.add(this.telefon);
		
		this.labelName = new JLabel("Name, Vorname");
		this.labelName.setBounds(273, 37, 98, 14);
		this.pnl_kundenverwaltung.add(this.labelName);
		
		this.labelOrt = new JLabel("PLZ, Ort");
		this.labelOrt.setBounds(273, 70, 98, 14);
		this.pnl_kundenverwaltung.add(this.labelOrt);
		
		this.labelStreet = new JLabel("Stra\u00DFe, Nr.");
		this.labelStreet.setBounds(273, 101, 98, 14);
		this.pnl_kundenverwaltung.add(this.labelStreet);
		
		this.labelTelefon = new JLabel("Telefon");
		this.labelTelefon.setBounds(273, 132, 98, 14);
		this.pnl_kundenverwaltung.add(this.labelTelefon);
		
		this.vorname = new JTextField();
		this.vorname.setColumns(10);
		this.vorname.setBounds(510, 36, 119, 20);
		this.pnl_kundenverwaltung.add(this.vorname);
		
		this.ort = new JTextField();
		this.ort.setColumns(10);
		this.ort.setBounds(464, 67, 165, 20);
		this.pnl_kundenverwaltung.add(this.ort);
		
		this.hausNr = new JTextField();
		this.hausNr.setColumns(10);
		this.hausNr.setBounds(586, 98, 43, 20);
		this.pnl_kundenverwaltung.add(this.hausNr);
		
		this.lblAnschrift = new JLabel("Anschrift");
		this.lblAnschrift.setBounds(273, 11, 46, 14);
		this.pnl_kundenverwaltung.add(this.lblAnschrift);
		
		kundenListenModel = new DefaultListModel<>();
		this.kundenlist = new JList<String>(kundenListenModel);
		this.kundenlist.setBounds(10, 36, 253, 377);
		this.kundenlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.pnl_kundenverwaltung.add(this.kundenlist);
		
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
		this.txtK.setColumns(10);
		this.txtK.setBounds(793, 36, 195, 20);
		this.txtK.setEnabled(false);
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
		
		this.group = new ButtonGroup();
		group.add(this.rdbtnJa_1);
		group.add(this.rdbtnNein_1);
	}
	
	//Getter
	public JPanel getSubPanel() {
		return this.pnl_kundenverwaltung;		
	}
	
	public int getCurrentSelectedCustomerId() {
		if(this.txtK.getText()==""||this.txtK.getText()==null)return -1;
		try {
		int id = Integer.parseInt(this.txtK.getText());
		return id;
		}catch(NumberFormatException e) {
			System.out.println("Es muss erst ein Datensatz ausgew‰hlt werden");
		}
		return -1;
	}
	
	public Map<String,String> getData() {
		Map<String,String> data = new HashMap<String,String>();
		
		data.put("name", this.name.getText());
		data.put("vorname", this.vorname.getText());
		data.put("plz", this.plz.getText());
		data.put("ort", this.ort.getText());
		data.put("street", this.street.getText());
		data.put("hausNr", this.hausNr.getText());
		data.put("telefon", this.telefon.getText());
		
		if(this.rdbtnJa_1.isSelected())data.put("handicap", "true");
		else data.put("handicap", "false");
		return data;
	}
	
	//Updaten der GUI
	public void updateList(String[] names) {
		this.kundenListenModel.clear();
		for(int i = 0;i<names.length;i++) {
			this.kundenListenModel.addElement(names[i]);
		}
	}
	
	public void updateGUIFromCustomer(Map<String,String> map) {
		this.name.setText(map.get("name"));
		this.vorname.setText(map.get("vorname"));
		this.plz.setText(map.get("plz"));
		this.ort.setText(map.get("ort"));
		this.street.setText(map.get("straﬂe"));
		this.hausNr.setText(map.get("hausNr"));
		this.telefon.setText(map.get("telefon"));
		this.txtK.setText(map.get("kundenId"));
		
		int handicap = Integer.parseInt(map.get("handicap"));
		if(handicap==1) {
			this.rdbtnJa_1.setSelected(true);
		}else {
			this.rdbtnNein_1.setSelected(true);
		}
	}
	
	public void setListSelectionOn(int id) {
		this.kundenlist.setSelectedIndex(id);
	}
	
	//Bind Handler
	public void addListHandler(MouseListener mouse)
	{
		this.kundenlist.addMouseListener(mouse);
	}
	public void addSavingListener(ActionListener al)
	{
		btnSpeichern_2.addActionListener(al);
	}
	public void addDeletingListener(ActionListener al)
	{
		btnLschen_3.addActionListener(al);
	}
	public void addAddingListener(ActionListener al)
	{
		btnNeu_1.addActionListener(al);
	}
	public void addResetListener(ActionListener al)
	{
		btnAbbrechen_2.addActionListener(al);
	}
}
