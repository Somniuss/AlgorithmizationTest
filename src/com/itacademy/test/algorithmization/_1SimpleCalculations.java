package com.itacademy.test.algorithmization;

public class _1SimpleCalculations {

	public static void main(String[] args) {
		double x = 0.5;
		double res = calculateFunction(x);
		System.out.println("res= " + res);
	}

	public static double calculateFunction(double x) {
		return Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin(Math.PI * x / (x + 2.0 / 3.0))) + 1.7;
	}
}