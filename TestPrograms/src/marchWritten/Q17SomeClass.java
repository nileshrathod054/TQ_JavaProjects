package marchWritten;

public class Q17SomeClass {

	int intVar = 0;

	String strVar = "InnerClassExample";

	private int intPvt = 4;
	public static int intStatic = 61;
	private static String strPvtStatic = " java";

	private void printVar() {

		System.out.println(intVar + " " + strVar + " " + intPvt);

	}

	static class Nested {

		public void printStaticInnerVar() {

			// System.out.println(" variable from outer class " + strVar); // 1 complier
			// error

			System.out.println(" static variable from outer class " + intStatic);// 2

			System.out.println(" I am from static inner class"); // 3

		}

	}

	class InnerClass {

		int intInner = 9; // 4

		// static int num = 0; // 5 complier error

		static final int numConstant = 10; // 6

		String strInner = " I am string in innerclass";

		public void printInnerVar() {

			System.out.println(" I am from inner class " + strVar);

		}

	}

	public static void main(String[] args) {

		Q17SomeClass.Nested sn = new Q17SomeClass.Nested();

		sn.printStaticInnerVar(); // 7

		Q17SomeClass icd = new Q17SomeClass();

		Q17SomeClass.InnerClass inObj = icd.new InnerClass();
		inObj.printInnerVar(); // 8

	}

}