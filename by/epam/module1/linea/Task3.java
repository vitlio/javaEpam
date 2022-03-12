package by.epam.module1.linea;

import java.util.Scanner;

public class Task3 {

	/*
	 * Вычислить значение выражения по формуле (Math.sin(x) + Math.cos(y)) /
	 * (Math.cos(y) - Math.sin(x)) * Math.tan(x * y)
	 */

	public static void main(String[] args) {

		double x;
		double y;

		x = enterNum("x >> ");
		y = enterNum("y >> ");

		System.out.print((Math.sin(x) + Math.cos(y)) / (Math.cos(y) - Math.sin(x)) * Math.tan(x * y));

	}

	static double enterNum(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print(message);

		while (!sc.hasNextDouble()) {
			System.out.print(message);
			sc.next();
		}

		return sc.nextDouble();
	}
}
