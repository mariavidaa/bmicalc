package bmicalc.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bmicalc.BMICalcImpl;

public class bmicalcCtrl implements ActionListener{

	
		private BMICalcImpl calculator;
		private bmicalcVista vista;
		
		
		public bmicalcCtrl(BMICalcImpl bmicalc, bmicalcVista vista) {
			this.calculator = bmicalc;
			this.vista = vista;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (command.equalsIgnoreCase("Compute bmi")) {
				double m = vista.getInputValueMass();
				double h = vista.getInputValueHeight();
				double resultado = calculator.bmi(m, h);
				vista.setResultado_bmi(resultado);
			}
			if (command.equalsIgnoreCase("Compute abdominal obesity")) {
				double wc = vista.getInputValueWaistC();
				String gender = vista.getInputValueGender();
				char g = ' ';
				if (gender == "Female"){
						g = 'F';
				} else if (gender == "Male"){
					g = 'M';
				}
				boolean resultado = calculator.abdominalObesity(wc, g);
				vista.setResultado_abdobsesity(resultado);
			}
			if (command.equalsIgnoreCase("Compute category")) {
				double bmi = vista.getInputValueBMI();
				String resultado = calculator.category(bmi);
				vista.setResultado_category(resultado);
			}
		}
	

}
