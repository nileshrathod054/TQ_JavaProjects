package abstraction;

class Base {
//	public final void show() {
//		System.out.println("Base::show() called.");
//	}
	public void show() {
		System.out.println("Base::show() called.");
	}
}

class Derived extends Base {
	public void show() { // We can't override the final methods.

		System.out.println("Derived::show() called");
	}
}

public class Main {
	public static void main(String[] args) {
		Base b = new Derived(); // If we remove the final keyword of the show method of the base class
								// the derived class's show method will get called.
		b.show();
	}
}
