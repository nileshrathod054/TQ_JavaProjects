package mapPractice;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableEx {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(12, "Nilesh");
		ht.put(13, "Ashwin");
		ht.put(10, "Shivam");

		System.out.println("Value of key 13 : " + ht.get(13));
		System.out.println("Iterate Hashtable using entrySet()...");
		Set<Entry<Integer, String>> entryset = ht.entrySet();
		for (Entry<Integer, String> e : entryset) {
			System.out.println("(" + e.getKey() + "," + e.getValue() + ")");
		}
		System.out.println("Iterate Hashtable values using Enumeration");
		Enumeration<String> en = ht.elements();
		while (en.hasMoreElements()) {
			String value = en.nextElement();
			System.out.println(value);
		}
	}
}
