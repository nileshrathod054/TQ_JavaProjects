package abstraction;

class Parent {
	final void display() {
		System.out.println("Final display method of Parent class");
	}
}

public class Child extends Parent {
//	void display() { // We can't override the final method of parent class
//		System.out.println("display method of the Child class");
//	}
	void show() {
		System.out.println("show method of child class");
	}

	public static void main(String[] args) {
//		Parent p = new Parent();
//		p.display();
		Child c = new Child();
		c.display();
		c.show();
	}
}
