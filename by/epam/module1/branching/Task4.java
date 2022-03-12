package by.epam.module1.branching;

public class Task4 {

	// Заданы размеры А и В прямоугольного отверстия и размеры х, у, z кирпича.
	// Определить пройдет ли кирпич через отверстие.

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int x = 2;
		int y = 5;
		int z = 6;

		if (a >= x && b >= y || b >= z) {
			System.out.print("true");
		} else if (a >= y && b >= x || b >= z) {
			System.out.print("true");
		} else if (a >= z && b >= x || b >= z) {
			System.out.print("true");
		} else if (b >= x && a >= y || a >= z) {
			System.out.print("true");
		} else if (b >= y && a >= x || a >= z) {
			System.out.print("true");
		} else if (b >= z && a >= x || a >= y) {
			System.out.print("true");
		} else {
			System.out.print("false");
		}
	}
}
