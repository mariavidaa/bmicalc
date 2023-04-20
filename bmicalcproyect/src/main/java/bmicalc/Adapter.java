package bmicalc;

import java.util.HashMap;
import java.util.Map;

public class Adapter implements IMCHospital{

	private BMICalc c;
	
	public Adapter(BMICalc c){
		this.c = c;
	}
	
	@Override
	public Map<Double,String> imc(double altura, double peso){
		Map<Double, String> result = new HashMap<>();
		double bmi = c.bmi(peso, altura); // Calcula el BMI utilizando la calculadora existente
        String category = c.category(bmi); // Obtiene la categoría del BMI
        result.put(bmi, category); // Agrega el resultado al mapa
        return result;
	}
	
	
	@Override
	public boolean tieneObesidadAbdominal(char genero, double circunferencia) {
		boolean tieneObesidad = c.abdominalObesity(circunferencia, genero); 
        return tieneObesidad;
	}

}
