package by.epam.les04.main;

public class Task19 {
	//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
	public static void main(String[] args) {
	double a,e,t1,t2, s;
	  int n;
	  
	e = 0.001;
	n = 10;
	t1=2;
	t2=3;
	s = 0;
	
	for (int i=1; i<= n; i++) {
		a = 1/Math.pow(t1,i)+1/Math.pow(t2, i);
		if (Math.abs(a)>=e) {
			s = s + a;
		}
	}
	
	
	System.out.print(s);
	
}
}