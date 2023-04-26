package bmicalc;

import java.util.Map;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		// creamos las calculadoras
		// tenemos una calculadora de tipo BMICalcImpl (singleton)
		BMICalcImpl bmiCalc = BMICalcImpl.getInstance();
		//tenemos otra calculadora de tipo IMCHospital (adapter)
		IMCHospital imcCalc = new Adapter(bmiCalc);
		// tenemos otra calculdora que implementa las interfaces IMCHospital e IMCStats (proxy)
		Proxy imcCalc_proxy = new Proxy(imcCalc);
		// tenemos una calculadora Europea
		BaseDecorator EuropaCalc = new DecoratorEuropa(imcCalc_proxy);
		// tenemos una calculadora Americana
		BaseDecorator AmericaCalc = new DecoratorAmerica(imcCalc_proxy);
		//podemos añadir los compportamientos de las dos clases en uno
		//BaseDecorator AmericaCalc = new DecoratorAmerica(EuropaCalc);
		
		// probamos el patron de diseño singleton y los usamos como introduccion de nuestra aplicacion
		System.out.println("Esta calculadora realiza operaciones como calcular el indice de masa corporal para un paciente de 60kg y altura de 1,7 metros cuyo resultado es " + bmiCalc.bmi(60, 1.7));
		
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		
		while (!salir) {
			//mMostramos las opciones disponibles
			System.out.println("Opciones:");
			System.out.println("0: Salir de la aplicacion");
			System.out.println("1: Calcular el IMC");
			System.out.println("2: English: Calculate IMC");
			System.out.println("3: Averiguar si presenta obsidad abdominal");
			System.out.println("4: Averiguar la altura media de los pacientes hasta el momento");
			System.out.println("5: Averiguar el peso medio de los pacientes hasta el momento");
			System.out.println("6: Averiguar el IMC medio de los pacientes hasta el momento");
			System.out.println("7: Averiguar el numero de pacientes");

			
			// Leemos la opción del usuario
			System.out.print("Ingrese una opcion: ");
			int opcion = sc.nextInt();
			sc.nextLine(); 
			
			// Ejecutamos la acción correspondiente a la opción elegida
			switch (opcion) {
			case 0:
                salir = true;
                break;
			case 1:
				// Aquí va el código para ejecutar la opción 1
				System.out.print("Ingrese el peso (en kg) (ejemplo 60,5): ");
				double peso = sc.nextDouble();
				System.out.print("Ingrese la altura (en metros) (ejemplo 1,7): ");
				double altura = sc.nextDouble();
				//imcCalc_proxy.imc(altura, peso);
				System.out.println(EuropaCalc.imc(altura, peso));
				break;
			case 2:
				System.out.print("Enter weight (kg) (example 60,5): ");
				double peso2 = sc.nextDouble();
				System.out.print("Enter height (m) (example 1,7): ");
				double altura2 = sc.nextDouble();
				//imcCalc_proxy.imc(altura2, peso2);
				System.out.println(AmericaCalc.imc(altura2, peso2));
				break;
			case 3:
				System.out.print("Ingrese el genero como F o M (F si femenino o M si masculino): ");
				char genero = sc.next().charAt(0);
				System.out.print("Ingrese la medida de circunferencia (en cm) (ejemplo 70,2): ");
				double circunferencia = sc.nextDouble();
				System.out.println(imcCalc.tieneObesidadAbdominal(genero, circunferencia));
				break;
			case 4:
				
				// System.out.println(imcCalc_proxy.alturaMedia());
				System.out.println(Math.round((imcCalc_proxy.alturaMedia())*1000.0)/1000.0);
				break;
			case 5:
				
				System.out.println(Math.round((imcCalc_proxy.pesoMedio())*1000.0)/1000.0);
				break;
			case 6:
				
				System.out.println(Math.round((imcCalc_proxy.imcMedio())*1000.0)/1000.0);
			case 7:
				System.out.println(imcCalc_proxy.numPacientes());
				break;
			
			default:
				System.out.println("Opción inválida");
				break;
			}
			
		}
			
		sc.close(); // Cerramos el Scanner
			
			
			
			
			
		}	

	}
