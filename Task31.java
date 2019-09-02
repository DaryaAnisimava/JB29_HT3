package by.epam.les04.main;
import java.util.Scanner;
import java.util.Random;
public class Task31 {
	//Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их угадать.
	//Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа, а также
	//ошибочные числа пользователя.
	public static void main(String[] args) {
		
	   int [] a = new int[5];
	   int [] b = new int[5];
	   
	   int i, n, j;
	 
	   
	   n = 4;
	   
	   for (i = 0; i <= n; i++) {
		   Random random = new Random();
		   a[i] = random.nextInt(15)+1;
		  
		   
	   }
	   System.out.println("Угадайте 5 чисел в диапазоне от 1 до 15");
	 
	   
	   for (i=0; i<=n; i++) {
		   Scanner scanner = new Scanner(System.in);
		   b[i] = scanner.nextInt();
		   }
		   
		  for (i =0; i <= n; i++) {
			  for (j = 0; j<= n; j++) {
				   if (a[i] == b[j]) {
					   System.out.println("Вы угадали: " + a[i]);
				  }
				  
			   }
		   }
			   
		 
	}
}
		  
		   
		   
	   
	
	
	
	
		
		
		
		
	




