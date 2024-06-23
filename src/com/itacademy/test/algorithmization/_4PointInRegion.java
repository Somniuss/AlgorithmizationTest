package com.itacademy.test.algorithmization;

public class _4PointInRegion {

	static class Point {
		private double x;
		private double y;

		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public double getX() {
			return x;
		}

		public double getY() {
			return y;
		}
	}

	static boolean isInRegion(double x, double y) {

		boolean inFirstRectangle = (x >= 0 && x <= 2 && y >= 0 && y <= 1);
		boolean inSecondRectangle = (x >= -2 && x <= 0 && y >= 0 && y <= 2);
		boolean inFourthRectangle = (x >= 0 && x <= 2 && y >= -1 && y <= 0);

		return inFirstRectangle || inSecondRectangle || inFourthRectangle;
	}

	static int countPointsInRegion(Point[] points) {
		int count = 0;
		for (Point point : points) {
			if (isInRegion(point.getX(), point.getY())) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int n = 7;

		Point[] points = new Point[n];
		points[0] = new Point(1.5, 0.5);
		points[1] = new Point(-1, 1.5);
		points[2] = new Point(0, -0.5);
		points[3] = new Point(2.5, 1);
		points[4] = new Point(0, 0);
		points[5] = new Point(-2, 2);
		points[6] = new Point(1, -0.5);

		int countInRegion = countPointsInRegion(points);
		System.out.println("Количество точек, попавших в область: " + countInRegion);
	}
}
