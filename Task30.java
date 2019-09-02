package by.epam.les04.main;
import java.util.Scanner;
public class Task30 {
	//Написать программу, переводящую римские цифры в арабские.
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
        int[] numbers = { 1000, 500, 100, 50, 10, 5, 1 };
        String symbols = "MDCLXVI";
        
        System.out.print("Enter a roman numeral: ");
        final int MAX = 3999;
        Scanner keyb = new Scanner(System.in);
        String roman = keyb.next();
        keyb.close(); 

        roman = roman.toUpperCase();

        if (roman.matches(".*[0-9].*") || !roman.matches("[M|D|C|L|X|V|I]*")) {
            System.out.println("Impossible to convert. Wrong roman numeral");
        }

        int i = 0; 
        int current = 0; 
        int previous = 0; 
        int arabic = 0; 

        while (i < roman.length()) {

            char letter = roman.charAt(i); 
           
            switch (letter) {
            case ('I'):
                current = 1;
                break;
            case ('V'):
                current = 5;
                break;
            case ('X'):
                current = 10;
                break;
            case ('L'):
                current = 50;
                break;
            case ('C'):
                current = 100;
                break;
            case ('D'):
                current = 500;
                break;
            case ('M'):
                current = 1000;
                break;
            }


            if (current > previous) {
               
                arabic += current - (previous * 2);
            } else {
               
                arabic += current;
            }

            previous = current; 
            i += 1; 
        } 
        
        System.out.println("Arabic: " + arabic);
	}

}




