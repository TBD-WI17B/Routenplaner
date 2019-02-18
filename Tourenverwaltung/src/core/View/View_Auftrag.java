package core.View;

import java.awt.Component;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class View_Auftrag {
	
	private JPanel pnl_auftragsverwaltung;
	private JLabel lblAuftrge;
	private JButton btnLschen_2;
	private JButton btnNeuerAuftrag;
	private JLabel label_2;
	private JLabel lblAuftragsnummer_1;
	private JLabel lblAusfhrdatum;
	private JLabel lblFahrer_2;
	private JLabel lblRoute;
	private JLabel lblRoute_1;
	private JLabel lblZiel;
	private JLabel lblZiel_1;
	private JLabel lblFahrer_3;
	private JList list_1;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_2;
	private JTextField textField_8;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_26;
	private JTextField textField_27;
	private JSeparator separator_1;
	private JButton btnSpeichern_1;
	private JButton btnAbbrechen_1;
	private JLabel lblDistanz_1;
	private JLabel lblBetrag;
	private JLabel lblSteuercode;
	private JTextField textField_28;
	private JLabel lblNetto;
	private JTextField textField_29;
	private JLabel lblBrutto;
	private JTextField textField_30;
	private JLabel lblPauschale;
	private JTextField textField_31;
	private JLabel lblRechnungsinformation;
	private JLabel lblGesamt;
	private JTextField textField_32;
	private JSeparator separator_4;
	private JButton btnRechnungErstellen;
	
	public View_Auftrag(){
		createComp();
	}
	private void createComp() {
		pnl_auftragsverwaltung = new JPanel();
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
		
		this.textField_26 = new JTextField();
		this.textField_26.setColumns(10);
		this.textField_26.setBounds(355, 174, 136, 20);
		this.pnl_auftragsverwaltung.add(this.textField_26);
		
		this.lblBetrag = new JLabel("Betrag");
		this.lblBetrag.setBounds(244, 205, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblBetrag);
		
		this.textField_27 = new JTextField();
		this.textField_27.setColumns(10);
		this.textField_27.setBounds(355, 202, 136, 20);
		this.pnl_auftragsverwaltung.add(this.textField_27);
		
		this.lblSteuercode = new JLabel("Steuercode");
		this.lblSteuercode.setBounds(886, 59, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblSteuercode);
		
		this.textField_28 = new JTextField();
		this.textField_28.setColumns(10);
		this.textField_28.setBounds(997, 56, 136, 20);
		this.pnl_auftragsverwaltung.add(this.textField_28);
		
		this.lblNetto = new JLabel("Netto");
		this.lblNetto.setBounds(886, 87, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblNetto);
		
		this.textField_29 = new JTextField();
		this.textField_29.setColumns(10);
		this.textField_29.setBounds(997, 84, 136, 20);
		this.pnl_auftragsverwaltung.add(this.textField_29);
		
		this.lblBrutto = new JLabel("Brutto");
		this.lblBrutto.setBounds(886, 117, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblBrutto);
		
		this.textField_30 = new JTextField();
		this.textField_30.setColumns(10);
		this.textField_30.setBounds(997, 114, 136, 20);
		this.pnl_auftragsverwaltung.add(this.textField_30);
		
		this.lblPauschale = new JLabel("Pauschale");
		this.lblPauschale.setBounds(886, 145, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblPauschale);
		
		this.textField_31 = new JTextField();
		this.textField_31.setColumns(10);
		this.textField_31.setBounds(997, 142, 136, 20);
		this.pnl_auftragsverwaltung.add(this.textField_31);
		
		this.lblRechnungsinformation = new JLabel("Rechnungsinformation");
		this.lblRechnungsinformation.setBounds(886, 11, 114, 14);
		this.pnl_auftragsverwaltung.add(this.lblRechnungsinformation);
		
		this.lblGesamt = new JLabel("Gesamt");
		this.lblGesamt.setBounds(886, 202, 101, 14);
		this.pnl_auftragsverwaltung.add(this.lblGesamt);
		
		this.textField_32 = new JTextField();
		this.textField_32.setColumns(10);
		this.textField_32.setBounds(997, 199, 136, 20);
		this.pnl_auftragsverwaltung.add(this.textField_32);
		
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
}
