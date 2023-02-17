package collectionTest;

import java.util.HashSet;
import java.util.Iterator;

public class Output2 {
	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<>();
		hashset.add("Rose");
		hashset.add("Lotus");
		hashset.add("Lavender");
		
		Iterator<String> itr = hashset.iterator();
		
		hashset.add("Tulip");      //It will throw ConcurrentModificationException,
		                          //because we can't do any modification inside the iterator.
	
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
