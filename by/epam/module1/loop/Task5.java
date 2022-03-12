package by.epam.module1.loop;

public class Task5 {

	// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
	// модуль которых больше или равен заданному числу е.
	// Общий член ряда равен: a(n) = 1 / Math.pow(2, n) + 1 / Math.pow(3, n)

	public static void main(String[] args) {
		int n;
		double e;
		double sum;

		n = 5;
		e = 0.015;
		sum = 0;

		for (int i = 0; i <= n; i++) {
			if (e < Math.abs(1 / Math.pow(2, n) + 1 / Math.pow(3, n))) {
				sum += Math.abs(1 / Math.pow(2, n) + 1 / Math.pow(3, n));
			}
		}

		System.out.print(sum);

	}

}
