package assignment_7thJan;

class IPLTeam {
	void play() {
		System.out.println("IPL Team");
	}
}

class CSK extends IPLTeam {
	void play() {
		super.play();
		System.out.println("CSK team is playing ");
	}
}

class RCB extends IPLTeam {
	void play() {
		super.play();
		System.out.println("RCB team is playing ");
	}
}

public class IPLTeamMain {
	public static void main(String[] args) {
		CSK csk = new CSK();
		csk.play();
		RCB rcb = new RCB();
		rcb.play();
	}

}
