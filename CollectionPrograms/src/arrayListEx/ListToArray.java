package arrayListEx;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {
	public static void main(String[] args) {
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("Reading");
		hobbies.add("Drawing");
		hobbies.add("Singing");
		hobbies.add("Dancing");
		hobbies.add("Playing");

		System.out.println("List of hobbies \n" + hobbies);
		// Convert collection toArray() way1:
		Object[] newhobbies = hobbies.toArray();
		System.out.println("ArrayList converted to object array");
		System.out.println(Arrays.toString(newhobbies));

		// Convert collection toArray() way2
		String str[] = new String[hobbies.size()];
		hobbies.toArray(str);
		System.out.println("Array list converted to string array");
		System.out.println(Arrays.toString(str));
	}
}
