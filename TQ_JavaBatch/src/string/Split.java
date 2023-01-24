package string;

public class Split {

	public static void main(String[] args) {
		// String s="j a v a i s programming language";

		String s = "s u r a j";

		String str[] = s.split("\\s");
		int count = str.length;

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

		System.out.println("---for each----");

		for (String st : str) {
			System.out.println(st);
		}

		System.out.println(count);

	}

}
