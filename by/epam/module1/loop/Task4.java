package by.epam.module1.loop;

public class Task4 {

	// Составить программу нахождения произведения квадратов первых двухсот чисел.

	public static void main(String[] args) {

		int i;
		int multi;

		i = 1;
		multi = 1;

		while (i <= 200) {
			if (multi > multi * i * i) {
				System.out.println("Переполнение на шаге " + i);
				break;
			} else {
				multi *= i * i;
				i++;
			}
		}

		System.out.println(multi);
	}
}
