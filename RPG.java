import java.util.ArrayList;
import java.util.Scanner;


public class game1 {

	private int Health;
	private String name;
	public int playerOld;
	//private String vocation;


	public void setHealth(int h) {
		Health = h;
	}

	public void setName(String n) {
		name = n;

	}

	public int getHealth() {
		return Health;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		//input system
		Scanner inputString = new Scanner(System.in);
		//input saving Int
		Scanner inputInt = new Scanner(System.in);
		
		
		//greeting
		System.out.println("Hello to the Killing the Demon!" + '\n' + "What is your name hero?");
		
		String playerName = inputString.nextLine();
		
		//confirming the age
		
		System.out.println("Hail " + playerName + " How old are you?" );
		
		
		int playerOld = inputInt.nextInt();
		
		
		  if (playerOld < 15) {
			System.out.println("Sorry you are too young for this game");
		} else {
			System.out.println("You are mature enought " + playerName + ", let`s keeping moving, whitch vocation you would like to pick? /n We have, the Strenght 'Knight', The Skilled 'Pally', the Smart 'Druid' and the Evil 'Sorcere'" );
			
		}
		  
		  
		//Choosing a vocation
			//vocation options
			ArrayList<String> vocation= new ArrayList<String>();
			vocation.add("Paladin");
			vocation.add("Knight");
			vocation.add("Druid");
			vocation.add("Sorcare");

			int life[] = new int[4];
			life[0] = 200;
			life[1] = 350;
			life[2] = 100;
			life[3] = 100;
		  
		String playerVocation = inputString.next();
		
		System.out.println("Humm you might know what you are doing.. the " + playerVocation + " requires some RPG skills");
		
		//instructions
		System.out.println("that is how htis game woks, you will type the direction by 'forward', 'left', 'right' any questions type 'help'");
		
		// History
		System.out.println("There is a big price for who finds the princess neckless, you end up in the forbidden Jungle, you hear some screaming but you are not sure where they came from, you have 2 paths, left or right? ");
		
		//Player move
		String playerMove = inputString.next();
		
		if (playerMove == "left") {
			System.out.println("Outch you steped on the trap and lost 10hp");
		} else if (playerMove == "right") {
			System.out.println("You see a house but looks like nobody is there, and now keeping moving forward or investigate?");
		} else {
			System.out.println("I thought that you were mature to understand some rules, apparentely you are not, you could have asked for 'help'! BYE");
		}
	
		
		
		
		

	

		
	



		game1 Knight = new game1();

		Knight.setHealth(1000);

		Knight.setName("Paulo");

		System.out.println("Palyer: " + Knight.getName() + " Life " + Knight.getHealth() +" Vocation: " + vocation.get(1));



		game1 Pally = new game1();

		Pally.setHealth(100);
		Pally.setName("Valadares");

		System.out.println("Player: " + Pally.getName() + " Life: " + Pally.getHealth() + " Vocation: " + vocation.get(0));
	}
}



