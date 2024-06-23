package com.itacademy.test.algorithmization;

public class _5FunctionTable {

	public static void main(String[] args) {
		double A = 1;
		double x1 = -2 * A;
		double dX = A / 5;
		int N = 20;

		printFunctionTable(x1, dX, N, A);
	}

	public static double calculateY(double x, double A) {
		if (x <= 0) {
			return (A / 2) * (Math.exp(x / A) + Math.exp(-x / A));
		} else {
			return (4 * Math.pow(A, 3)) / (Math.pow(x, 2) + 4 * Math.pow(A, 2));
		}
	}

	public static void printFunctionTable(double x1, double dX, int N, double A) {
		System.out.println("---------------------");
		System.out.printf("| %-7s | %-7s |%n", "X", "Y");
		System.out.println("---------------------");

		for (int i = 0; i < N; i++) {
			double x = x1 + i * dX;
			double y = calculateY(x, A);
			System.out.printf("| %-7.4f | %-7.4f |%n", x, y);
		}

		System.out.println("---------------------");
	}
}