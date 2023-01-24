package string;

public class Create {

	public static void main(String[] args) {
		char ch[] = { 'a', 'b', 'c' };

		/*
		 * byte b[]= {65,66,67};
		 * 
		 * 
		 * String s1=new String(b); System.out.println(s1);
		 */

		String s = new String(ch);
		System.out.println(s);

		String s2 = "java";// String literal
		System.out.println(s2);

		String s3 = new String("programming");
		System.out.println(s3);
	}

}
