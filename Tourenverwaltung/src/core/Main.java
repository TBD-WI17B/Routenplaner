package core;

import java.awt.EventQueue;

import core.View.View;
import core.Controller.Verwaltung;
import core.Model.*;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model model = new Model();
		View window = new View(model);		
		Verwaltung contoller = new Verwaltung(window, model);
		

		window.setVisible(true);
		
		
	}
//	private static void createView()
//	{
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					window = new View();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

}
