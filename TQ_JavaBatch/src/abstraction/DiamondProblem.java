package abstraction;

interface First {
	default void firstM1() {
		System.out.println("First interface method");
	}
}

interface Second {
	default void firstM1() {
		System.out.println("Second interface method");
	}
}

class Simple implements First, Second {
	public void firstM1() {
		First.super.firstM1();
		Second.super.firstM1();
		System.out.println("Simple method");
	}
}

public class DiamondProblem {
	public static void main(String[] args) {
		Simple s = new Simple();
		s.firstM1();
	}
}
