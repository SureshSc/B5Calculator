Feature: Calculator REST API
	Scenario: Invoking subtraction
		Given Rest Api "http://localhost:9400/subtraction?firstOperand=10.0&secondOperand=10.0"
		When I invoke the given rest api
		Then the expected result is 0.0
		

