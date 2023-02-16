package mapEx;

import java.util.ArrayList;

public class Supplier {
	int s_id;
	String name;

	ArrayList<Item> al;

	public Supplier(int s_id, String name, ArrayList<Item> al) {
		super();
		this.s_id = s_id;
		this.name = name;
		this.al = al;
	}

}
