package class_object;

//constructor overloading
//when constructor is performing more than one task with different parameters
public class Item {

	String item_name, brand;
	int price;
	int quantity;

	Item()// default
	{
		item_name = "Pencil";
		price = 10;

	}

	Item(int q)// parametrized
	{
		quantity = q;
	}

	Item(String b)// parametrized
	{
		brand = b;
	}

	void display() {
		System.out.println(item_name);
		System.out.println(price);

	}

	void q_display() {
		System.out.println(quantity);
	}

	void b_brand() {
		System.out.println(brand);
	}

	public static void main(String[] args) {
		Item i = new Item();
		Item i1 = new Item(7);
		Item i2 = new Item("Natraj");

		i.display();
		i1.q_display();
		i2.b_brand();

	}

}
