package assignment_28thJanException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q8MyClass {

	static void method1() throws FileNotFoundException {
		method2();
		System.out.println("method 1");
	}

	static void method2() {
		try {
			method3();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("method 2");
	}

	static void method3() throws FileNotFoundException {
		File file = new File("filename.txt");

		Scanner sc = new Scanner(file);
		System.out.println("method 3");

	}

	public static void main(String[] args) {

		try {
			method1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Rest of the code");

	}

}
