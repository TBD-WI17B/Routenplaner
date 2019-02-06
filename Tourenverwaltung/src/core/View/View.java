package core.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

import core.Model.Model;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JButton;

public class View {
	
	private Model model;

	private JFrame frmTourenverwaltung;
	private JPanel panel_4;
	private JPanel panel_3;
	private JPanel panel_2;
	private JPanel panel_1;
	private JPanel panel;
	private JTextArea txttest;
	private JMenuBar menuBar;
	private JTabbedPane tabbedPane;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					final View window = new View();
					window.frmTourenverwaltung.setVisible(true);
					window.btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							window.txttest.setText("test");
						}
					});
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public View(Model m) {
		this.model = m;
		initialize();
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					initialize();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});		
	}

	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * Wenn möglich hier kein Custom Code, da hier alles auto generiert wird.
	 */
	private void initialize() {
		frmTourenverwaltung = new JFrame();
		frmTourenverwaltung.setIconImage(Toolkit.getDefaultToolkit().getImage(View.class.getResource("/images/72-200.png")));
		frmTourenverwaltung.setTitle("Tourenverwaltung");
		frmTourenverwaltung.setBounds(100, 100, 838, 526);
		frmTourenverwaltung.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menuBar = new JMenuBar();
		frmTourenverwaltung.setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmSettings = new JMenuItem("settings");
		mnMenu.add(mntmSettings);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenu mnMoreStuff = new JMenu("more stuff");
		menuBar.add(mnMoreStuff);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmTourenverwaltung.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		panel = new JPanel();
		tabbedPane.addTab("Routenplaner", null, panel, null);
		this.panel.setLayout(null);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Fahrerverwaltung", null, panel_1, null);
		this.panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		tabbedPane.addTab("Auftragsverwaltung", null, panel_2, null);
		this.panel_2.setLayout(null);
		
		panel_3 = new JPanel();
		tabbedPane.addTab("Kundenverwaltung", null, panel_3, null);
		this.panel_3.setLayout(null);
		
		panel_4 = new JPanel();
		tabbedPane.addTab("test", null, panel_4, null);
		panel_4.setLayout(null);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(156, 26, 89, 23);
		
		panel_4.add(btnNewButton);
		
		txttest = new JTextArea();
		txttest.setBounds(373, 5, 164, 94);
		txttest.setColumns(20);
		txttest.setRows(5);
		txttest.setLineWrap(true);
		txttest.setText("sdfsdfsdf");
		panel_4.add(txttest);
	}

	public void addTesthandler(ActionListener al)
	{
		btnNewButton.addActionListener(al);
	}
	public void setTest(String txt) {
		txttest.setText(txt);
	}

	public void setVisible(boolean b) {
		this.frmTourenverwaltung.setVisible(b);
		
	}
}
