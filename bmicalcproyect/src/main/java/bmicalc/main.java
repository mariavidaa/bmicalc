package bmicalc;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		BMICalcImpl bmicalc = BMICalcImpl.getInstace();
		
		double bmi = bmicalc.bmi(60, 1.7);
		System.out.println(bmi);
	}

}
