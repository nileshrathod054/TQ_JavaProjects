package arrayListExtraAssignment;

import java.util.ArrayList;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		ArrayList<Character> al = new ArrayList<Character>();
		al.add('d');
		al.add('g');
		al.add('h');
		al.add('d');
		al.add('h');
		al.add('d');
		al.add('g');
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i) == al.get(j)) {
					al.remove(j);
				}
			}
		}
		System.out.println(al + " ");
	}
}
