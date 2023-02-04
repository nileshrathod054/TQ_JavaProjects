package arrayListAssignment;

import java.util.*;

public class Q5ArrayListUsingForLoop {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("C");
		al.add("C++");
		al.add("C#");
		al.add("Java ");
		al.add("JavaScript");
		al.add("R");
		al.add("Swift");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}
