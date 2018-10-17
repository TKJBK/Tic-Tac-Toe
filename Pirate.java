package pirateworld;

public class Pirate {
	private String name;
	private int limbsRemaining;
	private boolean hasParrot;
	
	public Pirate(String name) {
		this.name = name;
		limbsRemaining = 4;
		hasParrot = false;
	}
	
	public String getName() {
		return name;
	}
	
	public int limbsRemaining() {
		return limbsRemaining;
	}
	
	public boolean hasParrot() {
		return hasParrot;
	}
	
	public void loseALimb() {
		limbsRemaining --;
		System.out.printf("AAAAARGH! %s lost a limb!\n", name);
	}
}
