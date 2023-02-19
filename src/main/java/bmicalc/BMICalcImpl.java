package bmicalc;

public class BMICalcImpl implements BMICalc {
	
	public BMICalcImpl() {
		
	}

	public double bmi(double mass, double height) {
		return Math.round(mass/(height*height));
	}

	public String category(double bmi) {
		String category = null;
		if (bmi < 18.5) {
			category = "UNDERWEIGHT";
		}
		else if (bmi >= 18.5 && bmi <=24.9) {
			category = "NORMAL";
		}
		else if (bmi >= 25.0 && bmi <=29.9) {
			category = "OVERWEIGHT";
		}
		else if (bmi >=30) {
			category = "OBESE";
		}
		
		return category;
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		return false;
	}

}
