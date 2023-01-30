package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

// if superclass method throw exception then subclass
//overriding method can throw same exception,no exception,
//subclass but can not throw parent

class Parent1 {

	void show() throws IOException {
		System.out.println("parent class show method");

	}
}

class Child1 extends Parent1 {
	void show() {

		System.out.println("child class show method");
	}

}

public class Rule2 {

	public static void main(String[] args) {
		Parent1 p = new Child1();
		try {
			p.show();
		} catch (IOException e) {
			
			e.printStackTrace();

		}

	}

}
