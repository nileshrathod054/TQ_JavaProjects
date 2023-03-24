package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Desrialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("f:/fileHandling/employee.txt");
		ObjectInputStream oos = new ObjectInputStream(fis);
		ArrayList<Employee> o = (ArrayList<Employee>) oos.readObject();
		Iterator<Employee> e = o.iterator();

		while (e.hasNext()) {
			Employee e1 = e.next();
			if (e1.salary > 20000) {
				System.out.println(e1);
			}
		}

		// System.out.println(o);
	}

}
