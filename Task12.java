package by.epam.les04.main;

public class Task12 {
	//Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу нахождения произведения первых 10 членов этой последовательности.
	public static void main(String[] args) {
		int a, i, n;
		a = 1;
		n = 10;
		float p =1;
				for (i=1; i<=n; i++) {
					System.out.print(a + " ");
					p = p * a;
					a= 6 + a;
					
				
			}
				System.out.println("p =" + p);
		}
	
}
