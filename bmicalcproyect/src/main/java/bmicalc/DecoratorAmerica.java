package bmicalc;

import java.util.Map;

public class DecoratorAmerica extends BaseDecorator{

	
	
	public DecoratorAmerica(IMCHospital realcalc) {
		super(realcalc);
	}
	
	@Override
	public Map<Double, String> imc(double pies, double libras) {
		double altura = pies/3.28084;
		double peso = libras/2.20462;
		Map<Double, String> resultado = super.imc(altura, peso);
		double bmi = resultado.keySet().toArray(new Double[1])[0];
		System.out.println("The person with height " + Math.round(altura*1000.0)/1000.0 + " meters and " + peso + " kilos has a BMI of " + bmi + ".");
		return resultado;
	}
	
	
	@Override
	public boolean tieneObesidadAbdominal(char genero, double circunferencia) {
		return super.tieneObesidadAbdominal(genero, circunferencia);
	}

}
