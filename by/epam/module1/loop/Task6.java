package by.epam.module1.loop;

import java.util.Scanner;

public class Task6 {

	// Вывести на экран соответствия между символами и их численными обозначениями в
	// памяти компьютера.

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print(">>");

		String str = sc.next();

		for (char ch : str.toCharArray()) {
			System.out.println(ch + " : " + (int) ch);
		}
	}
}
