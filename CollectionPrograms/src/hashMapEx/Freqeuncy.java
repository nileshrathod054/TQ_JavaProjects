package hashMapEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Freqeuncy {

	public static void main(String[] args) {
		ArrayList<Character> al = new ArrayList<Character>();
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		al.add('A');
		al.add('B');
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('A');
		al.add('A');
		al.add('C');

		Iterator<Character> it = al.iterator();

		while (it.hasNext()) {
			Character ch = it.next();
			System.out.println(ch);
			int count = 1;

			if (hs.containsKey(ch)) {
				count = hs.get(ch);
				count = count + 1;
				hs.put(ch, count);
			} else
				hs.put(ch, count);
		}

		System.out.println(hs);

	}

}
