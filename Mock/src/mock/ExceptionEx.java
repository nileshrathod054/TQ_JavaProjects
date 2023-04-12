package mock;

public class ExceptionEx {

	public void show() throws NullPointerException {
		System.out.println("Hi, I am in show()");
	}

	public static void main(String[] args) {
		ExceptionEx obj = new ExceptionEx();
		obj.show();
	}
}
