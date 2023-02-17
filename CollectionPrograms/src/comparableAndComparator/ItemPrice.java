package comparableAndComparator;

import java.util.Comparator;

public class ItemPrice implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {
		if (o1.itemPrice > o2.itemPrice)
			return 1;
		else if (o1.itemPrice < o2.itemPrice)
			return -1;
		else
			return 0;
	}

}
