package hashMapEx;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap<Character, String> hs = new LinkedHashMap<Character, String>();
		hs.put('A', "Angry");
		hs.put('C', "Beautiful");
		hs.put('B', "calm");

		System.out.println(hs);

	}

}
