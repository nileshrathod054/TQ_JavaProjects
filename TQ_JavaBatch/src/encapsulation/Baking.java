package encapsulation;

public class Baking {

	static String shop_name = "XYZ";

	static void bake(String flavour1) {
		System.out.println("cake flavour is..." + flavour1);
	}

	static void bake(String flavour1, String flavour2) {
		System.out.println("cake flavour is..." + flavour1);
		System.out.println("ice cream flavour is..." + flavour2);
	}

	static void bake(String flavour1, String flavour2, String flavour3) {
		System.out.println("Cake flavour is..." + flavour1);
		System.out.println("Ice cream flavour is..." + flavour2);
		System.out.println("Coffee flavour is..." + flavour3);
	}

	public static void main(String[] args) {
		System.out.println("welcome to..." + shop_name);
		bake("Strawberry");
		bake("Chocolate", "Vanilla");
		bake("Red velvet", "Vanilla", "Caramel");

	}

}
