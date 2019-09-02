package by.epam.les04.main;
import java.util.Scanner;

public class Task28 {
	public static void main(String[] args) {
		//Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
		//результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а также
		//на ввод Y=0 при делении. Организовать возможность многократных вычислений без перезагрузки программа
		//(т.е. построить цикл). В качестве символа прекращения вычислений принять ‘0’.
		 
		Scanner in = new Scanner(System.in);
		
		
	        int exit;
	       
	        
	        do {
	            System.out.println("Введите X и Y: ");
	            
	            int x = in.nextInt();
	            int y = in.nextInt();
	            
	            in.nextLine();
	            System.out.print("Введите знак: ");
	            String znak = in.nextLine();
	            
	            switch (znak) {
	                case "+":   
	                	int z = x + y;
	                    System.out.println(z);
	                    break;
	                    
	                case "-":                   
	                	int z1 = x - y;
	                    System.out.println(z1);
	                    break;
	                    
	                case "/":                   
	                    if (y == 0) {
	                        System.out.println("На 0 делить нельзя");
	                    }
	                    else {
	                    	int z2 = x / y;
		                    System.out.println(z2);
	                    }
	                    
	                    break;
	                
	                case "*":                   
	                	int z3 = x * y;
	                    System.out.println(z3);
	                    break;
	                
	                case "0":
	                    System.out.println("Завершение работы.");
	                    
	                   
	                    
	                    break;
	                    
	                default:
	                    System.out.println("ОШИБКА: Неверный знак!");
	                    break;
	            }       
	            
	          
	           System.out.println("Exit? (0/1)");
               exit = in.nextInt();
                if (exit == 0) {
                			
                		System.out.println("Завершение работы.");
                		
                		break;
	               }
                if (exit == 1) {
        			
        		
        		
        		continue;}
	        } while (exit!=0); 
	        
	    }    
	    
	    
	    }
	