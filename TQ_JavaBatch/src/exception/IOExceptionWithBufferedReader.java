package exception;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class IOExceptionWithBufferedReader {
	public static void main(String[] args) throws IOException {
		InputStreamReader fis = new InputStreamReader(System.in);
		BufferedReader bs = new BufferedReader(fis);
		System.out.println("Enter String");
		String s = bs.readLine();
		System.out.println(s);
		System.out.println("Enter String");
		String ss = bs.readLine();
		System.out.println(ss);
		System.out.println("Enter String");
		String ss2 = bs.readLine();
		System.out.println(ss2);
		System.out.println("Enter char");
		char x = (char) bs.read();
		System.out.println(x);
		System.out.println("Enter age");
		int age = Integer.parseInt(ss);
		System.out.println(age);
		System.out.println("Enter temp");
		float f = Float.parseFloat(ss2);
		System.out.println(f);
	}
}
