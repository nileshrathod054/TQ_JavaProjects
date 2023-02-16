package mapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int passm = 40;
		String res;
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		HashMap<String, String> hs1 = new HashMap<String, String>();
		hs.put(sc.next(), sc.nextInt());
		hs.put(sc.next(), sc.nextInt());
		hs.put(sc.next(), sc.nextInt());
		hs.put(sc.next(), sc.nextInt());
		hs.put(sc.next(), sc.nextInt());
		hs.put(sc.next(), sc.nextInt());

		Set<Entry<String, Integer>> set = hs.entrySet();
		for (Map.Entry<String, Integer> map1 : set) {
			String s = map1.getKey();
			Integer m = map1.getValue();
			if (m > passm)
				res = "pass";
			else
				res = "fail";

			hs1.put(s, res);
		}

		Set<Entry<String, String>> set1 = hs1.entrySet();
		for (Map.Entry<String, String> map2 : set1) {
			String s = map2.getKey();
			String m = map2.getValue();

			System.out.println(s + "=" + m);

		}

	}
}