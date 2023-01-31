package assignment_28thJanException;

import java.io.IOException;

public class Q6ThrowAndThrows {
	void m1(int num) throws IOException, ClassNotFoundException {
		if (num == 1) {
			throw new IOException("IOException caught");
		} else {
			throw new ClassNotFoundException("ClassNotFoundException caught");
		}
	}

	public static void main(String[] args) {
		try {
			Q6ThrowAndThrows obj = new Q6ThrowAndThrows();
			obj.m1(2);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
