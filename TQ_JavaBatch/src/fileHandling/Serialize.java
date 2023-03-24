package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialize {

	public static void main(String[] args) throws IOException {
		FileOutputStream fis = new FileOutputStream("f:/FileHandling/employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		ArrayList<Employee> al = new ArrayList<>();
		Employee e = new Employee(1, "pooja", 15000, 1234);
		Employee e2 = new Employee(2, "rahul", 18000, 1234);
		Employee e3 = new Employee(3, "ram", 25000, 1234);
		Employee e4 = new Employee(4, "jay", 15000, 1234);
		Employee e5 = new Employee(5, "sonali", 30000, 1234);
		al.add(e);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		oos.writeObject(al);
		oos.close();

	}

}
