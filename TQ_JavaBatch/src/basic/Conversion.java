package basic;

public class Conversion {

	public static void main(String[] args) {
		char ch = 'A';

		int x = ch + 1;// 65+1 //66 up casting

		System.out.println(x);

		float f1 = ch + 2;
		System.out.println(f1);

		boolean b = true;

		double d = 56.78;// loss of data
		int x1 = (int) d;
		System.out.println(x1);

		Object o1 = "hello";
		String s = (String) o1;

		String s2 = "java";
		Object o2 = s2;

	}

}
