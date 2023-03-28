package jan2020;

class AB {
	static int rollno;
	static String name;

	public void show() {
		/*
		 * Static methods can access only static variable but non static methods can
		 * access static as well as non static variable
		 */
		System.out.println(" rollno= " + rollno + " name= " + name);
	}
}

public class Out3 {
	public static void main(String[] args) {
		AB ab = new AB();
		ab.show();
	}
}
