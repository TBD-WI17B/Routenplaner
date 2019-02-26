package core.View;

import java.awt.Component;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.ListSelectionModel;

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
	private JTextField txtAbc;
	private JTextField txtZzz;
	private JLabel lblInfoZusatz;
	private JTextPane txtInfoZusatz;
	private JButton btnRoutenGenerieren;
	private JLabel lblInfoRoutenID;
	private JLabel lbl_auftraege;
	
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
		
		this.lsRouten = new JList();
		this.lsRouten.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.lsRouten.setValueIsAdjusting(true);
		this.lsRouten.setModel(new AbstractListModel() {
			String[] values = new String[] {"Route 1", "Route 2", "Route 3", "Route 4"};
			@Override
			public int getSize() {
				return values.length;
			}
			@Override
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		this.lsRouten.setSelectedIndex(0);
		this.lsRouten.setBounds(10, 36, 227, 217);
		this.pnl_routenplaner.add(this.lsRouten);
		
		this.lbl_routen = new JLabel("Routen");
		this.lbl_routen.setLabelFor(this.lsRouten);
		this.lbl_routen.setBounds(10, 11, 88, 14);
		this.pnl_routenplaner.add(this.lbl_routen);
		
		this.lbl_auftraege = new JLabel("Aufträge");
		this.lbl_auftraege.setBounds(269, 11, 98, 14);
		this.pnl_routenplaner.add(this.lbl_auftraege);
		
		this.lsAuftraege = new JList();
		this.lsAuftraege.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.lsAuftraege.setModel(new AbstractListModel() {
			String[] values = new String[] {"A125 Mosbach", "A251 \u00D6hringen", "A21 Oedheim", "A54 Stuttgart", "A12 Heilbronn"};
			@Override
			public int getSize() {
				return values.length;
			}
			@Override
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		this.lbl_auftraege.setLabelFor(this.lsAuftraege);
		this.lsAuftraege.setBounds(269, 36, 227, 217);
		this.pnl_routenplaner.add(this.lsAuftraege);
		
		this.txtInfoAuftragsnummer = new JTextField();
		this.txtInfoAuftragsnummer.setText("Auftragsnummer");
		this.txtInfoAuftragsnummer.setBounds(109, 373, 112, 20);
		this.pnl_routenplaner.add(this.txtInfoAuftragsnummer);
		this.txtInfoAuftragsnummer.setColumns(10);
		
		this.txtInfoFahrer = new JTextField();
		this.txtInfoFahrer.setText("Fahrer");
		this.txtInfoFahrer.setBounds(109, 404, 86, 20);
		this.pnl_routenplaner.add(this.txtInfoFahrer);
		this.txtInfoFahrer.setColumns(10);
		
		this.txtInfoKm = new JTextField();
		this.txtInfoKm.setText("km");
		this.txtInfoKm.setBounds(109, 466, 86, 20);
		this.pnl_routenplaner.add(this.txtInfoKm);
		this.txtInfoKm.setColumns(10);
		
		this.txtInfoDauer = new JTextField();
		this.txtInfoDauer.setText("dauer");
		this.txtInfoDauer.setBounds(109, 435, 86, 20);
		this.pnl_routenplaner.add(this.txtInfoDauer);
		this.txtInfoDauer.setColumns(10);
		
		this.lsFahrer = new JList();
		this.lsFahrer.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.lsFahrer.setModel(new AbstractListModel() {
			String[] values = new String[] {"Karl, M\u00FCller", "Heinz, Ketchup"};
			@Override
			public int getSize() {
				return values.length;
			}
			@Override
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		this.lsFahrer.setSelectedIndex(0);
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
		
//		this.lblInfos = new JLabel("Infos");
//		this.lblInfos.setBounds(10, 497, 88, 14);
//		this.pnl_routenplaner.add(this.lblInfos);
//		
//		this.lblInfos_1 = new JLabel("Infos");
//		this.lblInfos_1.setBounds(10, 528, 88, 14);
//		this.pnl_routenplaner.add(this.lblInfos_1);
		
//		this.txtAbc = new JTextField();
//		this.txtAbc.setText("abc");
//		this.txtAbc.setColumns(10);
//		this.txtAbc.setBounds(109, 497, 86, 20);
//		this.pnl_routenplaner.add(this.txtAbc);
//		
//		this.txtZzz = new JTextField();
//		this.txtZzz.setText("zzz");
//		this.txtZzz.setColumns(10);
//		this.txtZzz.setBounds(109, 528, 86, 20);
//		this.pnl_routenplaner.add(this.txtZzz);
		
		this.lblInfoZusatz = new JLabel("Zusatz");
		this.lblInfoZusatz.setBounds(10, 491, 88, 14);
		this.pnl_routenplaner.add(this.lblInfoZusatz);
		
		this.txtInfoZusatz = new JTextPane();
		this.txtInfoZusatz.setText("Lorem Ipsum oder so");
		this.txtInfoZusatz.setBounds(109, 497, 358, 118);
		this.pnl_routenplaner.add(this.txtInfoZusatz);
		
		this.btnRoutenGenerieren = new JButton("Routen generieren");
		this.btnRoutenGenerieren.setBounds(114, 298, 123, 23);
		this.pnl_routenplaner.add(this.btnRoutenGenerieren);
	}
	public JPanel getSubPanel()
	{	
		return pnl_routenplaner;		
	}	
}
