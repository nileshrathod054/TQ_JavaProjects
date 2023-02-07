package arrayListEx;

public class Item {
	int item_id;
	String name;
	int price;

	public Item(int item_id, String name, int price) {
		super();
		this.item_id = item_id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", name=" + name + ", price=" + price + "]";
	}

}
