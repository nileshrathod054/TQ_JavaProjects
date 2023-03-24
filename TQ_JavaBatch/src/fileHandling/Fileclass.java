package fileHandling;

import java.io.File;
import java.io.IOException;

public class Fileclass {

	public static void main(String[] args) throws IOException {
		File f = new File("f:/FileHandling/write4.txt");
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.exists());
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getClass());
		f.setWritable(false);
		System.out.println(f.canWrite());
		File f1 = new File("f:/FileHandling/write4.txt");
		System.out.println(f1.createNewFile());
		System.out.println(f1.isFile());
		System.out.println(f1.delete());
		File f3 = new File("f:/");
		String arr[] = f3.list();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
