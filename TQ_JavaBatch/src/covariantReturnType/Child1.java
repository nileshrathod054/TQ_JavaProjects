package covariantReturnType;

class Parent1 {
	Parent1 show() {
		System.out.println("Parent Method");
		return this;
	}

	Child1 move() {
		System.out.println("Move Method");
		return new Child1();
	}
}

public class Child1 extends Parent1 {

	Child1 show() {
		super.show();
		System.out.println("Child Method");
		return this;
	}

	Child1 show1() {
		return new Child1();
	}

	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.move().show1();
//		Parent1 p = new Child1();
//		Child1 c = (Child1) p;
//		c.show();
	}
}
