package bmicalc;

import java.util.Map;

public class DecoratorEuropa extends BaseDecorator{
	
	private double altura, peso;
	
	public DecoratorEuropa(IMCHospital realcalc) {
		super(realcalc);
	}
	
	@Override
	public Map<Double, String> imc(double altura, double peso) {
		Map<Double, String> resultado = super.imc(altura, peso);
		this.altura = altura;
		this.peso = peso; 
		return resultado;
	}
	
	public String imcResult( Map<Double, String> imc) {
		double bmi = imc.keySet().toArray(new Double[1])[0];
		return "La persona con altura " + altura + " metros y " + peso + " kilos de peso tiene un IMC de " + bmi + ".";
	}

	@Override
	public boolean tieneObesidadAbdominal(char genero, double circunferencia) {
		return super.tieneObesidadAbdominal(genero, circunferencia);
	}
	
	

}
