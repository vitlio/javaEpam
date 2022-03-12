package by.epam.module1.linea;

import java.util.Scanner;

public class Task2 {

	/*
	 * Вычислить значение выражения по формуле ((b + Math.sqrt(b * b + 4 * a * c)) /
	 * 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2)
	 */

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		a = enterNum("a >> ");
		b = enterNum("b >> ");
		c = enterNum("c >> ");

		System.out.print(((b + Math.sqrt(b * b + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
	}

	static double enterNum(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print(message);

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print(message);
		}

		return sc.nextDouble();
	}
}
