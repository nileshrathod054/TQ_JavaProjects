package markerInterface.Serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
	public static void main(String[] args) {
		try {

			Employee emp = new Employee(1187345, "Nilesh Rathod");

			FileOutputStream fout = new FileOutputStream("f:/FileHandling/employeedata.txt");

			ObjectOutputStream out = new ObjectOutputStream(fout);

			out.writeObject(emp);
			out.flush();
			out.close();

			System.out.println("Data has been read from the file");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
