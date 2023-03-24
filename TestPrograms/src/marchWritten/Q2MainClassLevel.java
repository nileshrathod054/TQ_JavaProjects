package marchWritten;

import java.io.IOException;
//Q2.What is wrong in this code can we have method overriding 
//with throws some Exception done the way it is done in this code? 
//If nothing is wrong then what is the output? [1M]

public class Q2MainClassLevel {

	public static void main(String[] args) {

		Parent p = new TestExceptionChild3();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}

class Parent {
	void msg() throws IOException {
		System.out.println("parent");
	}
}

class TestExceptionChild3 extends Parent {
	void msg() throws NullPointerException {

		System.out.println("child");
	}

}
