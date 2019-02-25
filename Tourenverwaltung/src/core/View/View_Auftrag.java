package core.View;


import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;


import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class View_Auftrag {
	
	private JPanel pnl_auftragsverwaltung;
	
	private JLabel lblAuftrge;
	private JLabel lblAuftragsnummer_1;
	private JLabel lblAusfhrfahrtDatum;
	private JLabel lblFahrer_2;
	private JLabel lblRoute;
	private JLabel lblRoute_1;
	private JLabel lblZiel;
	private JLabel lblZiel_1;
	private JLabel lblDistanz_1;
	private JLabel lblNetto;
	private JLabel lblBrutto;
	private JLabel lblPauschale;
	private JLabel lblRechnungsinformation;
	private JLabel lblGesamt;
	
	private JTextField fahrtDatum;
	private JTextField route;
	private JTextField startPlz;
	private JTextField auftrag;
	private JTextField zielPlz;
	private JTextField lastChange;
	private JTextField distance;
	private JTextField netto;
	private JTextField brutto;
	private JTextField pauschale;
	private JTextField gesamt;
	private JTextField startOrt;
	private JTextField startStreet;
	private JTextField startHausNr;
	private JTextField zielOrt;
	private JTextField zielStreet;
	private JTextField zielHausNr;
	private JComboBox kunde;
	
	private JCheckBox startUseKundenadresse;
	private JCheckBox zielUseKundeAdresse;
	
	private JButton btnLschen_2;
	private JButton btnNeuerAuftrag;
	private JButton btnSpeichern_1;
	private JButton btnAbbrechen_1;
	private JButton btnRechnungErstellen;
	
	private JSeparator separator_1;
	private JSeparator separator_4;
	
	private DefaultListModel<String> auftragListenModel;
	private JList<String> auftragListe;
	
	public View_Auftrag(){
		createComp();
	}
	private void createComp() {
		pnl_auftragsverwaltung = new JPanel();
		this.pnl_auftragsverwaltung.setLayout(null);
		
		this.lblAuftrge = new JLabel("Aufträge");
		this.lblAuftrge.setBounds(10, 11, 46, 14);
		this.pnl_auftragsverwaltung.add(this.lblAuftrge);
		
		auftragListenModel = new DefaultListModel<>();
		this.auftragListe = new JList<String>(auftragListenModel);
		this.auftragListe.setBounds(10, 36, 206, 410);
		this.auftragListe.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.pnl_auftragsverwaltung.add(this.auftragListe);
		
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
		
		this.lblRoute = new JLabel("Letzte Änderung");
		this.lblRoute.setBounds(244, 107, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblRoute);
		
		this.auftrag = new JTextField();
		this.auftrag.setBounds(355, 54, 151, 20);
		this.auftrag.setEnabled(false);
		this.pnl_auftragsverwaltung.add(this.auftrag);
		this.auftrag.setColumns(10);
		
		this.kunde = new JComboBox();
		this.kunde.setBounds(355, 79, 151, 20);
		this.pnl_auftragsverwaltung.add(this.kunde);
		
		this.lastChange = new JTextField();
		this.lastChange.setColumns(10);
		this.lastChange.setBounds(355, 104, 151, 20);
		this.lastChange.setEnabled(false);
		this.pnl_auftragsverwaltung.add(this.lastChange);
		
		this.lblAusfhrfahrtDatum = new JLabel("Fahrt fahrtDatum");
		this.lblAusfhrfahrtDatum.setBounds(581, 57, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblAusfhrfahrtDatum);
		
		this.lblRoute_1 = new JLabel("Route");
		this.lblRoute_1.setBounds(581, 82, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblRoute_1);
		
		this.lblZiel = new JLabel("Start");
		this.lblZiel.setBounds(244, 134, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblZiel);
		
		this.fahrtDatum = new JTextField();
		this.fahrtDatum.setColumns(10);
		this.fahrtDatum.setBounds(692, 54, 151, 20);
		this.pnl_auftragsverwaltung.add(this.fahrtDatum);
		
		this.route = new JTextField();
		this.route.setColumns(10);
		this.route.setBounds(692, 79, 151, 20);
		this.route.setEnabled(false);
		this.pnl_auftragsverwaltung.add(this.route);
		
		this.startPlz = new JTextField();
		this.startPlz.setColumns(10);
		this.startPlz.setBounds(355, 159, 46, 20);
		this.pnl_auftragsverwaltung.add(this.startPlz);
		
		this.lblZiel_1 = new JLabel("Ziel");
		this.lblZiel_1.setBounds(581, 134, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblZiel_1);
		
		this.zielPlz = new JTextField();
		this.zielPlz.setColumns(10);
		this.zielPlz.setBounds(692, 159, 46, 20);
		this.pnl_auftragsverwaltung.add(this.zielPlz);
		
		this.separator_1 = new JSeparator();
		this.separator_1.setBounds(245, 276, 889, 2);
		this.pnl_auftragsverwaltung.add(this.separator_1);
		
		this.btnSpeichern_1 = new JButton("Speichern");
		this.btnSpeichern_1.setBounds(245, 289, 89, 23);
		this.pnl_auftragsverwaltung.add(this.btnSpeichern_1);
		
		this.btnAbbrechen_1 = new JButton("Abbrechen");
		this.btnAbbrechen_1.setBounds(344, 289, 89, 23);
		this.pnl_auftragsverwaltung.add(this.btnAbbrechen_1);
		
		this.lblDistanz_1 = new JLabel("Distanz");
		this.lblDistanz_1.setBounds(581, 107, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblDistanz_1);
		
		this.distance = new JTextField();
		this.distance.setColumns(10);
		this.distance.setBounds(692, 104, 151, 20);
		this.distance.setEnabled(false);
		this.pnl_auftragsverwaltung.add(this.distance);
		
		this.lblNetto = new JLabel("Netto");
		this.lblNetto.setBounds(886, 57, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblNetto);
		
		this.netto = new JTextField();
		this.netto.setColumns(10);
		this.netto.setBounds(998, 54, 136, 20);
		this.netto.setEnabled(false);
		this.pnl_auftragsverwaltung.add(this.netto);
		
		this.lblBrutto = new JLabel("Brutto");
		this.lblBrutto.setBounds(886, 82, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblBrutto);
		
		this.brutto = new JTextField();
		this.brutto.setColumns(10);
		this.brutto.setBounds(998, 79, 136, 20);
		this.brutto.setEnabled(false);
		this.pnl_auftragsverwaltung.add(this.brutto);
		
		this.lblPauschale = new JLabel("Pauschale");
		this.lblPauschale.setBounds(886, 107, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblPauschale);
		
		this.pauschale = new JTextField();
		this.pauschale.setColumns(10);
		this.pauschale.setBounds(998, 107, 136, 20);
		this.pauschale.setEnabled(false);
		this.pnl_auftragsverwaltung.add(this.pauschale);
		
		this.lblRechnungsinformation = new JLabel("Rechnungsinformation");
		this.lblRechnungsinformation.setBounds(886, 11, 114, 14);
		this.pnl_auftragsverwaltung.add(this.lblRechnungsinformation);
		
		this.lblGesamt = new JLabel("Gesamt");
		this.lblGesamt.setBounds(886, 147, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblGesamt);
		
		this.gesamt = new JTextField();
		this.gesamt.setColumns(10);
		this.gesamt.setBounds(998, 144, 136, 20);
		this.gesamt.setEnabled(false);
		this.pnl_auftragsverwaltung.add(this.gesamt);
		
		this.separator_4 = new JSeparator();
		this.separator_4.setBounds(886, 134, 248, 2);
		this.pnl_auftragsverwaltung.add(this.separator_4);
		
		this.btnRechnungErstellen = new JButton("Rechnung erstellen");
		this.btnRechnungErstellen.setBounds(1009, 289, 125, 23);
		this.pnl_auftragsverwaltung.add(this.btnRechnungErstellen);
		
		startUseKundenadresse = new JCheckBox("Kunden Adresse für Start");
		startUseKundenadresse.setBounds(355, 130, 163, 23);
		pnl_auftragsverwaltung.add(startUseKundenadresse);
		
		zielUseKundeAdresse = new JCheckBox("Kunden Adresse für Ziel");
		zielUseKundeAdresse.setBounds(692, 130, 151, 23);
		pnl_auftragsverwaltung.add(zielUseKundeAdresse);
		
		startOrt = new JTextField();
		startOrt.setBounds(411, 159, 95, 20);
		pnl_auftragsverwaltung.add(startOrt);
		startOrt.setColumns(10);
		
		startStreet = new JTextField();
		startStreet.setBounds(355, 190, 95, 20);
		pnl_auftragsverwaltung.add(startStreet);
		startStreet.setColumns(10);
		
		startHausNr = new JTextField();
		startHausNr.setBounds(458, 190, 48, 20);
		pnl_auftragsverwaltung.add(startHausNr);
		startHausNr.setColumns(10);
		
		zielOrt = new JTextField();
		zielOrt.setBounds(748, 159, 95, 20);
		pnl_auftragsverwaltung.add(zielOrt);
		zielOrt.setColumns(10);
		
		zielStreet = new JTextField();
		zielStreet.setBounds(692, 190, 95, 20);
		pnl_auftragsverwaltung.add(zielStreet);
		zielStreet.setColumns(10);
		
		zielHausNr = new JTextField();
		zielHausNr.setBounds(797, 190, 46, 20);
		pnl_auftragsverwaltung.add(zielHausNr);
		zielHausNr.setColumns(10);
		
		JLabel lblStartStreet = new JLabel("Straße, Nr.");
		lblStartStreet.setBounds(244, 193, 90, 14);
		pnl_auftragsverwaltung.add(lblStartStreet);
		
		JLabel lblStartPlz = new JLabel("PLZ, Ort");
		lblStartPlz.setBounds(244, 162, 69, 14);
		pnl_auftragsverwaltung.add(lblStartPlz);
		
		JLabel label = new JLabel("");
		label.setBounds(244, 224, 46, 14);
		pnl_auftragsverwaltung.add(label);
		
		JLabel lblZielPlz = new JLabel("PLZ, Ort");
		lblZielPlz.setBounds(581, 162, 81, 14);
		pnl_auftragsverwaltung.add(lblZielPlz);
		
		JLabel lblZielStreet = new JLabel("Stra\u00DFe, Nr.");
		lblZielStreet.setBounds(581, 193, 81, 14);
		pnl_auftragsverwaltung.add(lblZielStreet);
		
	}
	
	//Load Customer in Combobox
	public void loadCombobox(String[] inhalt) {
		this.kunde.removeAllItems();
		for(int i = 0; i<inhalt.length;i++) {
			this.kunde.addItem(inhalt[i]);
		}
	}
	
	//Getter
	public JPanel getSubPanel()
	{
		return pnl_auftragsverwaltung;
	}
	
	public int getCurrentSelectedAuftragId() {
		if(this.auftrag.getText()==""||this.auftrag.getText()==null)return -1;
		try {
		int id = Integer.parseInt(this.auftrag.getText());
		return id;
		}catch(NumberFormatException e) {
			System.out.println("Es muss erst ein Datensatz ausgewählt werden");
		}
		return -1;
	}
	
	public Map<String,String> getData() {
		
		Map<String,String> data = new HashMap<String,String>();
		data.put("id", String.valueOf(this.getCurrentSelectedAuftragId()));
		data.put("kunde", this.kunde.getSelectedItem().toString());
		data.put("fahrtDatum", this.fahrtDatum.getText());
		
		data.put("startPlz", this.startPlz.getText());
		data.put("startOrt", this.startOrt.getText());
		data.put("startStreet", this.startStreet.getText());
		data.put("startHausNr", this.startHausNr.getText());
		
		data.put("zielPlz", this.zielPlz.getText());
		data.put("zielOrt", this.zielOrt.getText());
		data.put("zielStreet", this.zielStreet.getText());
		data.put("zielHausNr", this.zielHausNr.getText());
		
		return data;
	}
	
	//Updaten der GUI
	public void updateList(String[] names) {
		this.auftragListenModel.clear();
		for(int i = 0;i<names.length;i++) {
			this.auftragListenModel.addElement(names[i]);
		}
	}
		
	public void updateGUIFromCustomer(Map<String,String> map) {
		
		this.auftrag.setText(map.get("auftragsnummer"));
		this.route.setText(map.get("route"));
		this.lastChange.setText(map.get("lastChange"));
		this.distance.setText(map.get("distance"));
		this.fahrtDatum.setText(map.get("fahrtDatum"));
		
		if(map.get("kunde").isEmpty()) {
			this.kunde.setSelectedIndex(this.kunde.getItemCount()-1);
			
		}
		else this.kunde.setSelectedItem(map.get("kunde"));
		
		this.startPlz.setText(map.get("startPlz"));
		this.startOrt.setText(map.get("startOrt"));
		this.startStreet.setText(map.get("startStraße"));
		this.startHausNr.setText(map.get("startHausNr"));
		
		this.zielPlz.setText(map.get("zielPlz"));
		this.zielOrt.setText(map.get("zielOrt"));
		this.zielStreet.setText(map.get("zielStraße"));
		this.zielHausNr.setText(map.get("zielHausNr"));
		
		//TODO Ausrechnen
		this.pauschale.setText("1€ pro km netto");
		float price = Float.parseFloat(map.get("distance"))*1;
		float bruttoPrice = price*0.19f;
		this.netto.setText(String.valueOf(price));
		this.brutto.setText(String.valueOf(bruttoPrice));
		this.gesamt.setText(String.valueOf(price+bruttoPrice));
	}
	
	public void setListSelectionOn(int id) {
		this.auftragListe.setSelectedIndex(id);
	}
	
	public void updateStartAdresse(Map<String,String> data) {
		if(data==null)return;
		this.startPlz.setText(data.get("plz"));
		this.startOrt.setText(data.get("ort"));
		this.startStreet.setText(data.get("street"));
		this.startHausNr.setText(data.get("hausNr"));
	}
	
	public void updateZielAdresse(Map<String,String>  data) {
		if(data==null)return;
		this.zielPlz.setText(data.get("plz"));
		this.zielOrt.setText(data.get("ort"));
		this.zielStreet.setText(data.get("street"));
		this.zielHausNr.setText(data.get("hausNr"));
	}
	
	//Bind Handler
	public void addListHandler(MouseListener mouse)
	{
		this.auftragListe.addMouseListener(mouse);
	}
	public void addSavingListener(ActionListener al)
	{
		btnSpeichern_1.addActionListener(al);
	}
	public void addDeletingListener(ActionListener al)
	{
		btnLschen_2.addActionListener(al);
	}
	public void addAddingListener(ActionListener al)
	{
		btnNeuerAuftrag.addActionListener(al);
	}
	public void addResetListener(ActionListener al)
	{
		btnAbbrechen_1.addActionListener(al);
	}
	
	public void createBill(ActionListener al) {
		btnRechnungErstellen.addActionListener(al);
	}
	
	public void checkboxListener(ActionListener al) {
		startUseKundenadresse.addActionListener(al);
		zielUseKundeAdresse.addActionListener(al);
	}
}
