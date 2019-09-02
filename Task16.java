package by.epam.les04.main;

public class Task16 {
	public static void main(String[] args) {
		//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
		double g, h;
		int i;
		g=3;
		h=3;
		for (i=2; i<=10; i++) {
			g = g + i + 1;
			h = g * h;
			
		}
			
		System.out.println(h);
	}
}


