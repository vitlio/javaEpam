package by.epam.module1.loop;

import java.util.Scanner;

public class Task1 {

	// Напишите программу, в которой пользователь вводит целое положительное число.
	// А программа суммирует все числа от 1 до введенного пользователем числа.

	public static void main(String[] args) {
		int num;
		int sum;

		num = enterNum();
		sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		}

		System.out.print(sum);
	}

	static int enterNum() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print(">> ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(">> ");
		}

		return sc.nextInt();
	}
}
