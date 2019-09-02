package by.epam.les04.main;

public class Task18 {
	//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
	public static void main(String[] args) {
		int n, i;
		double a, s, e;
		e = 0.001;
		n=5;
		s=0;
		
		
		for (i=1; i<=n; i++) {
			
			a = (Math.pow(-1,i-1))/i;
			if (Math.abs(a)>=e) {
				s=s + a;
		}
		}
		System.out.print("s="+s);
	}
		

}



