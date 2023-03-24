package janwritten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q3ArrayListMap {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("A+2");
		arrayList.add("B+12");
		arrayList.add("D+4");
		arrayList.add("D+2");
		arrayList.add("DD+5");

		Map<String, Integer> map = new HashMap<>();

		for (String str : arrayList) {
			String[] arr = str.split("\\+");
			String key = arr[0];
			int value = Integer.parseInt(arr[1]);

			if (map.containsKey(key)) {
				value += map.get(key);
			}
			map.put(key, value);
		}

		System.out.println(map);
	}
}
