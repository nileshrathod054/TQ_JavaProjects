package assignmentOnMapStackAndArrayList18thFeb;

import java.util.ArrayList;

public class Q11_RemoveOverload {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();

		al1.add("Om");
		al1.add("Ram");
		al1.add("Kiran");
		al1.add("Shree");

		System.out.println(al1);

		al1.remove(1);

		System.out.println(al1);

		al1.remove("Om");

		System.out.println(al1);
	}

}
