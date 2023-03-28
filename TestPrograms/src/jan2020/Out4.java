package jan2020;

public class Out4 {
	public static void main(String[] args) {
		D d = new D("Blue");
		System.out.println(d.color);
	}
}

class C {
	int id;
	String name;

	C(int id) {
		this.id = id;
	}
}

class D {
	String color;
	String type;

	D() {
		this.color = "Red";
	}

	D(String color) {
		this();
		this.color = color;
	}
}