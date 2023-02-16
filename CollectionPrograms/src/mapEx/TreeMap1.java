package mapEx;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		HashMap<String, Integer> ts = new HashMap();
		ts.put("red ballons", 12);
		ts.put("black balloons", 34);
		ts.put("yellow ballons", 2);

		System.out.println(ts);

		TreeMap<String, Integer> ts1 = new TreeMap(ts);

		System.out.println(ts1);

	}

}
