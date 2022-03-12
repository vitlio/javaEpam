package by.epam.module1.linea;

import java.util.Scanner;

public class Task5 {

	/*
	 * Дано натуральное число Т, которое представляет длительность прошедшего
	 * времени в секундах. Вывести данное значение длительности в часах, минутах и
	 * секундах в формате ННч ММмин SSс.
	 */

	public static void main(String[] args) {

		int a;
		int hh;
		int mm;
		int ss;

		a = enterNum("Введите число: ");
		hh = a / 3600;
		mm = a % 3600 / 60;
		ss = (a % (3600)) % 60;

		System.out.print(hh + "ч " + mm + "мин " + ss + "c");
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
