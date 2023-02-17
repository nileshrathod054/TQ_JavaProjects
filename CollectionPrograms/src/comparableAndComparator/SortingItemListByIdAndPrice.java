package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingItemListByIdAndPrice {
	public static void main(String[] args) {
		List<Item> itemlist = new ArrayList<>();
		System.out.println(itemlist);

		itemlist.add(new Item(4556, 777.00f, "Pendrive"));
		itemlist.add(new Item(3556, 767.00f, "Bluetooth Speaker"));
		itemlist.add(new Item(8556, 5777.00f, "Smart Band"));
		itemlist.add(new Item(5576, 55777.00f, "Apple Cell"));
		itemlist.add(new Item(8554, 777.00f, "Head Phone"));

		System.out.println("Before sorting item list is....");
		for (Item it : itemlist) {
			System.out.println(it);
		}
		System.out.println("**********************");

		// Sorting by ItemId in ascending order
		Collections.sort(itemlist);
		System.out.println("After sorting item list by item ID");
		System.out.println(itemlist);

		System.out.println("**********************");

		// Sorting by Item Price in ascending order
		Collections.sort(itemlist, new FirstByPriceByThenByItemNameComparator());
		System.out.println("After sorting item list by item price then by Item name in ascending order : ");
		for (Item it : itemlist) {
			System.out.println(it);
		}
	}
}
