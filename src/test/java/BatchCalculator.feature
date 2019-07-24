Feature: Calculator
	Scenario:Multiplication
		Given Rest Api "http://localhost:9500/multiplication?firstOperand=20&secondOperand=10"		
		When invoking the given rest api
		Then expecting the product is 200
