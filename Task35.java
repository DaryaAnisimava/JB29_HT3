package by.epam.les04.main;
import java.util.Scanner;
public class Task35 {
	//Найдите количество четных цифр данного натурального числа.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<");
		int a = sc.nextInt();
	
		int k = 0;
	
		while (a > 0) {
			if ((a % 10) % 2 == 0) {
				k = k + 1;
				
				}
			a = a/10;
			//System.out.println(k);
		}
		System.out.println(k);
	}
	
	
}


