package by.epam.les04.main;

public class Task23 {
	//Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
	//представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
	//значения функции:F(x)= ctg(x/3) + 1/2 * sin(x)
	public static void main(String[] args) {
		int a, b;
		double x, y;
		a =-2;
		b = 5;
		double h = 0.5;
		
		for ( x = a; x <= b; x = x + h) {
			double j = Math.toRadians(x);
			y = 1/Math.atan(j/3)- 0.5 * Math.asin(j);
			System.out.print(" x = " + x + "| ");
			System.out.println("y = " + y);

		}
	}
}
