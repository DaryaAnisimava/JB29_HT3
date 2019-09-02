package by.epam.les04.main;

public class Task34 {
	//Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
	public static void main(String[] args) {
		int a, b, c, d, k, i;
		for (k = 1000; k < 10000; k++) {
			a = (k % 100) % 10;
			b = (k % 100) / 10;
			c = (k % 1000)/100;
			d = k/1000;
			i = a + b + c + d;
			if (i == 15) {
				System.out.println(k);
			}
		}
	}

}
