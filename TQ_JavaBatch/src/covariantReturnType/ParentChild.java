package covariantReturnType;

class Parent {

	Parent show() {
		System.out.println("parent method");
		return this;
	}

	Child move() {
		System.out.println("move method");
		return new Child();
	}
}

class Child extends Parent {

	Child show() {
		super.show();
		System.out.println("child method");
		return this;
	}

	Child show1() {
		return new Child();
	}
}

public class ParentChild {

	public static void main(String[] args) {

//		Parent p=new Parent();
//       p.move().show1();
//		

		Parent p = new Child();//
		Child c = (Child) p;
		c.show();

	}

}
