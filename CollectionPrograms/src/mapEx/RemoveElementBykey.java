package mapEx;

import java.util.HashMap;

public class RemoveElementBykey {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(103, "Gaurav");

		System.out.println(map);

		map.remove(100);
		System.out.println("After removal " + map);

	}
}
