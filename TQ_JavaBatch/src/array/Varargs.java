package array;

public class Varargs {

	void call(int... a) {
		for (int i = 0; i <= a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		Varargs v = new Varargs();
		v.call(10, 20, 30, 40, 50);
		System.out.println("----------");
		v.call(10, 20, 30);
		System.out.println("----------");
		v.call(10, 20);
		System.out.println("----------");
		v.call();
	}
}
