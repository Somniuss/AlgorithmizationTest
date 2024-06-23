package com.itacademy.test.algorithmization;

public class _3SumAccumulation {

	public static void main(String[] args) {

		double n = 20;

		double res = calculateResult(n);

		System.out.println("res= " + res);
	}

	public static double calculateSum(double n) {
		double x = 0.5;
		double sum = 0;
		for (int k = 1; k <= n; k++) {
			sum += (Math.sin((k * x) / 2) + Math.sin((k * x - 1) / 2)) / Math.pow(Math.E, (x - 1) / k);
		}
		return sum;
	}

	public static double calculateResult(double n) {
		return Math.sqrt(Math.PI * n);
	}
}