package scam;
import java.util.Scanner;
import scam.even;

public class main {
	
		public static int number;
		
		public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Say any Number");
		
		
		int number = input.nextInt();

		even objt = new even();
		objt.func(number);
		
		
}
}


/* add another class called even */

package scam;

import  scam.main;

public class even {
	
		public static void func(int n)
		{
		 if ((n % 2) == 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		 
		}
	
	
}
