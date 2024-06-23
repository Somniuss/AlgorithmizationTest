package com.itacademy.test.algorithmization;

public class _2FunctionValues {

	public static void main(String[] args) {
		int n = 10;
		double a = 0.50;
		double b = 1.00;
		double step = (b - a) / (n - 1);

		System.out.println("--------------------------------");
		System.out.printf("| %-2s | %-10s | %-10s |\n", "№", "X", "f(X)");
		System.out.println("--------------------------------");

		for (int i = 0; i < n; i++) {
			double x = a + i * step;
			double fx = _1SimpleCalculations.calculateFunction(x);
			System.out.printf("| %-2d | %-10.6f | %-10.6f |\n", i + 1, x, fx);
		}

		System.out.println("--------------------------------");
	}
}