package by.epam.les04.main;

public class Task07 {
	//Вычислить значения функции на отрезке [а,b] c шагом h:
	public static void main(String[] args) {
		double a = -10;
		double b =1;
		double y;
		double h =1;
		
	
		for (double  x = a; x<=b; x=x+h) {
			if (x>2) {
				y=x;
				System.out.println("x=" + x+ " "+ "y=" +y);
			} else {
				y =-x;
				System.out.println("x=" + x+ " "+ "y=" +y);
			}
		}
	}

}
