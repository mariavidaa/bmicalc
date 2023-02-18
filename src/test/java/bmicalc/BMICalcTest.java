package bmicalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
	
	
}
