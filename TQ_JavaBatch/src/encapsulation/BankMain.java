package encapsulation;

class Bank {

	float ri = 3.4f;

	Bank(float ri) {
		this.ri = ri;
	}

	final void show() {
		System.out.println(ri);
	}

}

class HDFC extends Bank {
	HDFC() {
		super(6.4f);

	}

}

public class BankMain {

	public static void main(String[] args) {
		Bank b = new HDFC();
		b.show();
		int x;

		final int arr[] = { 1, 2, 3, 4, 5 };
		arr[0] = 12;
		System.out.println(arr[0]);

		int arr2[] = { 2, 3, 4 };

		// arr=arr2;

	}

}
