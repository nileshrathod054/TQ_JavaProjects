package jan2020;

class Parent {
	int num = 100;

	public void show() {
		System.out.println(" I am Parent");
	}
}

class Child extends Parent {
	int num = 200;

	public void show() {
		System.out.println(" I am Child");
	}
}

public class Out2 {
	public static void main(String[] args) {
		Parent ch1 = new Child();
		System.out.println(ch1.num);
		ch1.show();
	}
}
