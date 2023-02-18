package bmicalc;

public class BMICalcImpl implements BMICalc {
	
	public BMICalcImpl() {
		
	}

	public double bmi(double mass, double height) {
	/**
	* Calculate the Body Mass Index (BMI) of a person.
	* BMI = mass (kg) / height^2 (m)
	*/
		return Math.round(mass/(height*height));
	}

	public String category(double bmi) {
		return "";
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		return false;
	}

}
