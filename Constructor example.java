package week5;

public class Player {
		
	private int Health;

	
	
	
	public void setHealth(int h) {
		Health = h;
	}
	
	public int getHealth() {
		return Health;
	}
	
	
	public static void main(String[] args) {
		
		Player Knight = new Player();
		
		Knight.setHealth(1000);
		
		System.out.println(Knight.getHealth());
		
		Player Pally = new Player();
		
		Pally.setHealth(100);
		
		System.out.println(Pally.getHealth());
	}
}
