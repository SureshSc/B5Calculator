Feature: Calculator
	Scenario:Multiplication
		Given Rest Api "http://localhost:9400/multiplication?firstOperand=20&secondOperand=10"		
		When invoking the given rest api
		Then expecting the product is 200
	Scenario: Invoking subtraction
		Given Rest Api "http://localhost:9400/subtraction?firstOperand=10.0&secondOperand=10.0"
		When I invoke the given rest api
		Then the expected result is 0.0
		