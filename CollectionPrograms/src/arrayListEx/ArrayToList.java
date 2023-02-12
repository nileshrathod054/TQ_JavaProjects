package arrayListEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {
		String h[] = { "Reading", "Music", "Dancing", "Tracking" };
		// Convert Array to List way1 :
		// Using Arrays.asList();

		List<String> hobbies = Arrays.asList(h);
		System.out.println("List of hobbies ");
		for (String hb : hobbies) {
			System.out.println(hb);
		}
		// Convert Array to List way2 :

		ArrayList<String> hobbies1 = new ArrayList<>(Arrays.asList(h));
		System.out.println("List of hobbies1 : ");
		for (String hb : hobbies1) {
			System.out.println(hb);
		}
		// Convert Array to List way2 :
		// using Collections.addAll()
		ArrayList<String> hobbies2 = new ArrayList<>();
		Collections.addAll(hobbies2, h);
		System.out.println("List of hobbies2");
		for (String hb : hobbies2) {
			System.out.println(hb);
		}
		Collections.addAll(hobbies2, "Cooking", "Singing", "Drawing");
		System.out.println(hobbies2);

		// Collections.sort() method
		Collections.sort(hobbies2);
		System.out.println("After sorting : \n" + hobbies2);

	}
}
