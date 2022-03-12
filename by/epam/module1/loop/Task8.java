package by.epam.module1.loop;

public class Task8 {

	// Даны два числа. Определить цифры, входящие в запись как первого так и второго
	// числа.

	public static void main(String[] args) {
		int one;
		int two;

		one = 123456789;
		two = 5856;

		for (char num : Integer.toString(one).toCharArray()) {
			System.out.print(num + " ");
		}

		for (char num : Integer.toString(two).toCharArray()) {
			System.out.print(num + " ");
		}
	}
}
