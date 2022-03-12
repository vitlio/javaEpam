package by.epam.module1.loop;

import java.util.Scanner;

public class Task7 {

	/*
	 * Для каждого натурального числа в промежутке от m до n вывести все делители,
	 * кроме единицы и самого числа. m и n вводятся с клавиатуры
	 */

	public static void main(String[] args) {

		int m;
		int n;
		int i;

		m = enterNum(">> ");
		n = enterNum(">> ");
		i = m;

		do {
			System.out.print("Делители " + i + " : ");

			for (int j = 1; j <= i; j++) {
				if (j != 1 && j != i && i % j == 0) {
					System.out.print(j + " ");
				}
			}

			i++;

			System.out.print("\n");
		} while (i <= n);

	}

	static int enterNum(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print(message);

		while (!sc.hasNextInt()) {
			System.out.print(message);
			sc.next();
		}

		return sc.nextInt();
	}
}
