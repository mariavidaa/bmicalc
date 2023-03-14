package hellocucumber;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
	
	private BMICalcImpl bmicalc, bmicalc2;
	private Double result_bmi;
	private boolean raiseException, result_ao;
	private Double mass, height, wc;
	
	@Before
	public void initialization() {
		bmicalc = null;
	    result_bmi = null;
	    raiseException = false;   
	}
	
	@Given("I have a bmi calculator")
	public void i_have_a_bmi_calculator() {
		bmicalc = new BMICalcImpl();
	}
	@Given("mass is {double}")
	public void mass_is(Double double1) {
		mass = double1;
	}
	@Given("height is {double}")
	public void height_is(Double double1) {
		height = double1;
	}
	@When("i calculate bmi for possible mass and height")
	public void i_calculate_bmi_for_possible_mass_and_height() {
		result_bmi = bmicalc.bmi(mass,height);
	}
	@Then("the system returns {double}")
	public void the_system_returns(Double double1) {
		Assertions.assertEquals(double1, Math.round(result_bmi));
	}

	@When("i calculate bmi for impossible mass or height")
	public void i_calculate_bmi_for_impossible_mass_or_height() {
		try {
			result_bmi = bmicalc.bmi(mass,height);
		} catch (ArithmeticException e) {
			raiseException = true;
		}
	}
	@Then("the system raises an exception")
	public void the_system_raises_an_exception() {
		Assertions.assertTrue(raiseException);
	}
	
	@Given("the user is a woman")
	public void the_user_is_a_woman() {
		bmicalc2 = new BMICalcImpl();
	}
	
	@Given("her waistCircumference is {double}")
	public void her_waist_circumference_is(Double double1) {
	    wc = double1;
	}
	@When("i calculate abdominalobsesity")
	public void i_calculate_abdominalobsesity() {
		result_ao = bmicalc2.abdominalObesity(wc,'F');
	}
	@Then("the system returns for abdominalobsesity true")
	public void the_system_returns_for_abdominalobsesity_true() {
		Assertions.assertEquals(true, result_ao);
	}
	
	@Then("the system returns for abdominalobsesity false")
	public void the_system_returns_for_abdominalobsesity_false() {
		Assertions.assertEquals(false, result_ao);
	}
}
