package bmicalc.gui;

import java.awt.EventQueue;

import bmicalc.BMICalcImpl;

public class bmicalcMain {

		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						BMICalcImpl model = new  BMICalcImpl();
						bmicalcVista view = new bmicalcVista();
						bmicalcCtrl controller = new bmicalcCtrl(model, view);
						view.registerController(controller);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});

		}
	

}
