package arrayListAssignment;

import java.util.ArrayList;

public class Q08RemoveElementFromArrayList {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Black");
		colors.add("White");
		colors.add("Yellow");
		System.out.println(" Original Arraylist : "+colors);
	
		colors.remove(0);
		System.out.println("\n After removing an element of index 1 : "+colors);
	}
}
