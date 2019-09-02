package by.epam.les04.main;

public class Task26 {
	//Вывести таблицу соответствий между символами и их численными обозначениями в памяти компьютер (Таблицу ASCII).
	public static void main(String[] args) {
		int x;
		int y =(int) (Math.pow(2, 16) - 1);
		char ch;
		for (x =0; x<= y; x++) {
			ch = (char)x;
			System.out.println(ch);
		}
	}
}
