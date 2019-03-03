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
import javax.swing.JDialog;

import java.awt.Color;
import java.awt.event.ActionEvent;

public class View_Auftrag {
	
	
	private JPanel pnl_auftragsverwaltung;
	private JDialog pnl_popup;
	
	private JLabel lblAuftrge;
	private JLabel lblAuftragsnummer;
	private JLabel lblAusfhrfahrtDatum;
	private JLabel lblFahrer;
	private JLabel lblLastChange;
	private JLabel lblRoute;
	private JLabel lblStart;
	private JLabel lblZiel;
	private JLabel lblDistanz;
	private JLabel lblNetto;
	private JLabel lblBrutto;
	private JLabel lblPauschale;
	private JLabel lblRechnungsinformation;
	private JLabel lblGesamt;
	private JLabel lblpopupDescription;
	
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
	
	private JCheckBox startUseKundenAdresse;
	private JCheckBox zielUseKundenAdresse;
	
	private JButton btnDelete;
	private JButton btnNeuerAuftrag;
	private JButton btnSpeichern;
	private JButton btnAbbrechen;
	private JButton btnRechnungErstellen;
	private JButton popUpButton;
	
	private JSeparator separator;
	private JSeparator separator2;
	
	private DefaultListModel<String> auftragListenModel;
	private JList<String> auftragListe;
	private JLabel lblStartStreet;
	private JLabel lblStartPlz;
	private JLabel label;
	private JLabel lblZielPlz;
	private JLabel lblZielStreet;
	
	public View_Auftrag(){
		createComp();
	}
	/**
	 * Initialisierung der GUI-Komponenten
	 */
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
		
		this.btnDelete = new JButton("L\u00F6schen");
		this.btnDelete.setBounds(115, 457, 101, 23);
		this.pnl_auftragsverwaltung.add(this.btnDelete);
		
		this.lblAuftragsnummer = new JLabel("Auftragsnummer");
		this.lblAuftragsnummer.setBounds(244, 57, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblAuftragsnummer);
		
		this.lblFahrer = new JLabel("Kunde");
		this.lblFahrer.setBounds(244, 82, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblFahrer);
		
		this.lblLastChange = new JLabel("Letzte Änderung");
		this.lblLastChange.setBounds(244, 107, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblLastChange);
		
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
		
		this.lblRoute = new JLabel("Route");
		this.lblRoute.setBounds(581, 82, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblRoute);
		
		this.lblStart = new JLabel("Start");
		this.lblStart.setBounds(244, 134, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblStart);
		
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
		
		this.lblZiel = new JLabel("Ziel");
		this.lblZiel.setBounds(581, 134, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblZiel);
		
		this.zielPlz = new JTextField();
		this.zielPlz.setColumns(10);
		this.zielPlz.setBounds(692, 159, 46, 20);
		this.pnl_auftragsverwaltung.add(this.zielPlz);
		
		this.separator = new JSeparator();
		this.separator.setBounds(245, 276, 889, 2);
		this.pnl_auftragsverwaltung.add(this.separator);
		
		this.btnSpeichern = new JButton("Speichern");
		this.btnSpeichern.setBounds(245, 289, 89, 23);
		this.pnl_auftragsverwaltung.add(this.btnSpeichern);
		
		this.btnAbbrechen = new JButton("Abbrechen");
		this.btnAbbrechen.setBounds(344, 289, 89, 23);
		this.pnl_auftragsverwaltung.add(this.btnAbbrechen);
		
		this.lblDistanz = new JLabel("Distanz");
		this.lblDistanz.setBounds(581, 107, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblDistanz);
		
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
		
		this.separator2 = new JSeparator();
		this.separator2.setBounds(886, 134, 248, 2);
		this.pnl_auftragsverwaltung.add(this.separator2);
		
		this.btnRechnungErstellen = new JButton("Rechnung erstellen");
		this.btnRechnungErstellen.setBounds(1009, 289, 125, 23);
		this.pnl_auftragsverwaltung.add(this.btnRechnungErstellen);
		
		startUseKundenAdresse = new JCheckBox("Kunden Adresse für Start");
		startUseKundenAdresse.setBounds(355, 130, 163, 23);
		pnl_auftragsverwaltung.add(startUseKundenAdresse);
		
		zielUseKundenAdresse = new JCheckBox("Kunden Adresse für Ziel");
		zielUseKundenAdresse.setBounds(692, 130, 151, 23);
		pnl_auftragsverwaltung.add(zielUseKundenAdresse);
		
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
		
		lblStartStreet = new JLabel("Straße, Nr.");
		lblStartStreet.setBounds(244, 193, 90, 14);
		pnl_auftragsverwaltung.add(lblStartStreet);
		
		lblStartPlz = new JLabel("PLZ, Ort");
		lblStartPlz.setBounds(244, 162, 69, 14);
		pnl_auftragsverwaltung.add(lblStartPlz);
		
		label = new JLabel("");
		label.setBounds(244, 224, 46, 14);
		pnl_auftragsverwaltung.add(label);
		
		lblZielPlz = new JLabel("PLZ, Ort");
		lblZielPlz.setBounds(581, 162, 81, 14);
		pnl_auftragsverwaltung.add(lblZielPlz);
		
		lblZielStreet = new JLabel("Stra\u00DFe, Nr.");
		lblZielStreet.setBounds(581, 193, 81, 14);
		pnl_auftragsverwaltung.add(lblZielStreet);
		
