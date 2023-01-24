package inheritance.multilevel;

class Mobile {
	String s = "Welcome to our mobile zone";
	String s1 = "Provides processor";

	Mobile() {
		System.out.println("Default constructor");
	}

	void display() {
		System.out.println(s);
	}
}

class Samsung extends Mobile {
	String b_name = "Samsung";
	String s = "20Gb Ram";
	int price = 20000;
	String features = "20Mega Pixel camra";
	String s1 = "Snapdragon 8Gen";

	Samsung() {
		System.out.println("Default constructor of Samsung class");
	}

	void display() {
		super.display();
		System.out.println("Brand name is..." + b_name);
		System.out.println("Price is...." + price);
		System.out.println("Features are..." + features);
		System.out.println("Ram is..." + s);
		System.out.println(super.s1);
		System.out.println(s1);
	}
}

public class MobileMain {
	public static void main(String[] args) {
		Samsung s = new Samsung(); // default constructor of superclass will get called automatically.
		s.display();
	}
}
