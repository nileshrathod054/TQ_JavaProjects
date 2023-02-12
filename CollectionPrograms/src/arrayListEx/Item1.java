package arrayListEx;

public class Item1 {
	int itemId;
	float itemPrice;
	String itemName;

	public Item1() {

	}

	public Item1(int itemId, float itemPrice, String itemName) {
		this.itemId = itemId;
		this.itemPrice = itemPrice;
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Item Id=" + itemId + "Item Price=" + itemPrice + "Item Name=" + itemName;
	}
}
