package by.epam.les04.main;

public class Task20 {
	//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
		public static void main(String[] args) {
		double a, b, c, e, s;
		  int n;
		  
		e = 0.01;
		n = 2;
		
		s = 0;
	
		a =1;
		b= 1;
		c =1;
		for (int i=1; i<= n; i++) {
			
			a= (3 * i + 1);
			b = (3* i - 2);
			c = 1/a/b;
			
		
			if (Math.abs(c)>=e) {
				s = s + c;
		}
		}
		//while (Math.abs(an)>=e) {
		//	s = s + an;
		//	System.out.print(an);
		//	n = n + 1;
		//	an = 1/((3 * n -2) * (3 *n + 1));
		//	System.out.print(an);
		//}
	
		System.out.println("s=" + s);
	}

}

