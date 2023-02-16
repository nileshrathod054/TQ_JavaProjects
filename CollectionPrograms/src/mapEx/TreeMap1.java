package mapEx;

import java.util.HashMap;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		HashMap<String, Integer> ts = new HashMap();
		ts.put("red ballons", 12);
		ts.put("black balloons", 34);
		ts.put("yellow ballons", 2);
		ts.put("blue ballons", 12);
		ts.put("orange balloons", 34);
		ts.put("white ballons", 2);

		// System.out.println(ts);

		TreeMap<String, Integer> ts1 = new TreeMap(ts);

		System.out.println(ts1);
		System.out.println("======");

		SortedMap<String, Integer> sop = ts1.subMap("blue ballons", "white ballons");
		System.out.println(sop);

		System.out.println("------");
		TreeMap<String, Integer> ts2 = new TreeMap<>(sop);
		ts2.put("pink ballons", 20);
		System.out.println(ts2);

		System.out.println("-------ceiling entry---");

		System.out.println(ts1.ceilingEntry("ped balloons"));

		System.out.println(ts1.floorEntry("doll balloons"));

		System.out.println(ts1.ceilingKey("doll ballons"));

		System.out.println(ts1.lowerKey("red ballons"));

		NavigableMap<String, Integer> ns = ts1.descendingMap();
		System.out.println("---");

		System.out.println(ns);

	}

}
