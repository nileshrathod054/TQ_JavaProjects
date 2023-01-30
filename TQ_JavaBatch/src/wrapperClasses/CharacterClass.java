package wrapperClasses;

public class CharacterClass {
	public static void main(String[] args) {
		char ch = '9';
		Character ch1 = ch;
		int x = Character.MIN_VALUE;
		System.out.println(x);
		boolean b = Character.isLetterOrDigit(ch);
		System.out.println(b);
		int num = Character.getNumericValue(ch);
		System.out.println(num);

	}
}
