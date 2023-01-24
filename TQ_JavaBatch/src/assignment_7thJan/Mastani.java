package assignment_7thJan;

interface IceCream {
	void eat();
}

interface Juice {
	void drink();
}

public class Mastani implements IceCream, Juice {

	public void eat() {
		System.out.println("Eat the icecream");

	}

	public void drink() {

		System.out.println("Drink the juice");
	}

	public static void main(String[] args) {
		Mastani m = new Mastani();
		m.eat();
		m.drink();
	}

}
