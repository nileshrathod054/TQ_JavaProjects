package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("f:/FileHandling/GoodThought.txt", true);
		String s = "welcome to file handling";
		fw.write(s);
		fw.close();

	}

}
