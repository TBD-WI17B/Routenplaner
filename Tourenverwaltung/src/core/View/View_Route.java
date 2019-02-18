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

public class View_Route{

	private JPanel pnl_routenplaner;
	private JLabel lbl_map;
	private JList ls_routen;
	private JLabel lbl_routen;
	private JLabel lbl_haltepunkte;
	private JList ls_haltepunkte;
	private JTextField txtAuftragsnummer;
	private JTextField txtFahrer;
	private JTextField txtKm;
	private JTextField txtDauer;
	private JList ls_fahrer;
	private JLabel lblNewLabel;
	private JButton btnNeueRoute;
	private JButton btnLschen;
	private JButton btnBearbeiten;
	private JButton btnHinzufgen;
	private JButton btnEntfernen;
	private JButton btnZuweisen;
	private JLabel lblAuftragsnummer;
	private JLabel lblFahrer;
	private JLabel lblDauer;
	private JLabel lblDistanz;
	private JLabel lblInfos;
	private JLabel lblInfos_1;
	private JTextField txtAbc;
	private JTextField txtZzz;
	private JLabel lblZusatz;
	private JTextPane txtpnLoremIpsumOder;
	private JButton btnRoutenGenerieren;
	private JLabel lblRoutenID;
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
		
		this.ls_routen = new JList();
		this.ls_routen.setValueIsAdjusting(true);
		this.ls_routen.setModel(new AbstractListModel() {
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
		this.ls_routen.setSelectedIndex(0);
		this.ls_routen.setBounds(10, 36, 227, 217);
		this.pnl_routenplaner.add(this.ls_routen);
		
		this.lbl_routen = new JLabel("Routen");
		this.lbl_routen.setLabelFor(this.ls_routen);
		this.lbl_routen.setBounds(10, 11, 88, 14);
		this.pnl_routenplaner.add(this.lbl_routen);
		
		this.lbl_auftraege = new JLabel("Aufträge");
		this.lbl_auftraege.setBounds(269, 11, 98, 14);
		this.pnl_routenplaner.add(this.lbl_auftraege);
		
		this.ls_haltepunkte = new JList();
		this.ls_haltepunkte.setModel(new AbstractListModel() {
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
		this.lbl_auftraege.setLabelFor(this.ls_haltepunkte);
		this.ls_haltepunkte.setBounds(269, 36, 227, 217);
		this.pnl_routenplaner.add(this.ls_haltepunkte);
		
		this.txtAuftragsnummer = new JTextField();
		this.txtAuftragsnummer.setText("Auftragsnummer");
		this.txtAuftragsnummer.setBounds(109, 373, 112, 20);
		this.pnl_routenplaner.add(this.txtAuftragsnummer);
		this.txtAuftragsnummer.setColumns(10);
		
		this.txtFahrer = new JTextField();
		this.txtFahrer.setText("Fahrer");
		this.txtFahrer.setBounds(109, 404, 86, 20);
		this.pnl_routenplaner.add(this.txtFahrer);
		this.txtFahrer.setColumns(10);
		
		this.txtKm = new JTextField();
		this.txtKm.setText("km");
		this.txtKm.setBounds(109, 466, 86, 20);
		this.pnl_routenplaner.add(this.txtKm);
		this.txtKm.setColumns(10);
		
		this.txtDauer = new JTextField();
		this.txtDauer.setText("dauer");
		this.txtDauer.setBounds(109, 435, 86, 20);
		this.pnl_routenplaner.add(this.txtDauer);
		this.txtDauer.setColumns(10);
		
		this.ls_fahrer = new JList();
		this.ls_fahrer.setModel(new AbstractListModel() {
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
		this.ls_fahrer.setSelectedIndex(0);
		this.ls_fahrer.setBounds(526, 36, 227, 217);
		this.pnl_routenplaner.add(this.ls_fahrer);
		
		this.lblNewLabel = new JLabel("Fahrer");
		this.lblNewLabel.setLabelFor(this.ls_fahrer);
		this.lblNewLabel.setBounds(526, 11, 88, 14);
		this.pnl_routenplaner.add(this.lblNewLabel);
		
		this.btnNeueRoute = new JButton("Neue Route");
		this.btnNeueRoute.setBounds(10, 264, 94, 23);
		this.pnl_routenplaner.add(this.btnNeueRoute);
		
		this.btnLschen = new JButton("L\u00F6schen");
		this.btnLschen.setBounds(114, 264, 123, 23);
		this.pnl_routenplaner.add(this.btnLschen);
		
//		this.btnBearbeiten = new JButton("Bearbeiten");
//		this.btnBearbeiten.setBounds(10, 298, 94, 23);
//		this.pnl_routenplaner.add(this.btnBearbeiten);
		
		this.btnHinzufgen = new JButton("Hinzuf\u00FCgen");
		this.btnHinzufgen.setBounds(269, 264, 89, 23);
		this.pnl_routenplaner.add(this.btnHinzufgen);
		
		this.btnEntfernen = new JButton("Entfernen");
		this.btnEntfernen.setBounds(368, 264, 89, 23);
		this.pnl_routenplaner.add(this.btnEntfernen);
		
		this.btnZuweisen = new JButton("Zuweisen");
		this.btnZuweisen.setBounds(526, 264, 89, 23);
		this.pnl_routenplaner.add(this.btnZuweisen);
		
		this.lblRoutenID = new JLabel("Routen-ID");
		this.lblRoutenID.setBounds(10, 373, 88, 14);
		this.pnl_routenplaner.add(this.lblRoutenID);
		
		this.lblFahrer = new JLabel("Fahrer");
		this.lblFahrer.setBounds(10, 404, 88, 14);
		this.pnl_routenplaner.add(this.lblFahrer);
		
		this.lblDauer = new JLabel("Dauer");
		this.lblDauer.setBounds(10, 435, 88, 14);
		this.pnl_routenplaner.add(this.lblDauer);
		
		this.lblDistanz = new JLabel("Distanz");
		this.lblDistanz.setBounds(10, 466, 88, 14);
		this.pnl_routenplaner.add(this.lblDistanz);
		
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
		
		this.lblZusatz = new JLabel("Zusatz");
		this.lblZusatz.setBounds(10, 553, 88, 14);
		this.pnl_routenplaner.add(this.lblZusatz);
		
		this.txtpnLoremIpsumOder = new JTextPane();
		this.txtpnLoremIpsumOder.setText("Lorem Ipsum oder so");
		this.txtpnLoremIpsumOder.setBounds(109, 559, 358, 118);
		this.pnl_routenplaner.add(this.txtpnLoremIpsumOder);
		
		this.btnRoutenGenerieren = new JButton("Routen generieren");
		this.btnRoutenGenerieren.setBounds(114, 298, 123, 23);
		this.pnl_routenplaner.add(this.btnRoutenGenerieren);
	}
	public JPanel getSubPanel()
	{	
		return pnl_routenplaner;		
	}	
}
