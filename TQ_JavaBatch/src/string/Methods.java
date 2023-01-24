package string;

public class Methods {

	public static void main(String[] args) {
		String s = "HELLO";
		System.out.println(s.hashCode());

		// System.out.println(s.toLowerCase());
		// to convert string into lowercase
		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) (ch[i] + 32);
		}

		String st = new String(ch);
		System.out.println(st);

		s = s.concat("java");
		System.out.println(s.hashCode());
		System.out.println(s);

	}

}
