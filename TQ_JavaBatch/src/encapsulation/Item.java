package encapsulation;

//this refer to current class instance(object)
public class Item {

	private String item_name;
	private int price;

	public Item() {
		System.out.println("default constructor calld");
	}

	public Item(String item_name, int price) {
		this();
		this.item_name = item_name;
		this.price = price;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void show() {
		System.out.println("item name is..." + item_name);
		System.out.println("price is..." + price);
	}

}
