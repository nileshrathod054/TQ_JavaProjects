package wrapperClasses;

public class WrapperEx2 {
	public static void main(String[] args) {
    //Converting Integer to int
		Integer a = new Integer(3);
		int i = a.intValue();
		// Converting Integer to int
		int j = a;
		// unboxing, now compiler will write a.intValue() internally
		System.out.println(a + " " + i + " " + j);
	}
}
