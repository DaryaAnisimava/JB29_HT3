package by.epam.les04.main;

public class Task15 {
	//Вычислить : 1+2+4+8+...+ 2 в 10 степени.
	public static void main(String[] args) {
		int i, a, s;
	
		
		a=1;
		s=1;
		
		for (i=1; i<=10; i++) {
			a=a*2;
			s=s+a;
			
		}
	
		
		System.out.print(s);
	}
}
