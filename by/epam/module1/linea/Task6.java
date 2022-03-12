package by.epam.module1.linea;

import java.util.Scanner;

public class Task6 {

	/*
	 * Для данной области составить линейную программу, которая печатает true, если
	 * точка с координатами (х, у) принадлежит закрашенной области, и false в
	 * противном случае.
	 */

	public static void main(String[] args) {

		int x;
		int y;

		x = enterNum("x >> ");
		y = enterNum("y >> ");

		if ((x >= -4 && x <= 4) && (y <= 0 && y >= -3) || (x >= -2 && x <= 2) && (y >= 0 && y <= 4)) {
			System.out.print("true");
		}
		System.out.print("false");
	}

	static int enterNum(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}

		return sc.nextInt();
	}
}
