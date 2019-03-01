package core.View;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PreDestroy;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;

public class View_Route{

	private JPanel pnl_routenplaner;
	private JLabel lbl_map;
	private JList lsRouten;
	private JLabel lbl_routen;
	private JLabel lbl_haltepunkte;
	private JList lsAuftraege;
	private JTextField txtInfoAuftragsnummer;
	private JTextField txtInfoFahrer;
	private JTextField txtInfoKm;
	private JTextField txtInfoDauer;
	private JList lsFahrer;
	private JLabel lbl_fahrer;
	private JButton btnNeueRoute;
	private JButton btnRouteLoeschen;
	private JButton btnBearbeiten;
	private JButton btnAuftragHinzufuegen;
	private JButton btnAuftragEntfernen;
	private JButton btnFahrerZuweisen;
	private JLabel lblAuftragsnummer;
	private JLabel lblInfoFahrer;
	private JLabel lblInfoDauer;
	private JLabel lblInfoDistanz;
	private JLabel lblInfos;
	private JLabel lblInfos_1;
	private JButton btnRoutenGenerieren;
	private JLabel lblInfoRoutenID;
	private JLabel lbl_auftraege;
	private DefaultListModel lsFahrerModel;
	private DefaultListModel lsAuftraegeModel;
	private DefaultListModel lsRoutenModel;
	private JLabel lblFahrzeug;
	private JComboBox comboBoxFahrzeug;
	
	public View_Route()
	{
		createComp();
	}
	
