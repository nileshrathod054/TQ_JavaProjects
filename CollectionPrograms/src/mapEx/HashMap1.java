package mapEx;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Character, String> hs = new HashMap<Character, String>();
		hs.put('A', "Angry");
		hs.put('B', "Beautiful");
		hs.put('C', "calm");
		hs.put('D', "Doll");
		hs.put('Z', "zebra");
		hs.put('A', "Arrogant");
		hs.put('P', "priya");
		hs.put('r', "ram");
		hs.put('l', "lion");
		hs.put('m', "manu");
		hs.put('g', "gayle");
		hs.put('k', "kite");
		hs.put('x', "xmas");
		hs.put('y', "yellow");

		String s = hs.get('D');
		System.out.println(s);

	}

}
