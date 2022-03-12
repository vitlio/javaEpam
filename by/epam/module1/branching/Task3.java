package by.epam.module1.branching;

public class Task3 {
	// Даны три точки А(х1, у1), В(х2, у2) и С(х3, у3). Определить, будут ли они
	// расположены на одной прямой.

	public static void main(String[] args) {
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;

		x1 = 0;
		y1 = 0;
		x2 = 1;
		y2 = 1;
		x3 = 2;
		y3 = 3;

		System.out.print((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1) ? "On the same line" : "Not on the same line");
	}
}
