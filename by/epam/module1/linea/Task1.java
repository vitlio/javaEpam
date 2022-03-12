package by.epam.module1.linea;

import java.util.Scanner;

public class Task1 {

	// Найдите значение функции z = ((a - 3) * b / 2) + c

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		a = enterNum();
		b = enterNum();
		c = enterNum();

		System.out.print("z = " + (((a - 3) * b / 2) + c));
	}

	static double enterNum() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print(">>");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print(">>");
		}

		return sc.nextDouble();
	}
}
