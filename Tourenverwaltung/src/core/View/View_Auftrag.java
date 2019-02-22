package core.View;

import java.awt.Component;
import java.awt.event.MouseListener;
import java.util.Map;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class View_Auftrag {
	
	private JPanel pnl_auftragsverwaltung;
	
	private JLabel lblAuftrge;
	private JLabel lblAuftragsnummer_1;
	private JLabel lblAusfhrdatum;
	private JLabel lblFahrer_2;
	private JLabel lblRoute;
	private JLabel lblRoute_1;
	private JLabel lblZiel;
	private JLabel lblZiel_1;
	private JLabel lblFahrer_3;
	private JLabel lblDistanz_1;
	private JLabel lblBetrag;
	private JLabel lblSteuercode;
	private JLabel lblNetto;
	private JLabel lblBrutto;
	private JLabel lblPauschale;
	private JLabel lblRechnungsinformation;
	private JLabel lblGesamt;
	
	private JTextField datum;
	private JTextField route;
	private JTextField start;
	private JTextField auftrag;
	private JTextField ziel;
	private JTextField kunde;
	private JTextField buchungsdatum;
	private JTextField fahrer;
	private JTextField distance;
	private JTextField betrag;
	private JTextField steuerCode;
	private JTextField netto;
	private JTextField brutto;
	private JTextField pauschale;
	private JTextField gesamt;
	
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
		
		this.lblRoute = new JLabel("Buchungsdatum");
		this.lblRoute.setBounds(244, 107, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblRoute);
		
		this.auftrag = new JTextField();
		this.auftrag.setBounds(355, 54, 163, 20);
		this.pnl_auftragsverwaltung.add(this.auftrag);
		this.auftrag.setColumns(10);
		
		this.kunde = new JTextField();
		this.kunde.setColumns(10);
		this.kunde.setBounds(355, 79, 163, 20);
		this.pnl_auftragsverwaltung.add(this.kunde);
		
		this.buchungsdatum = new JTextField();
		this.buchungsdatum.setColumns(10);
		this.buchungsdatum.setBounds(355, 104, 163, 20);
		this.pnl_auftragsverwaltung.add(this.buchungsdatum);
		
		this.lblFahrer_3 = new JLabel("Fahrer");
		this.lblFahrer_3.setBounds(581, 59, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblFahrer_3);
		
		this.lblAusfhrdatum = new JLabel("datum");
		this.lblAusfhrdatum.setBounds(581, 84, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblAusfhrdatum);
		
		this.lblRoute_1 = new JLabel("Route");
		this.lblRoute_1.setBounds(581, 109, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblRoute_1);
		
		this.lblZiel = new JLabel("Start");
		this.lblZiel.setBounds(581, 134, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblZiel);
		
		this.fahrer = new JTextField();
		this.fahrer.setColumns(10);
		this.fahrer.setBounds(692, 56, 136, 20);
		this.pnl_auftragsverwaltung.add(this.fahrer);
		
		this.datum = new JTextField();
		this.datum.setColumns(10);
		this.datum.setBounds(692, 81, 136, 20);
		this.pnl_auftragsverwaltung.add(this.datum);
		
		this.route = new JTextField();
		this.route.setColumns(10);
		this.route.setBounds(692, 106, 136, 20);
		this.pnl_auftragsverwaltung.add(this.route);
		
		this.start = new JTextField();
		this.start.setColumns(10);
		this.start.setBounds(692, 131, 136, 20);
		this.pnl_auftragsverwaltung.add(this.start);
		
		this.lblZiel_1 = new JLabel("Ziel");
		this.lblZiel_1.setBounds(581, 162, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblZiel_1);
		
		this.ziel = new JTextField();
		this.ziel.setColumns(10);
		this.ziel.setBounds(692, 159, 136, 20);
		this.pnl_auftragsverwaltung.add(this.ziel);
		
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
		this.lblDistanz_1.setBounds(244, 177, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblDistanz_1);
		
		this.distance = new JTextField();
		this.distance.setColumns(10);
		this.distance.setBounds(355, 174, 136, 20);
		this.pnl_auftragsverwaltung.add(this.distance);
		
		this.lblBetrag = new JLabel("Betrag");
		this.lblBetrag.setBounds(244, 205, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblBetrag);
		
		this.betrag = new JTextField();
		this.betrag.setColumns(10);
		this.betrag.setBounds(355, 202, 136, 20);
		this.pnl_auftragsverwaltung.add(this.betrag);
		
		this.lblSteuercode = new JLabel("Steuercode");
		this.lblSteuercode.setBounds(886, 59, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblSteuercode);
		
		this.steuerCode = new JTextField();
		this.steuerCode.setColumns(10);
		this.steuerCode.setBounds(997, 56, 136, 20);
		this.pnl_auftragsverwaltung.add(this.steuerCode);
		
		this.lblNetto = new JLabel("Netto");
		this.lblNetto.setBounds(886, 87, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblNetto);
		
		this.netto = new JTextField();
		this.netto.setColumns(10);
		this.netto.setBounds(997, 84, 136, 20);
		this.pnl_auftragsverwaltung.add(this.netto);
		
		this.lblBrutto = new JLabel("Brutto");
		this.lblBrutto.setBounds(886, 117, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblBrutto);
		
		this.brutto = new JTextField();
		this.brutto.setColumns(10);
		this.brutto.setBounds(997, 114, 136, 20);
		this.pnl_auftragsverwaltung.add(this.brutto);
		
		this.lblPauschale = new JLabel("Pauschale");
		this.lblPauschale.setBounds(886, 145, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblPauschale);
		
		this.pauschale = new JTextField();
		this.pauschale.setColumns(10);
		this.pauschale.setBounds(997, 142, 136, 20);
		this.pnl_auftragsverwaltung.add(this.pauschale);
		
		this.lblRechnungsinformation = new JLabel("Rechnungsinformation");
		this.lblRechnungsinformation.setBounds(886, 11, 114, 14);
		this.pnl_auftragsverwaltung.add(this.lblRechnungsinformation);
		
		this.lblGesamt = new JLabel("Gesamt");
		this.lblGesamt.setBounds(886, 202, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblGesamt);
		
		this.gesamt = new JTextField();
		this.gesamt.setColumns(10);
		this.gesamt.setBounds(997, 199, 136, 20);
		this.pnl_auftragsverwaltung.add(this.gesamt);
		
		this.separator_4 = new JSeparator();
		this.separator_4.setBounds(886, 174, 248, 2);
		this.pnl_auftragsverwaltung.add(this.separator_4);
		
		this.btnRechnungErstellen = new JButton("Rechnung erstellen");
		this.btnRechnungErstellen.setBounds(1009, 289, 125, 23);
		this.pnl_auftragsverwaltung.add(this.btnRechnungErstellen);
		
	}
	public JPanel getSubPanel()
	{
		return pnl_auftragsverwaltung;
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
			this.kunde.setText(map.get("kunde"));
			this.start.setText(map.get("start"));
			this.ziel.setText(map.get("ziel"));
		}
		
		//Bind Handler
		public void addListHandler(MouseListener mouse)
		{
			this.auftragListe.addMouseListener(mouse);
		}
}
