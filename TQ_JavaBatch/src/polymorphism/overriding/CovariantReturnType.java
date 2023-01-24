package polymorphism.overriding;

class Parent {
	Parent display() {
		System.out.println("Parent class method.");
		return this;
	}

	String show() {
		return "Show method";
	}
}

class Child1 extends Parent {
	Child1 display() {
		System.out.println(super.display());
		return this;
	}
}

public class CovariantReturnType {
	public static void main(String[] args) {
		Parent p = new Child1();
		System.out.println(new Child1().display().show());
	}
}