	private void createComp()
	{
		pnl_routenplaner = new JPanel();
		this.pnl_routenplaner.setLayout(null);
		
		this.lbl_map = new JLabel("");
		this.lbl_map.setVerticalAlignment(SwingConstants.TOP);
		this.lbl_map.setHorizontalAlignment(SwingConstants.RIGHT);
		this.lbl_map.setIcon(new ImageIcon(View.class.getResource("/images/500px-Karte_Deutschland.svg.png")));
		this.lbl_map.setBounds(795, 11, 508, 684);
		this.pnl_routenplaner.add(this.lbl_map);
		
		lsRoutenModel = new DefaultListModel();
		this.lsRouten = new JList<String>(lsRoutenModel);
		this.lsRouten.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.lsRouten.setValueIsAdjusting(true);
		this.lsRouten.setBounds(10, 36, 227, 217);
		this.pnl_routenplaner.add(this.lsRouten);
		
		this.lbl_routen = new JLabel("Routen");
		this.lbl_routen.setLabelFor(this.lsRouten);
		this.lbl_routen.setBounds(10, 11, 88, 14);
		this.pnl_routenplaner.add(this.lbl_routen);
		
		this.lbl_auftraege = new JLabel("Aufträge");
		this.lbl_auftraege.setBounds(269, 11, 98, 14);
		this.pnl_routenplaner.add(this.lbl_auftraege);
		
		lsAuftraegeModel = new DefaultListModel();
		this.lsAuftraege = new JList<String>(lsAuftraegeModel);
		this.lsAuftraege.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.lbl_auftraege.setLabelFor(this.lsAuftraege);
		this.lsAuftraege.setBounds(269, 36, 227, 217);
		this.pnl_routenplaner.add(this.lsAuftraege);
		
		this.txtInfoAuftragsnummer = new JTextField();
		txtInfoAuftragsnummer.setEditable(false);
		txtInfoAuftragsnummer.setEnabled(false);
		this.txtInfoAuftragsnummer.setText("Auftragsnummer");
		this.txtInfoAuftragsnummer.setBounds(109, 373, 112, 20);
		this.pnl_routenplaner.add(this.txtInfoAuftragsnummer);
		this.txtInfoAuftragsnummer.setColumns(10);
		
		this.txtInfoFahrer = new JTextField();
		txtInfoFahrer.setEnabled(false);
		txtInfoFahrer.setEditable(false);
		this.txtInfoFahrer.setText("Fahrer");
		this.txtInfoFahrer.setBounds(109, 404, 112, 20);
		this.pnl_routenplaner.add(this.txtInfoFahrer);
		this.txtInfoFahrer.setColumns(10);
		
		this.txtInfoKm = new JTextField();
		txtInfoKm.setEditable(false);
		txtInfoKm.setEnabled(false);
		this.txtInfoKm.setText("km");
		this.txtInfoKm.setBounds(109, 466, 112, 20);
		this.pnl_routenplaner.add(this.txtInfoKm);
		this.txtInfoKm.setColumns(10);
		
		this.txtInfoDauer = new JTextField();
		txtInfoDauer.setEditable(false);
		txtInfoDauer.setEnabled(false);
		this.txtInfoDauer.setText("dauer");
		this.txtInfoDauer.setBounds(109, 435, 112, 20);
		this.pnl_routenplaner.add(this.txtInfoDauer);
		this.txtInfoDauer.setColumns(10);
		
		lsFahrerModel = new DefaultListModel();
		this.lsFahrer = new JList<String>(lsFahrerModel);
		this.lsFahrer.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.lsFahrer.setBounds(526, 36, 227, 217);
		this.pnl_routenplaner.add(this.lsFahrer);
		
		this.lbl_fahrer = new JLabel("Fahrer");
		this.lbl_fahrer.setLabelFor(this.lsFahrer);
		this.lbl_fahrer.setBounds(526, 11, 88, 14);
		this.pnl_routenplaner.add(this.lbl_fahrer);
		
		this.btnNeueRoute = new JButton("Neue Route");
		this.btnNeueRoute.setBounds(10, 264, 94, 23);
		this.pnl_routenplaner.add(this.btnNeueRoute);
		
		this.btnRouteLoeschen = new JButton("L\u00F6schen");
		this.btnRouteLoeschen.setBounds(114, 264, 123, 23);
		this.pnl_routenplaner.add(this.btnRouteLoeschen);
		
//		this.btnBearbeiten = new JButton("Bearbeiten");
//		this.btnBearbeiten.setBounds(10, 298, 94, 23);
//		this.pnl_routenplaner.add(this.btnBearbeiten);
		
		this.btnAuftragHinzufuegen = new JButton("Hinzuf\u00FCgen");
		this.btnAuftragHinzufuegen.setBounds(269, 264, 89, 23);
		this.pnl_routenplaner.add(this.btnAuftragHinzufuegen);
		
		this.btnAuftragEntfernen = new JButton("Entfernen");
		this.btnAuftragEntfernen.setBounds(368, 264, 89, 23);
		this.pnl_routenplaner.add(this.btnAuftragEntfernen);
		
		this.btnFahrerZuweisen = new JButton("Zuweisen");
		this.btnFahrerZuweisen.setBounds(526, 264, 89, 23);
		this.pnl_routenplaner.add(this.btnFahrerZuweisen);
		
		this.lblInfoRoutenID = new JLabel("Routen-ID");
		this.lblInfoRoutenID.setBounds(10, 373, 88, 14);
		this.pnl_routenplaner.add(this.lblInfoRoutenID);
		
		this.lblInfoFahrer = new JLabel("Fahrer");
		this.lblInfoFahrer.setBounds(10, 404, 88, 14);
		this.pnl_routenplaner.add(this.lblInfoFahrer);
		
		this.lblInfoDauer = new JLabel("Dauer");
		this.lblInfoDauer.setBounds(10, 435, 88, 14);
		this.pnl_routenplaner.add(this.lblInfoDauer);
		
		this.lblInfoDistanz = new JLabel("Distanz");
		this.lblInfoDistanz.setBounds(10, 466, 88, 14);
		this.pnl_routenplaner.add(this.lblInfoDistanz);
		
		this.btnRoutenGenerieren = new JButton("Routen generieren");
		this.btnRoutenGenerieren.setBounds(114, 298, 123, 23);
		this.pnl_routenplaner.add(this.btnRoutenGenerieren);
		
		lblFahrzeug = new JLabel("Fahrzeug");
		lblFahrzeug.setBounds(10, 501, 88, 14);
		pnl_routenplaner.add(lblFahrzeug);
		
		comboBoxFahrzeug = new JComboBox();
		comboBoxFahrzeug.setBounds(109, 498, 112, 20);
		pnl_routenplaner.add(comboBoxFahrzeug);
	}
	public JPanel getSubPanel()	{	
		return pnl_routenplaner;		
	}	
	
