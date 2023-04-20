package bmicalc;

import java.util.Map;

public interface IMCHospital {
	
	/**
     * Calcula el Índice de Masa Corporal (IMC) utilizando la altura y peso proporcionados.
     * Devuelve un mapa con el valor del IMC como clave y la categoría del IMC como valor.
     *
     * @param altura Altura en metros.
     * @param peso Peso en kilogramos.
     * @return Mapa con el valor del IMC y la categoría del IMC.
     */
	 public Map<Double,String> imc(double altura, double peso);
		
	/**
     * Verifica si una persona tiene obesidad abdominal según su género y circunferencia de cintura.
     *
     * @param genero Género de la persona ('F' para femenino, 'M' para masculino).
     * @param circunferencia Circunferencia de cintura en centímetros.
     * @return true si tiene obesidad abdominal, false en caso contrario.
     */
	public boolean tieneObesidadAbdominal(char genero, double circunferencia);
	
	
	
	
}
