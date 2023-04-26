package bmicalc;



public class BMICalcImpl implements CardioVascularMetrics, MetabolicMetrics {
	
	
	
	public BMICalcImpl() {
		
	}

	public double calculateBodyMassIndex(double mass, double height) {
		
		if ( height<=0 || mass<=0) {
			throw new NegativeValueException("Numeros negativos.");
		}
		
		if (mass<0.420 || mass>635) {
			throw new ArithmeticException();
		}
		
		if (height<0.023 || height>2.6) {
			throw new ArithmeticException();
		}
		
		
		return (mass/(height*height));
	}

	public ObesityCategory getObesityCategory(double bmi) {
		
		
		if (bmi < 18.5) {
			return ObesityCategory.UNDERWEIGHT;
		}
		else if (bmi >= 18.5 && bmi <=24.9) {
			return ObesityCategory.NORMAL;
		}
		else if (bmi >= 25.0 && bmi <=29.9) {
			return ObesityCategory.OVERWEIGHT;
		}
		else {
			return ObesityCategory.OBESE;
		}
		
		
		
	}

	public boolean abdominalObesity(double waistCircumference, Gender gender) {
		boolean ao = false;
		if ( gender!= Gender.FEMALE && gender!= Gender.MALE) {
			throw new RuntimeException();
		}
		if (gender==Gender.FEMALE && waistCircumference>80) {
			ao = true;
		} else if (gender==Gender.MALE && waistCircumference>90) {
			ao = true;
		}
		return ao;
	}

}
