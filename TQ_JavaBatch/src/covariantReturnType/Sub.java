package covariantReturnType;

class Super {
	public void demo() {
		System.out.println("SuperClass Method");
	}
}

public class Sub extends Super {

	public void demo() {
		System.out.println("SubClass Method");
	}

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.demo();
	}
}
