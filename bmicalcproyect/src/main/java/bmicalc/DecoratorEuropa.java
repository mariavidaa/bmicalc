package bmicalc;

import java.util.Map;

public class DecoratorEuropa extends BaseDecorator{
	
	
	
	public DecoratorEuropa(IMCHospital realcalc) {
		super(realcalc);
	}
	
	@Override
	public Map<Double, String> imc(double altura, double peso) {
		Map<Double, String> resultado = super.imc(altura, peso);
		double bmi = resultado.keySet().toArray(new Double[1])[0];
		System.out.println("La persona con altura " + altura + " metros y " + peso + " kilos tiene un IMC de " + Math.round(bmi*1000.0)/1000.0 + "."); 
		return resultado;
	}
	
	

	@Override
	public boolean tieneObesidadAbdominal(char genero, double circunferencia) {
		return super.tieneObesidadAbdominal(genero, circunferencia);
	}
	
	

}