	//Setter
	/**
	 * Füllt die Liste mit allen vorhanden Routen. Noch keine Auswahl!
	 * @param ids String Array mit Auftrags ID
	 */
	public void updateListeRoute(String[] ids) {
		this.lsRoutenModel.clear();
		for(int i = 0;i<ids.length;i++) {
			this.lsRoutenModel.addElement(ids[i]);
		}
		this.lsRouten.setSelectedIndex(0);
	}
	/**
	 * Füllt die Liste mit Auträgen.
	 * @param ids String Array mit Auftrags ID
	 */
	public void updateListeAuftraege(String[] ids) {
		this.lsAuftraegeModel.clear();
		for(int i = 0;i<ids.length;i++) {
			this.lsAuftraegeModel.addElement(ids[i]);
		}
	}
	/**
	 * Füllt die Liste mit allen Fahrern. Wählt noch keinen Fahrer aus!
	 * @param names String Array mit den Namen der Fahrer.
	 */
	public void updateListeFahrer(String[] names) {
		this.lsFahrerModel.clear();
		for(int i = 0;i<names.length;i++) {
			this.lsFahrerModel.addElement(names[i]);
		}
	}
	/**
	 * Füllt die die ComboBox mit den Fahrzeugen. Entfernt alle vorherigen Einträgen
	 * @param fahrzeuge String Array mit den Fahrzeug IDs
	 */
	public void updateFahrzeuge(String[] fahrzeuge) {
		this.comboBoxFahrzeug.removeAllItems();
		for(int i = 0; i<fahrzeuge.length;i++) {
			this.comboBoxFahrzeug.addItem(fahrzeuge[i]);
		}
	}
	/**
	 * Setzt ein Fahrzeug als ausgewählt aus
	 * @param fahrzeug 
	 */
	public void setFahrzeug(int fahrzeug) {
		if(fahrzeug != -1)this.comboBoxFahrzeug.setSelectedItem(""+ fahrzeug);
		else this.comboBoxFahrzeug.setSelectedIndex(0);
	}
	public void setFahrer(String fahrer) {
		if(fahrer != null) this.lsFahrer.setSelectedValue(fahrer, true);
		else this.lsFahrer.clearSelection();
	}
	/**
	 * Update der angezeigten Informationen
	 * @param data Map der Daten (auftragId, fahrerId, duration, distance, fahrzeug)
	 */
	public void updateInfo(Map<String,String> data) {
		this.txtInfoAuftragsnummer.setText(data.get("routenId"));
		this.txtInfoFahrer.setText(data.get("fahrerId"));
		this.txtInfoDauer.setText(data.get("duration")+" min");
		this.txtInfoKm.setText(data.get("distance")+ " km");
		this.comboBoxFahrzeug.setSelectedItem(data.get("fahrzeug"));
	}
	
	//Getter
	public String getSelectedFahrzeug()
	{
		return this.comboBoxFahrzeug.getSelectedItem().toString();
	}
	public String getSelectedRoute()
	{
		return this.lsRouten.getSelectedValue().toString();
	}
	public String getSelectedAuftrag()
	{
		return this.lsAuftraege.getSelectedValue().toString();
	}
	public String getSelectedFahrer()
	{
		return this.lsFahrer.getSelectedValue().toString();
	}
	
	//Handler
	public void addNewRouteListener(ActionListener al) {
		this.btnNeueRoute.addActionListener(al);
	}
	public void addDeleteRouteListener(ActionListener al) {
		this.btnRouteLoeschen.addActionListener(al);
	}
	public void addRouteGenListener(ActionListener al) {
		this.btnRoutenGenerieren.addActionListener(al);
	}
	public void addAddingListener(ActionListener al) {
		this.btnAuftragHinzufuegen.addActionListener(al);
	}
	public void addRemoveListener(ActionListener al) {
		this.btnAuftragEntfernen.addActionListener(al);
	}
	public void addAssignListener(ActionListener al) {
		this.btnFahrerZuweisen.addActionListener(al);
	}
	public void addFahzeugChangeListener(ActionListener al) {
		this.comboBoxFahrzeug.addActionListener(al);
	}
	public void addRoutenListListener(MouseListener mouse) {
		this.lsRouten.addMouseListener(mouse);
	}
	public void addAuftraegeListListener(MouseListener mouse) {
		this.lsAuftraege.addMouseListener(mouse);
	}
	public void addFahrerListListener(MouseListener mouse) {
		this.lsFahrer.addMouseListener(mouse);
	}
}
