package collectionTest;

import java.util.HashMap;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap();
		map.put(1, "Jilebi");
		map.put(2, "Modak");
		map.put(3, "Laddu");
		if (map.put(2, "Barfi") == null)
			System.out.println("yummy");
		else
			System.out.println("tasty");
		
		System.out.println(map.put(3, "Halwa"));
		System.out.println(map.size());
	}
}
