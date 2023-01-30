package exception;

/*If a superclass method does not throw any exception 
 * then subclass method can throw only unchecked exception */
class Parent {
	void show() {
		System.out.println("Parent class show method");
	}
}

class Child extends Parent {
	void show() throws ArithmeticException {
		System.out.println("Child class show method ");
	}

	void accept() {

	}
}

public class Rule1 {
	public static void main(String[] args) {
		Parent p = new Child(); // Upcasting
		p.show();
	}
}
