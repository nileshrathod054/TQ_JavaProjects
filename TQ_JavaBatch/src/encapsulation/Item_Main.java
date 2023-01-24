package encapsulation;

public class Item_Main {

	public static void main(String[] args) {

		// new Item();//anonymous object
		Item i1 = new Item("Mobile", 12000);// ox300

		new Item("Charger", 1000).show();// ox500

		int x = i1.getPrice() + 100;
		i1.setPrice(x);

		i1.setPrice(i1.getPrice() + 200);
		i1.show();

	}

}
