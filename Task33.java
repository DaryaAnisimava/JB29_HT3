package by.epam.les04.main;
import java.util.Scanner;
public class Task33 {
	//Найдите наибольшую цифру данного натурального числа.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<");
		int n = sc.nextInt();
		int max;
		max = 0;
		while (n > 0) {
	
		  int i = n % 10;
          n = n/10;
		 
		  if(i>max){
			  max=i;
		  }
		}
		System.out.println("Наибольшая цифра = " + max);
	
		
	}
}
