package polymorphism.overriding;

class Base {
	void display() {
		System.out.println("Base class display method.");
	}
}

class Derived extends Base {
	void display() {
		super.display();
		System.out.println("Derived class display method.");
	}

	void show() {
		System.out.println("Derived class show method.");
	}
}

public class BaseMain {
	public static void main(String[] args) {
		Derived d = new Derived();
		d.display();
		d.show();
	}

}
