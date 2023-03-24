package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class Reading1 {

	public static void main(String[] args) throws IOException {
		// File f=new File("e:/file_hand/Celcius.txt");

		FileInputStream fs = new FileInputStream("f:/FileHandling/GoodThought.txt");

		// int a=fs.read();
		System.out.println(fs.available());
		int a;
		int digcount = 0;
		while ((a = fs.read()) != -1) {
			char ch = (char) a;
			if (ch >= '0' && ch <= '9')

			{
				System.out.println(ch);
				digcount++;
			}
		}
		System.out.println("count of digits=" + digcount);
		fs.close();

	}

}
