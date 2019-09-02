package by.epam.les04.main;

public class Task39 {
	//В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то получили
	//исходное число. Найти это число.
	public static void main(String[] args) {
		int a, i;
		for (i = 100; i<=999; i++) {
			a = i % 100;
			if (7 * a == i) {
				System.out.println(i);
			}
		}
	}
	

}
