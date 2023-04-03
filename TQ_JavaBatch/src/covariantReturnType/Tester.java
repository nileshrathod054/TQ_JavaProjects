package covariantReturnType;

class SuperClass {
	SuperClass get() {
		System.out.println("SuperClass method");
		return this;
	}
}

public class Tester extends SuperClass {
	Tester get() {
		System.out.println("SubClass Method");
		return this;
	}

	public static void main(String[] args) {
		SuperClass tester = new Tester();
		tester.get();
	}

}
