package abstraction;

interface Bank {
	void bankDetails();

      interface locker {
		void display(String name);

		void show();

		void bankDetails();
	}
}

class HDFC implements Bank.locker, Bank {

	@Override
	public void display(String name) {
		System.out.println("Bank name is...." + name);
	}

	@Override
	public void show() {
		System.out.println("Showing locker information");
	}

	@Override
	public void bankDetails() {
		System.out.println("Showing bank details");

	}

}

public class NestedInterface {
	public static void main(String[] args) {
		Bank.locker b = new HDFC();
		b.display("HDFC");
		b.show();
		b.bankDetails();
	}
}
