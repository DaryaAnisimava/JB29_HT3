package by.epam.les04.main;
import java.util.Scanner;
public class Task40 {
	//Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.
	public static void main(String[] args) {
		int n, i, m;
		boolean f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите N");
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			m = i;
			f = true;
			
			while ((m > 0)&& (f)) {
				if ((m % 10 == 0) || ((i % (m % 10))!=0)) {
					f = false;
				}else {
					m = m /10;
				}
				if (f) {
					System.out.println(i);
			}
		
	}

}

}
}


  
     
      


