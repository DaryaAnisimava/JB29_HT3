package by.epam.les04.main;
import java.util.Scanner;
public class Task27 {
	//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n, x;
		
		System.out.println("Введите m");
		m = sc.nextInt();
		System.out.println("Введите n");
		n = sc.nextInt();
		for (x = m; x <= n; x++) {
			System.out.println("x = " + x);
			for (int i=2; i< m; i++ ) {
				if ( x % i == 0)
				System.out.println("del=" + i);
			}
		} 
	}
}
