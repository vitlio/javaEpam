package by.epam.module1.branching;

public class Task2 {

	// Найти max{min(a, b), min(c, d)}

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int min1;
		int min2;

		a = 90;
		b = 79;
		c = 80;
		d = 44;

		min1 = a > b ? b : a;
		min2 = c > d ? d : c;

		System.out.print(min1 > min2 ? min1 : min2);
	}
}
