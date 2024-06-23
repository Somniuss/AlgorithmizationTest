package com.itacademy.test.algorithmization;

public class _6FunctionTabulation {
	public static void main(String[] args) {

		int a = 3 * 1000;
		int b = 6 * 10000;
		int m = 4;

		double t1_1 = Math.sqrt(a + b + m);
		double t2_1 = m * Math.sqrt(a + b);

		double t1_2 = Math.sqrt(a * b * m);
		double t2_2 = m * Math.sqrt(a * b);

		int countInRange = 0;
		int countNotInRange = 0;

		System.out.println("Значения f(K), удовлетворяющие условию:");
		for (int k = -29; k < 60; k++) {
			int fK = calculateFunction(k);
			if ((fK >= t1_1 && fK <= t2_1) || (fK >= t1_2 && fK <= t2_2)) {
				System.out.println("f(" + k + ") = " + fK);
				countInRange = countInRange + 1;
			} else {
				countNotInRange = countNotInRange + 1;
			}
		}

		System.out.println("Количество значений f(K), не удовлетворяющих условию: " + countNotInRange);
	}

	public static int calculateFunction(int k) {
		return k * k * k - 25 * k * k + 50 * k + 1000;
	}
}
