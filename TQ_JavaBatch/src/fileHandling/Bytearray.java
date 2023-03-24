package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Bytearray {

	public static void main(String[] args) throws IOException {
//		FileInputStream fs=new FileInputStream("e:/file_hand/write1.txt");
//		
//		byte[] b=new byte[fs.available()];
//		fs.read(b);
//		
//		for(int i=0;i<b.length;i++)
//		{
//			System.out.print((char)b[i]);

//		}
		byte arr[] = new byte[45];
		FileInputStream fs = new FileInputStream("f:/FileHandling/write3.txt");
		fs.read(arr, 0, 45);
		for (int i = 26; i < 42; i++) {
			System.out.print((char) arr[i]);

		}

	}

}
