package com.itacademy.test.algorithmization;

public class _7FunctionTable2D {

	public static void main(String[] args) {

		int n = 5;
		double x1 = 1.0;
		double hx = 0.5;

		int m = 4;
		double z1 = 2.0;
		double hz = 0.5;

		System.out.println("Таблица значений функции y(x, z):");
		System.out.println("----------------------------");
		System.out.println("|   X   |   Z   |     Y    |");
		System.out.println("----------------------------");

		for (int i = 0; i < n; i++) {
			double x = x1 + i * hx;

			for (int j = 0; j < m; j++) {
				double z = z1 + j * hz;
				double y = calculateY(x, z);

				System.out.printf("| %5.2f | %5.2f | %8.4f |%n", x, z, y);
			}
		}

		System.out.println("----------------------------");
	}

	public static double calculateY(double x, double z) {
		double result = Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) * Math.log(z)
				+ Math.abs(Math.log(z)) / Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2);
		return result;
	}
}