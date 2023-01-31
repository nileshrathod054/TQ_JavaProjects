package exception;

import java.io.IOException;

public class ThrowEx2 {
	void myMethod(int num) throws IOException, ClassNotFoundException {
		if (num == 1) {
			throw new IOException("Exception message1");
		} else {
			throw new ClassNotFoundException("Exception message2");
		}
	}

	public static void main(String[] args) {
		try {
			ThrowEx2 obj = new ThrowEx2();
			obj.myMethod(2);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