		this.pnl_popup = new JDialog();
		this.pnl_popup.setTitle("Fehlermeldung");
		this.pnl_popup.setLayout(null);
		this.pnl_popup.setBounds(468, 130, 349, 153);
		this.pnl_popup.setLocationRelativeTo(this.pnl_auftragsverwaltung);
		this.pnl_popup.setLocation((int)this.pnl_popup.getLocation().getX()-this.pnl_popup.getWidth()/2, (int)this.pnl_popup.getLocation().getY()-this.pnl_popup.getHeight()/2);
		this.pnl_popup.setBackground(Color.WHITE);
		
		this.lblpopupDescription = new JLabel("popUpDescrition");
		this.lblpopupDescription.setBounds(47, 29, 246, 46);
		this.pnl_popup.add(this.lblpopupDescription);
		
		popUpButton = new JButton("Verstanden");
		this.popUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		this.popUpButton.setBounds(102, 80, 128, 23);
		this.pnl_popup.add(this.popUpButton);
		this.pnl_popup.setAlwaysOnTop(true);
		this.pnl_popup.setModal(true);
		
		
		
	}
	
	/**
	 * Aktualisierung der Combobox mit Kunden
	 * @param inhalt
	 */
	public void loadCombobox(String[] inhalt) {
		this.kunde.removeAllItems();
		for(int i = 0; i<inhalt.length;i++) {
			this.kunde.addItem(inhalt[i]);
		}
	}
	
	/**
	 * Übergabe des Panels
	 * @return
	 */
	public JPanel getSubPanel()
	{
		return pnl_auftragsverwaltung;
	}
	/**
	 * Gibt den ausgewählten Auftrag zurück.
	 * @return
	 */
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
	/**
	 * Gibt eine Map der Daten aus der GUI zurück.
	 * @return
	 */
	public Map<String,String> getData() {
		
		Map<String,String> data = new HashMap<String,String>();
		data.put("id", String.valueOf(this.getCurrentSelectedAuftragId()));
		if(this.kunde.getSelectedItem()==null) {
			data.put("kunde",null);
		}else {
		data.put("kunde", this.kunde.getSelectedItem().toString());
		}
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
	
	
	/**
	 * Zeigt PopUp für Fehlerdialog
	 * @param desc
	 */
	public void openPopup(String desc) {
		this.lblpopupDescription.setText(desc);
		this.pnl_popup.setVisible(true);
		System.out.println("Show Popup with Message"+desc);
	}
	/**
	 * Schließt Fehlerdialog
	 */
	public void closePopUp() {
		this.pnl_popup.setVisible(false);
	}
	/**
	 * Aktualisiert die iste mit Aufträgen.
	 * @param names
	 */
	public void updateList(String[] names) {
		this.auftragListenModel.clear();
		for(int i = 0;i<names.length;i++) {
			this.auftragListenModel.addElement(names[i]);
		}
	}
	/**
	 * Aktualisiert die angezeigten Daten des Auftrages.	
	 * @param map
	 */
	public void updateGUIFromCustomer(Map<String,String> map) {
		
		this.startUseKundenAdresse.setSelected(false);
		this.zielUseKundenAdresse.setSelected(false);
		
		this.auftrag.setText(map.get("auftragsnummer"));
		this.route.setText(map.get("route"));
		this.lastChange.setText(map.get("lastChange"));
		this.distance.setText(map.get("distance"));
		this.fahrtDatum.setText(map.get("fahrtDatum"));
		if(map.get("kunde")==null) {
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
		
		this.pauschale.setText("1€ pro km netto");
		float price = Float.parseFloat(map.get("distance"))/1000*0.6f;
		float bruttoPrice = price*0.19f;
		this.netto.setText(String.valueOf(price));
		this.brutto.setText(String.valueOf(bruttoPrice));
		this.gesamt.setText(String.valueOf(price+bruttoPrice));
	}
	/**
	 * Setzt welches Listen Element ausgewählt ist.
	 * @param id
	 */
	public void setListSelectionOn(int id) {
		this.auftragListe.setSelectedIndex(id);
	}
	/**
	 * Aktualisiert die Startadresse.
	 * @param data
	 */
	public void updateStartAdresse(Map<String,String> data) {
		if(data==null)return;
		this.startPlz.setText(data.get("plz"));
		this.startOrt.setText(data.get("ort"));
		this.startStreet.setText(data.get("street"));
		this.startHausNr.setText(data.get("hausNr"));
	}
	/**
	 * Aktualisiert die Zieladresse
	 * @param data
	 */
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
		btnSpeichern.addActionListener(al);
	}
	public void addDeletingListener(ActionListener al)
	{
		btnDelete.addActionListener(al);
	}
	public void addAddingListener(ActionListener al)
	{
		btnNeuerAuftrag.addActionListener(al);
	}
	public void addResetListener(ActionListener al)
	{
		btnAbbrechen.addActionListener(al);
	}
	
	public void createBill(ActionListener al) {
		btnRechnungErstellen.addActionListener(al);
	}
	
	public void checkboxListener(ActionListener al) {
		startUseKundenAdresse.addActionListener(al);
		zielUseKundenAdresse.addActionListener(al);
	}
	
	public void hidePopUp(ActionListener al) {
		this.popUpButton.addActionListener(al);
	}
	
}
