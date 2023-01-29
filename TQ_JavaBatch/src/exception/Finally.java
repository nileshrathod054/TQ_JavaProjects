package exception;

import java.io.*;

public class Finally {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("E:/abc.txt");

		} finally {
			System.out.println("Closing file");
			fis.close();
		}
	}
}
