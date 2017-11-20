main.java

import java.util.Scanner;


public class main {

	String name;
	double price;
	double tip;
	String survey;
	String itemName;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello, welcome to your automated Tip calcular. First I will need your name.");
		
		String name = input.nextLine();
		
		System.out.println(Nice to meet you " + name + " my name is Aladdin!.Aladdin Lets start, to help you first I need to know the order name and then the price.");
				System.out.println("What did you order?");
		
		String itemName = input.nextLine();
		
		System.out.println("How much was that?");
		
		double price = input.nextDouble();
		
		System.out.println("How much was that?");
		
		
	}
}
