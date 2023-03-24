package janwritten;

import java.util.ArrayList;

public class Q2ArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A+2");
		list.add("B+12");
		list.add("D+4");
		list.add("DD+5");

		String character = "D";
		System.out.println(getValue(list, character));
	}

	public static int getValue(ArrayList<String> list, String character) {
		for (String s : list) {
			if (s.startsWith(character)) {
				String str = s.substring(s.indexOf('+'));
				return Integer.parseInt(str.substring(1));
			}
		}
		return 0;
	}

}
