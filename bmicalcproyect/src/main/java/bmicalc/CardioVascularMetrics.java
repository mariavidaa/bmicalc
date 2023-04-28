package bmicalc;


public interface CardioVascularMetrics {
	
	/**
	 * Calculate the Body Mass Index (BMI) of a person.
	 * BMI = mass (kg) / height^2 (m)
	 * 
	 * @param mass 	 Weight of the person.
	 * @param height Height of the person.
	 * @return 		 The Body Mass Index (BMI) value.
	 */
	public double calculateBodyMassIndex(double mass, double height);
	
	public ObesityCategory getObesityCategory(double bmi);
}
