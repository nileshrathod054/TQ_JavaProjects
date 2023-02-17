package comparableAndComparator;

public class Item implements Comparable<Item> {
	int itemId;
	float itemPrice;
	String itemName;

	public Item() {

	}

	public Item(int itemId, float itemPrice, String itemName) {
		this.itemId = itemId;
		this.itemPrice = itemPrice;
		this.itemName = itemName;

	}

	public String toString() {
		return "Item ID=" + itemId + ", Item Price=" + itemPrice + ", Item Name=" + itemName;
	}

	@Override
	public int compareTo(Item o) {
		if (this.itemId < o.itemId)
			return -1;
		else if (this.itemId > o.itemId)
			return 1;
		else
			return 0;
	}

}
