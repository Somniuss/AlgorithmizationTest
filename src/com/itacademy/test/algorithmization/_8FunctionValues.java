package com.itacademy.test.algorithmization;

public class _8FunctionValues {

	public static void main(String[] args) {
		double startX = 0.1;
		double difference = 0.1;
		double limitX = 10.0;

		System.out.println("-------------------");
		System.out.println("|   x  |     y    |");
		System.out.println("-------------------");

		double x = startX;
		while (x <= limitX) {
			double y = calculateY(x);
			System.out.printf("| %.2f | %8.4f |%n", x, y);

			if (y <= 0) {
				System.out.println("-------------------");
				System.out.println("Значение функции прошло 0. Прекращение вычислений.");
				break;
			}

			x = x + difference;
		}
	}

	public static double calculateY(double x) {
		double y = Math.pow(x, 2) - Math.exp(2 * x) + 4;
		return y;
	}
}