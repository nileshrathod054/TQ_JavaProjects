package assignment_28thJanException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Q9CheckedException {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("F:\\abc.txt");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Rest of the code");

	}

}
