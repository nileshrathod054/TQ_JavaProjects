package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writing {

	public static void main(String[] args) throws IOException {
		FileOutputStream fs = new FileOutputStream("f:/FileHandling/write1.txt");
		String s = "OutputStream class is an abstract class. It is the superclass of all classes "
				+ "representing an output stream of bytes. An output stream accepts output bytes "
				+ "and sends them to some sink.";

		byte arr[] = s.getBytes();

		fs.write(arr);

		fs.close();

		// fs.write(67);
	}

}
