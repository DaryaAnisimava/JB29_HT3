package by.epam.les04.main;
import java.util.Scanner;
public class Task32 {
	/* 
	 * Проверить введенную пользователем строку на наличие недопустимых символов. В качестве первого
	символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть буквами, цифрами
	и знаком подчеркивания.
	*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите строку");
		String str = scanner.nextLine();
		char c = str.charAt(0);
		if (((c >= 'a')&&(c <= 'z')) || ((c >= 'A')&&(c <= 'Z')) || (c == '_')) {
			if (str.matches("[a-zA-Z0-9_]+")) {
				 System.out.println("Все символы допустимы");
			 }else {
				 System.out.println("В строке есть недопустимые символы");
			 }
			
		}else {
			System.out.println("В строке есть недопустимые символы");
		}
	
	
		     
		   }
}
