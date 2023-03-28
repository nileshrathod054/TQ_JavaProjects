package marchWritten;

public class Q9MainClassLevel implements InterfaceDemo {
	public static void main(String[] args) {
		Q9MainClassLevel impl = new Q9MainClassLevel();

		//impl.day = "Sunday";
		System.out.println(impl.day);
	}
}

interface InterfaceDemo {
	String day = "Monday";
}
