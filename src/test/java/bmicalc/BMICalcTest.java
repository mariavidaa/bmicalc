package bmicalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BMICalcTest {
	
	private BMICalcImpl b;
	private double a;
	
	@BeforeEach
	public void start() {
		b = new BMICalcImpl();
	}
	
	@Test
	@DisplayName("Example Test Method.")
	void bmi() {
		assertEquals(true, true);
	}
	
	
	@Test
	@DisplayName("bmi correct")
	void testbmi2() {
		double bmi;
		for(double m=4;m<10;m+=1.5) {
			for(double h=1.5;m<2;m+=1.1) {
				bmi = b.bmi(m, h);
				assertEquals(bmi,m/(h*h));
				assertNotEquals(bmi, (m/(h*h))+1);
			}
		}
		
	}
	
	@Test
	@DisplayName("bmi not null")
	void testbmi3() {
		double bmi;
		for(double m=4;m<10;m+=1.5) {
			for(double h=1.5;m<2;m+=1.1) {
				bmi = b.bmi(m, h);
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
				bmi = b.bmi(m, h);
				assertNotEquals(-1,bmi/bmi);
			}
		}
	}
	
	@ParameterizedTest
	@DisplayName("category underweight correct")
	@ValueSource (doubles = {10, 18.4})
	void testcat1(double bmi) {
		assertEquals("UNDERWEIGHT",b.category(bmi));
	}
	
	
	@ParameterizedTest
	@DisplayName("category normal correct")
	@ValueSource (doubles = {18.5, 20, 24.9})
	void testcat2(double bmi) {
		assertEquals("NORMAL",b.category(bmi));
	}
	
	@ParameterizedTest
	@DisplayName("category overweight correct")
	@ValueSource (doubles = {25.0, 28, 29.9})
	void testcat3(double bmi) {
		assertEquals("OVERWEIGHT",b.category(bmi));
	}
	
	@ParameterizedTest
	@DisplayName("category obese correct")
	@ValueSource (doubles = {30, 60})
	void testcat4(double bmi) {
		assertEquals("OBESE",b.category(bmi));
	}
	
}
