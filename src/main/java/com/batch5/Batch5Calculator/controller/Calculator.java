package com.batch5.Batch5Calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
	
	@GetMapping("multiplication")
	@ResponseBody
	public double multiplication(@RequestParam double firstOperand, @RequestParam double secondOperand) {
		return firstOperand * secondOperand;
	}

}
	@GetMapping("subtraction")
	@ResponseBody
	public double subtraction(@RequestParam double firstOperand, @RequestParam double secondOperand) {
		return firstOperand-secondOperand;
	}
}
