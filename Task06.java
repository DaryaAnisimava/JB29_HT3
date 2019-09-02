package by.epam.les04.main;
import java.util.Scanner;
public class Task06 {
	//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s, n;
		s = 0;
		System.out.println("Введите целое положительное число");
		n = sc.nextInt();
		for (int i= 1; i<=n; i++ ) {
			s=s+i;
			
		}
		System.out.println("сумма=" + s);
	}
}
