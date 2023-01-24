package class_object;

public class PrintNumber {
	PrintNumber(int i) {
		System.out.println("Default constructr is called.");
	}

	void check(int age) {
		if (age > 18) {
			display("Eligible to vote");
		}

	}

	void display(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		PrintNumber p1 = new PrintNumber(10);
		p1.check(20);
	}
}
