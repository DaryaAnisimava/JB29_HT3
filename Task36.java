package by.epam.les04.main;

public class Task36 {
	//Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое делится на
	//их произведение. Найти эти числа.
	public static void main(String[] args) {
		int i,j;
		
		for (i=10; i<=99; i++) {
		for (j=1; j<=99; j++)  {
		if ((i*100+j) %(i*j) == 0) { 
			System.out.println(i + " " + j);
			}
		}
		}
		
	}
}
