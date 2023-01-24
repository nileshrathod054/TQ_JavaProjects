package assignment_21stJanString;

public class Q7_RemoveWhiteSpaceWithTrim {
	public static void main(String[] args) {
		String s1 = " Hello World!";
		String s2 = " ";
		System.out.println("\n Original String : " + s1);
		s1 = s1.replaceAll("\\s", " ");
		System.out.println("\n Removed white spaces by using built in function : " + s1);

		char[] chars = s1.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != ' ') {
				s2 = s2 + chars[i];
			}
		}
		System.out.println("\n Removed white spaces without using built in function : " + s2);
	}

}