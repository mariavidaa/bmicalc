package bmicalc;

import java.util.Map;

public class Proxy implements IMCHospital, IMCStats{
	
	private IMCHospital realcalc;
	private double alturaTotal,pesoTotal,imcTotal;
	private int numPacientes;

	public Proxy(IMCHospital realcalc) {
		this.realcalc = realcalc;
	}

	@Override
	public Map<Double, String> imc(double altura, double peso) {
		pesoTotal += peso;
		alturaTotal += altura;
		numPacientes ++;
		Map<Double, String> resultado = realcalc.imc(altura, peso); // llama al método "imc" y obtiene el mapa resultante
		Double imc = resultado.keySet().toArray(new Double[1])[0];
		imcTotal += imc;
		return resultado;
	}

	@Override
	public boolean tieneObesidadAbdominal(char genero, double circunferencia) {
		return realcalc.tieneObesidadAbdominal(genero, circunferencia);
		
	}

	@Override
	public double alturaMedia() {
		if (numPacientes == 0) {
			return 0;
		} else {
			return alturaTotal/numPacientes;
		}
		
	}

	@Override
	public double pesoMedio() {
		if (numPacientes == 0) {
			return 0;
		} else {
			return pesoTotal/numPacientes;
		}
	}

	@Override
	public double imcMedio() {
		if (numPacientes == 0) {
			return 0;
		} else {
			return imcTotal/numPacientes;
		}
	}

	@Override
	public int numPacientes() {
		
		return numPacientes;
	}
	
	

}
