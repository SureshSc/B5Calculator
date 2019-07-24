package com.batch5.Batch5Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.batch5.Batch5Calculator.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT, classes = Batch5CalculatorApplication.class)

public class Stepdef {
	
	String url;
	Double result;
	
	@Given("Rest Api {string}")
	public void rest_Api(String serviceUrl) {
		url = serviceUrl ;
	}

	@When("I invoke the given rest api")
	public void i_invoke_the_given_rest_api() {
		RestTemplate restTemplate = new RestTemplate();
	    result = restTemplate.getForObject(url, Double.class);
	}

	@Then("the expected result is {double}")
	public void the_expected_result_is(Double expected) {
		assertEquals(expected, result,0.01);
	}


}
