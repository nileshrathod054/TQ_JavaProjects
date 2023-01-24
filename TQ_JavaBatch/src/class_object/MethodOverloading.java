package class_object;

public class MethodOverloading {

	// method overloading means same method name performing different task but by
	// using different parameters
	// and no of parameters

	void calulate(int a, int b) {
		System.out.println(a + b);
	}

	void calulate(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	void calulate(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.calulate(12, 34);
		m.calulate(12, 34, 56);
		m.calulate(34, 56, 78, 10);

	}

}
