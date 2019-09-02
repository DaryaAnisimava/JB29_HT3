package by.epam.les04.main;

public class Task22 {
	//Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
	//представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
	//значения функции:F(x)= sin^2(x)
	public static void main(String[] args) {
		int a, b, h;
		double x, y;
		a =-5;
		b = 5;
		h = 1;
		for ( x = a; x <= b; x=x +h) {
			double j = Math.toRadians(x);
			y = Math.asin(j) * Math.asin(j);
			System.out.print(" x = " + x + "| ");
			System.out.println("y = " + y);

		}
	}
}
