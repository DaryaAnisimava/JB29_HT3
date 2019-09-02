package by.epam.les04.main;
import java.util.Scanner;
public class Task38 {
	//Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию.
	//Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.
	public static void main(String[] args) {
		int a, z, sh, aa;
		byte m, m1, i;
		int [] c = new int[8];
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число, в котором не менне 3х цифр");
		a = sc.nextInt();
		s = Integer.toString (a);
		m = (byte)s.length();
		//System.out.println(m);
		m1 = m;
		for (i =1; i<=m; i++) {
		aa = Integer.parseInt(s);
		
		//System.out.println(aa);
		}
		z = c[2]-c[1];
		sh =1;
		//System.out.println("z=" + z);
		
		for (i=m; i>=2; i --) {
			if (c[i] - c[i-1]== z) {
				sh = sh  + 1;
			}
		}
		//System.out.println(sh);
		if (sh == m1) {
			System.out.println("yes");
			
		}else {
			System.out.println("No");
		}
		
		
		}
		
	

	}




