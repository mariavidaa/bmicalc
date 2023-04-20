package bmicalc;

import java.util.Map;

public class main {

	public static void main(String[] args) {
		//tenemos una calculadora de tipo BMICalcImpl (singleton)
		BMICalcImpl bmiCalc = BMICalcImpl.getInstance();
		// tenemos otra calculadora de tipo IMCHospital (adapter)
		IMCHospital imcCalc = new Adapter(bmiCalc);
		//tenemos otra calculdora que implementa las interfaces IMCHospital e IMCStats (proxy)
		Proxy imcCalc_proxy = new Proxy(imcCalc);
		//tenemos una calculadora Europea
		BaseDecorator EuropaCalc = new DecoratorEuropa(imcCalc);
		// tenemos una calculadora Americana
		BaseDecorator AmericaCalc = new DecoratorAmerica(imcCalc);
		
		//calculamos el bmi y la categoria de bmicalc
		double bmi = bmiCalc.bmi(60, 1.7);
		String category = bmiCalc.category(bmi);
		// lo hacemos para imcCalc
		Map<Double, String> imc = imcCalc.imc(1.7, 60);
		//los resultados seran iguales
		System.out.println("El BMI es: " + bmi + " y la categoría es: " + category);
		System.out.println("El IMC es: " + imc);
		
		//probando patron de diseño proxy
		//calculamos el imc y comprobamos si tiene obesidad abdominal
		Map<Double, String> imc_2 = imcCalc_proxy.imc(1.7, 60);
		boolean obesidad = imcCalc_proxy.tieneObesidadAbdominal('F', 32.5);
		System.out.println("IMC: " + imc_2 + ", obsesidad abdominal: " + obesidad);
		double pesoMedio = imcCalc_proxy.pesoMedio();
		System.out.println("la altura media es: " + pesoMedio);
		
		//probando el patron de diseño Decorator
		//calculamos el IMC de la calculadora Europea
		EuropaCalc.imc(1.7, 60);
		//calculamos el IMC de la calculadora Americana
		AmericaCalc.imc(5.577428,132.2772);
		
		
		
		
	}

}
