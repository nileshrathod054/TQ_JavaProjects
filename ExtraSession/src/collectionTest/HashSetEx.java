package collectionTest;

import java.util.HashSet;

class Country {
	private String name;

	Country(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Country [name=%s]", name);
	}

}

public class HashSetEx {
	public static void main(String[] args) {
		HashSet hs = new HashSet();

		String s1 = new String("India");
		String s2 = new String("India");

		Country s3 = new Country("France");
		Country s4 = new Country("France");

		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);

		System.out.println(hs);
	}
}
