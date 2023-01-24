package basic;

public class TypeCasting {

	public static void main(String[] args) {
		// Working on Java
		char ch = 'D';
		// Implicit type casting (converting lower datatype to higher datatype).
		int num1 = ch;
		System.out.println(num1);

		int num2 = 10000; // 10000.00
		float f = num2;

		System.out.println(f);

		// Explicit type casting (converting higher datatype to lower datatype. It is
		// not safe)

		double num3 = 56.67;
		int a = (int) num3;
		System.out.println(a);
	}

}
