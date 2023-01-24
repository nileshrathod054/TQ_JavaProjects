package array;

public class CharacterFrequency {

	public static void main(String[] args) {
		char ch[] = { 'a', 'b', 'a', 'c', '0', 'b', 'a' };
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '\0';
				}
			}
			if (ch[i] != '\0' && count == 0)
				System.out.println(ch[i] + "--->" + count);
		}

	}

}
