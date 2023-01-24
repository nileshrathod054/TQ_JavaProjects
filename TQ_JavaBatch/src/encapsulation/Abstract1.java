package encapsulation;

abstract class Parent extends Object

{
	// abstract void show();
	int a = 20;

	@Override
	public String toString() {
		return "Parent [a=" + a + "]";
	}

}

class Child extends Parent {

	int a = 10;

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Child [a=" + a + "]";
	}

}

public class Abstract1 {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p);

	}

}
