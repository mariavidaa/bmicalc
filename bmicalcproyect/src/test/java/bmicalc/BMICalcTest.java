package bmicalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BMICalcTest {
	
	private BMICalcImpl b;
	
	
	@BeforeEach
	public void start() {
		b = new BMICalcImpl();
	}
	
	
	@Test
	@DisplayName("bmi correct")
	void testbmi5() {
		double bmi;
		bmi = b.calculateBodyMassIndex(65, 1.70);
		double bmiround = Math.round(bmi*1000.0)/1000.0;
		assertEquals(bmiround,22.491);
		assertNotEquals(bmiround, 22.4);
	}
	
	
	@Test
	@DisplayName("bmi data not null")
	void exceptionTesting() {
	
		Exception exception1 = assertThrows(NegativeValueException.class,
				()->b.calculateBodyMassIndex(60, 0));
		Exception exception2 = assertThrows(NegativeValueException.class,
				()->b.calculateBodyMassIndex(0, 1.70));
	}
	
	
	@Test
	@DisplayName("bmi data not negative")
	void exceptionTesting2() {
		
		Exception exception1 = assertThrows(NegativeValueException.class,
				()->b.calculateBodyMassIndex(60, -1));
		Exception exception2 = assertThrows(NegativeValueException.class,
				()->b.calculateBodyMassIndex(-1, 1.70));
	}
	
	@Test
	@DisplayName("bmi data in range")
	void exceptionTesting3() {
		Exception exception1 = assertThrows(ArithmeticException.class,
											()->b.calculateBodyMassIndex(700,1.7));
		Exception exception2 = assertThrows(ArithmeticException.class,
											()->b.calculateBodyMassIndex(0.1,1.7));
		Exception exception3 = assertThrows(ArithmeticException.class,
											()->b.calculateBodyMassIndex(60,3));
		Exception exception4 = assertThrows(ArithmeticException.class,
											()->b.calculateBodyMassIndex(60,0.012));
		
	}
	
	
	@Test
	@DisplayName("bmi not null")
	void testbmi3() {
		double bmi;
		for(double m=4;m<10;m+=1.5) {
			for(double h=1.5;m<2;m+=1.1) {
				bmi = b.calculateBodyMassIndex(m, h);
				assertNotEquals(bmi,0);
			}
		}
	}
	
	@Test
	@DisplayName("bmi not negative")
	void testbmi4() {
		double bmi;
		for(double m=4;m<10;m+=1.5) {
			for(double h=1.5;m<2;m+=1.1) {
				bmi = b.calculateBodyMassIndex(m, h);
				assertNotEquals(-1,bmi/bmi);
			}
		}
	}
	
	@ParameterizedTest
	@DisplayName("category underweight correct")
	@ValueSource (doubles = {10, 18.4})
	void testcat1(double bmi) {
		assertEquals(ObesityCategory.UNDERWEIGHT,b.getObesityCategory(bmi));
		assertNotEquals(ObesityCategory.UNDERWEIGHT, b.getObesityCategory(19));
	}
	
	
	@ParameterizedTest
	@DisplayName("category normal correct")
	@ValueSource (doubles = {18.5, 20, 24.9})
	void testcat2(double bmi) {
		assertEquals(ObesityCategory.NORMAL,b.getObesityCategory(bmi));
		assertNotEquals(ObesityCategory.NORMAL, b.getObesityCategory(26));
	}
	
	@ParameterizedTest
	@DisplayName("category overweight correct")
	@ValueSource (doubles = {25.0, 28, 29.9})
	void testcat3(double bmi) {
		assertEquals(ObesityCategory.OVERWEIGHT,b.getObesityCategory(bmi));
		assertNotEquals(ObesityCategory.OVERWEIGHT, b.getObesityCategory(23));
	}
	
	@ParameterizedTest
	@DisplayName("category obese correct")
	@ValueSource (doubles = {30, 60})
	void testcat4(double bmi) {
		assertEquals(ObesityCategory.OBESE,b.getObesityCategory(bmi));
		assertNotEquals(ObesityCategory.OBESE, b.getObesityCategory(25));
	}
	
	@ParameterizedTest
	@DisplayName("abdominalObesity woman correct")
	@ValueSource (doubles = {80.1, 85})
	void testao1(double wc) {
		assertEquals(true,b.abdominalObesity(wc, Gender.FEMALE));
		assertNotEquals(true, b.abdominalObesity(80, Gender.FEMALE));
	}
	
	@ParameterizedTest
	@DisplayName("abdominalObesity man correct")
	@ValueSource (doubles = {92.0, 95})
	void testao2(double wc) {
		assertEquals(true,b.abdominalObesity(wc, Gender.MALE));
		assertNotEquals(true, b.abdominalObesity(90, Gender.MALE));
	}
	
	@Test
	@DisplayName("gender F or M")
	void exceptionTesting4() {
		
		Exception exception1 = assertThrows(RuntimeException.class,
				()->b.calculateBodyMassIndex(85, 'f'));
		Exception exception2 = assertThrows(RuntimeException.class,
				()->b.calculateBodyMassIndex(84, 'm'));
	}
	
}
