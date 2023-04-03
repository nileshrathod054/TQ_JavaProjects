package covariantReturnType;

class SuperClass1 {
	public Number demo(float a, float b) {
		Number result = a + b;
		return result;
	}
}

public class SubClass1 extends SuperClass1 {
	public Integer demo(float a, float b) {
		return (int) (a + b);
	}

	public static void main(String[] args) {
		SubClass1 sub = new SubClass1();
		System.out.println(sub.demo(25.5f, 89.225f));
	}
}
