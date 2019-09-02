package by.epam.les04.main;
import java.util.Scanner;
public class Task24 {
	//Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать его в
	//другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным числом.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите натуральное число");
		int n = sc.nextInt();
		int s = 0;
		int m = 0;
		while (n>0) {
			int a = n%10;
			if (a%2==0) {
			s = s  + a;	
			}
			n = n/10;
			m = m * 10 + a;
		}
		System.out.println ("сумма четных цифр =" + s);
		System.out.println("число с цифрами в обратном порядке=" + m);
	}

}
