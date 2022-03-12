package by.epam.module1.branching;

public class Task5 {
	
	// Вычислить значение функции F(x) = x * x - 3 * x + 9, если x <= 3;
	// F(x) = 1 / (x * x * x + 6), если x > 3
	
	public static void main(String[] args) {
		
		double x;
		
		x = 4;
		
        if(x <= 3){
            System.out.print(Math.pow(x, 2) - 3 * x + 9); 
        } else {
        	System.out.print(1 / (Math.pow(x, 3) + 6));
        }
	}
}
