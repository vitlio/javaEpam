package by.epam.module1.linea;

public class Task4 {

	// Дано действительное число R вида nnn.ddd. Поменять местами дробную и целые
	// части и вывести полученные
	// значения.

	public static void main(String[] args) {
		double r;
		int n;
		int d;

		r = 123.456;
		n = (int) r;
		d = (int) ((r - (double) n) * 1000);

		System.out.print((double) d + ((double) n / 1000));

	}

}
