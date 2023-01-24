package basic;

public class ThisAsParameter {
	int x = 10;

	void change(ThisAsParameter t) {
		show().display();
		t.x = t.x + 10;
		System.out.println(x);
	}

	ThisAsParameter show() {
		return this;
	}

	void display() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		ThisAsParameter t = new ThisAsParameter();
		System.out.println(t);

		t.change(t);

		// t.show();

	}

}
