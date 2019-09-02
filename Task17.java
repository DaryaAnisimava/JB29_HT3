package by.epam.les04.main;

public class Task17 {
	//Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
	public static void main(String[] args) {
		double a, p;
		int n, i;
		a=1.55;
		n=2;
		p=1;
		for (i=0; i<=n-1; i++) {
			p = p * (a+i);
			
		}
			System.out.print(p);
	}

}
