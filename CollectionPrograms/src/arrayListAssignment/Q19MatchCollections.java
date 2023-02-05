package arrayListAssignment;

import java.util.ArrayList;

public class Q19MatchCollections {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("C");
		al.add("C++");
		al.add("C#");
		al.add("Java");
		al.add("JavaScript");
		al.add("HTML");
		al.add("CSS");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("C");
		al2.add("C++");
		al2.add("Java");
		al2.add("JavaScript");
		al2.retainAll(al);
		System.out.println("Matched elements of both arraylists : " + "\n" + al2);
	}
}
