package markerInterface.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationEx {
	public static void main(String[] args) {
		// Creating Stream to read the object

		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("f:/FileHandling/employeedata.txt"));

			Employee emp = (Employee) in.readObject();

			// Printing the data of serialized object
			System.out.println(emp.empid + " " + emp.empname);

			// closing the stream
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
