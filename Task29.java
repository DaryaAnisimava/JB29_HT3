package by.epam.les04.main;

public class Task29 {
	//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
	public static void main(String[] args) {
		int a, b, c;
		int d;
		a = 89513321;
		b = 8903;
	
		
		while (a > 0) {
			d = a % 10;
			a = a/10;
			c = b;
			
			while (c > 0) {
				if (c % 10 == d) {
					System.out.println(d + " ");
					break;
				}
			c = c/ 10;	
			}
			
			}
		}
		
	
		
	}



