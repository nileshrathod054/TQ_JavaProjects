package mapEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListToMap {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A+2");
		list.add("B+12");
		list.add("D+4");
		list.add("DD+5");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String s : list) {
			String[] arr = s.split("\\+");
			if (map.containsKey(arr[0])) {
				int val = map.get(arr[0]);
				map.put(arr[0], val + Integer.parseInt(arr[1]));
			} else {
				map.put(arr[0], Integer.parseInt(arr[1]));
			}
		}

		System.out.println("Map: " + map);

	}
}