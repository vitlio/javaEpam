package by.epam.module1.branching;

import java.util.Scanner;

public class Task1 {

	/*
	 * Даны два угла треугольника в градусах. Определить существует ли такой
	 * треугольник, и если да, то будет ли он прямоугольным.
	 */

	public static void main(String[] args) {

		double a;
		double b;
		String str;

		a = enterNum(">> ");
		b = enterNum(">> ");

		if (b < 180 - a) {
			if (a == 90 || b == 90) {
				str = "Triangle exist and it`s rectangular";
			} else {
				str = "Triangle exist";
			}
		} else {
			str = "Not exist";
		}

		System.out.print(str);

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
