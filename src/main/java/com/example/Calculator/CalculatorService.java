package com.example.Calculator;

public class CalculatorService {
	
	
	public String add(String x, String y) {
		return "Resutlt : " + (Integer.valueOf(x) + Integer.valueOf(y));
	}
	
	public String multiply(String x, String y) {
		return "Resutlt : " +(Integer.valueOf(x) * Integer.valueOf(y));
	}
	
	public String subtract(String x, String y) {
		return "Resutlt : " + (Integer.valueOf(x) - Integer.valueOf(y));
	}

}
