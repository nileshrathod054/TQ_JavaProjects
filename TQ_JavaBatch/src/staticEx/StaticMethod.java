package staticEx;

class Base1 {
	static void display() {
		System.out.println("base class display method");
	}
}

class Derived1 extends Base1 {

	static void display() {
		// super.display();
		System.out.println("Derived class display method");
	}

	void show() {

	}
}

class StaticMethod {
	public static void main(String[] args) {
		Base1 d = new Derived1();
		d.display();

	}

}
