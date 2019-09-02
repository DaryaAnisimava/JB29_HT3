package by.epam.les04.main;

public class Task09 {
	//Найти сумму квадратов первых ста чисел.
	public static void main(String[] args) {
		
		int i;
		int s=0;
		
	
		for (i = 1; i<=100; i++) {
			s= s+i*i;
			
	
		}
		System.out.println("s="+s);
	}

}
