package janwritten;

public class Q19ConstructorChaining {

//Java program to illustrate Constructor Chaining
//within same class Using this() keyword

	// default constructor 1
	// default constructor will call another constructor
	// using this keyword from same class
	Q19ConstructorChaining() {
		// calls constructor 2
		this(5);
		System.out.println("The Default constructor");
	}

	// parameterized constructor 2
	Q19ConstructorChaining(int x) {
		// calls constructor 3
		this(5, 15);
		System.out.println(x);
	}

	// parameterized constructor 3
	Q19ConstructorChaining(int x, int y) {
		System.out.println(x * y);
	}

	public static void main(String args[]) {
		// invokes default constructor first
		Q19ConstructorChaining c = new Q19ConstructorChaining();
	}
}
