package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class Bytearraywrite {

	public static void main(String[] args) throws IOException {

		FileOutputStream fs = new FileOutputStream("f:/FileHandling/write2.txt", true);

//		String s="java programming language";
//		byte arr[]=s.getBytes();
//		fs.write(arr);
//		
		String s2 = "java programming language";
		System.out.println(s2.indexOf('l'));
		byte arr2[] = s2.getBytes();
		// fs.flush();

		fs.write(arr2, 17, 8);

		fs.close();

	}

}
