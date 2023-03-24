package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("F:/file_hand/write1.txt");
		char ch[] = new char[50];

		fr.read(ch);

		String s = new String(ch);
		System.out.println(s);

	}

}
