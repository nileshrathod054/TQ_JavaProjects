package mock;

public class Demo1 {

	public void show() throws NullPointerException {
		System.out.println("Hi, I am in show()");
	}

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.show();
	}
}
