package by.epam.les04.main;

public class Task11 {
	//Составить программу нахождения разности кубов первых двухсот чисел
	public static void main(String[] args) {
		
		int i;
		double s=0;
		int a = 2;
		
		int b = a + 199;
		int c = a + 1;
	
		for (i = c; i<=b; i++) {
			s= s + Math.pow(i, 3);
			}
		double r = a -s;
		System.out.println("r="+r);
	}
}
