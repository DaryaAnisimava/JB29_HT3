package by.epam.les04.main;

public class Task10 {
	//Составить программу нахождения произведения квадратов первых двухсот чисел.
		public static void main(String[] args) {
		
		int i;
		double s=1;
		
	
		for (i = 1; i<=200; i++) {
			s= s *i*i;
			}
		
		System.out.println("s="+s);
	}


}
