package basic;

public class This1 {
	int x = 10;

	void change(This1 t) {

		t.x = t.x + 10;
		System.out.println(x);
	}

	static This1 show() {

		return new This1();
	}

	public static void main(String[] args) {
		This1 t = show();
		t.change(t);
		System.out.println(t.x);

	}

}
