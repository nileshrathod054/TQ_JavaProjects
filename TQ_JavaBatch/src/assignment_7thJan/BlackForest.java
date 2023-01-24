package assignment_7thJan;

interface Cake {
	void bake();
}

class Strawberry implements Cake {

	public void bake() {
		System.out.println("Strawberry Cake.");
	}

}

public class BlackForest implements Cake {
	public void bake() {
		System.out.println("BlackForest Cake");
	}

	public static void main(String[] args) {
		Strawberry s = new Strawberry();
		s.bake();
		BlackForest b = new BlackForest();
		b.bake();
	}
}
