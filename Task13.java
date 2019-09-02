package by.epam.les04.main;

public class Task13 {
	//Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.
	public static void main(String[] args) {
		double a = -5;
		double b = 5;
		double y;
		double h = 0.5;
		
	
		for (double  x = a; x<=b; x=x+h) {
			y = 5 -x * x/ 2;
			System.out.println(y);
		}
	}

}
