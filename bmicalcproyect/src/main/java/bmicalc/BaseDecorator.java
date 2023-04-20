package bmicalc;

import java.util.Map;

public class BaseDecorator implements IMCHospital{
	
	private IMCHospital realcalc;

	public BaseDecorator(IMCHospital realcalc) {
		this.realcalc = realcalc;
	}

	@Override
	public Map<Double, String> imc(double altura, double peso) {
		Map<Double, String> resultado = realcalc.imc(altura, peso);
		return resultado;
	}

	@Override
	public boolean tieneObesidadAbdominal(char genero, double circunferencia) {
		return realcalc.tieneObesidadAbdominal(genero, circunferencia);
	}

		
}
