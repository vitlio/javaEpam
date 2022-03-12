package by.epam.module1.loop;

public class Task2 {
	
	// Вычислить значение функции на отрезке [a, b] с шагом h: 
	// y = x, x > 2; y = -x, x <= 2
	
	public static void main(String[] args) {
		double a;
		double b;
		double h;
        double sum = 0;
        
		a = 1;
		b = 3;
		h = 0.5;
		
        for(double i = a; i <= b; i += h){
            if(i > 2){
                sum += i;
            } else {
                sum -= i;
            }
        }
        System.out.print(sum);
	}
}
