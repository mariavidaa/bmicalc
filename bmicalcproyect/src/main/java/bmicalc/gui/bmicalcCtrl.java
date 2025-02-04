package bmicalc.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bmicalc.BMICalcImpl;
import bmicalc.Gender;
import bmicalc.NegativeValueException;
import bmicalc.ObesityCategory;

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
				try {
					double bmi = calculator.calculateBodyMassIndex(m, h);
					double resultado = Math.round(bmi*1000.0)/1000.0;
					vista.setResultado_bmi(resultado);
				} catch (NegativeValueException error) {
					vista.error("Introduce un número positivo.");
				}
				
			}
			if (command.equalsIgnoreCase("Compute abdominal obesity")) {
				double wc = vista.getInputValueWaistC();
				String gender = vista.getInputValueGender();
				Gender g = null;
				if (gender == "Female"){
						g = Gender.FEMALE;
				} else if (gender == "Male"){
					g = Gender.MALE;
				}
				try {
					boolean resultado = calculator.abdominalObesity(wc, g);
					vista.setResultado_abdobsesity(resultado);
				} catch (NegativeValueException error) {
					vista.error("Introduce un número positivo.");
				}
				
			}
			if (command.equalsIgnoreCase("Compute category")) {
				double bmi = vista.getInputValueBMI();
				ObesityCategory resultado = calculator.getObesityCategory(bmi);
				vista.setResultado_category(resultado);
			}
		}
	

}
