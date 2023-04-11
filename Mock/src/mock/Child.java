package mock;

import java.io.FileNotFoundException;

public class Child extends Parent {

	void m1() throws FileNotFoundException {
		// super.m1();

		System.out.println("TestException");
	}

	public static void main(String[] args) throws FileNotFoundException {
		Child c = new Child();

		c.m1();
	}
}
