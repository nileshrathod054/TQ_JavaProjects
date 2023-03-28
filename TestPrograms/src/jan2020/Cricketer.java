package jan2020;

import java.util.Scanner;

public class Cricketer {
	private int playerid;
	private String name;
	private Boolean isBaller;
	private float strikerate;
	private int runs;

	public Cricketer() {

	}

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsBaller() {
		return isBaller;
	}

	public void setIsBaller(Boolean isBaller) {
		this.isBaller = isBaller;
	}

	public float getStrikerate() {
		return strikerate;
	}

	public void setStrikerate(float strikerate) {
		this.strikerate = strikerate;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	@Override
	public String toString() {
		return String.format("Cricketer [playerid=%s, name=%s, isBaller=%s, strikerate=%s, runs=%s]", playerid, name,
				isBaller, strikerate, runs);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cricketer c = new Cricketer();

		System.out.println("Enter player id");
		int id = sc.nextInt();
		System.out.println("Enter player name");
		String p_name = sc.next();
		
		System.out.println("Enter type of of player");
		boolean baller = sc.nextBoolean();
		sc.next();
		System.out.println("Enter strike rate");
		float Strikerate = sc.nextFloat();

		c.setPlayerid(id);
		c.setName(p_name);
		c.setIsBaller(baller);
		c.setStrikerate(Strikerate);

		System.out.println("Player Id= " + c.getPlayerid());
		System.out.println("Player name= " + c.getName());
		System.out.println("Player type= " + c.getIsBaller());
		System.out.println("Strike rate= " + c.getStrikerate());
	}
}
