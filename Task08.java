package by.epam.les04.main;

public class Task08 {
	//Вычислить значения функции на отрезке [а,b] c шагом h:
		public static void main(String[] args) {
			double a = -10;
			double b =1;
			double y;
			double h =1;
			double c =0.5;
		
			for (double  x = a; x<=b; x=x+h) {
				if (x==15) {
					y=(x+ c)*2;
					System.out.println("x=" + x+ " "+ "y=" +y);
				} else {
					y =(x-c)+6;
					System.out.println("x=" + x+ " "+ "y=" +y);
				}
			}
		}
}
