package string;

public class Subtring {

	public static void main(String[] args) {
		String s = "java is proigramming";
		char ch[] = new char[7];

		System.out.println(s.substring(5));

		System.out.println(s.substring(5, 15));
		System.out.println(s.trim());

		System.out.println(s.endsWith("ing"));
		System.out.println(String.join("/", "20", "01", "2023"));
		s.getChars(8, 15, ch, 0);
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

		System.out.println(s.indexOf('i'));
		System.out.println(s.lastIndexOf('i'));
		System.out.println(s.indexOf('i', 6));
	}

}
