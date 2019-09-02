package by.epam.les04.main;

public class Task14 {
	//Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
	public static void main(String[] args) {
		double i, n;
		i=1;
		n = 10;
		double s=0;
		
		//while (i<=n) {
			//s = s+1/i;
			//i =i+1;
			//System.out.print(s+"+ ");
		//}
		

				for (i=1; i<=n; i++){
					
					s= s +1/i;
					
					
			}
				System.out.print("s=" +s);
				
		}
	
	
		}




