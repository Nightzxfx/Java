package week5;
import java.util.ArrayList;

public class Player {
		
	private int Health;
	private String name;
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
		
	ArrayList<String> vocation= new ArrayList<String>();
	vocation.add("Paladin");
	vocation.add("Knight");
	vocation.add("Druid");
	vocation.add("Sorcare");
	
		
		Player Knight = new Player();
		
		Knight.setHealth(1000);
		
		Knight.setName("Paulo");
		
		System.out.println("Palyer: " + Knight.getName() + " Life " + Knight.getHealth() +" Vocation: " + vocation.get(1));
		
		
		
		Player Pally = new Player();
		
		Pally.setHealth(100);
		Pally.setName("Valadares");
		
		System.out.println("Player: " + Pally.getName() + " Life: " + Pally.getHealth() + " Vocation: " + vocation.get(0));
	}
}

