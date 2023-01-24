package string;

public class CharArray1 {

	public static void main(String[] args) {

		String s = "hello";
		char[] ch = CharArray.toCharArray(s);
		String s1 = new String(ch);
		System.out.println(s1);
	}
}
