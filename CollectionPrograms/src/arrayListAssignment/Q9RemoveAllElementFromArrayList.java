package arrayListAssignment;

import java.util.ArrayList;

public class Q9RemoveAllElementFromArrayList {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Black");
		colors.add("White");
		colors.add("Yellow");
		System.out.println(" Original Arraylist : " + colors);
		colors.removeAll(colors);
		System.out.println("\n After removing an element of index 1 : " + colors);
	}
}
