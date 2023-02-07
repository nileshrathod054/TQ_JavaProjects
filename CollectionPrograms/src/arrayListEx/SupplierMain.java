package arrayListEx;

import java.util.ArrayList;
import java.util.Iterator;

public class SupplierMain {

	ArrayList<Supplier> al = new ArrayList<Supplier>();

	SupplierMain(ArrayList<Supplier> al) {
		this.al = al;
	}

	void findSupName() {
		Iterator<Supplier> it = al.iterator();

		while (it.hasNext()) {
			Supplier s = it.next();

			if (s.i.price > 5000) {
				System.out.println(s.s_name);
			}
		}

	}

	void findSupCity() {
		Iterator<Supplier> it = al.iterator();

		while (it.hasNext()) {
			Supplier s = it.next();
			if (s.s_location.equals("mumbai")) {
				System.out.println(s.s_name);
			}
		}
	}

	public static void main(String[] args) {
		Item i1 = new Item(1, "charger", 2000);
		Item i2 = new Item(2, "mobile", 12000);
		Item i3 = new Item(3, "battery", 1000);
		Item i4 = new Item(4, "headphones", 7000);

		Supplier s1 = new Supplier("Mr Ram", "mumbai", i1);
		Supplier s2 = new Supplier("Mr suresh", "delhi", i1);
		Supplier s3 = new Supplier("Mrs Rohini", "mumbai", i2);
		Supplier s4 = new Supplier("Mr sharma", "pune", i3);
		Supplier s5 = new Supplier("Mrs sonal", "mumbai", i4);

		ArrayList<Supplier> al = new ArrayList();

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		SupplierMain am = new SupplierMain(al);
		am.findSupName();
		am.findSupCity();

	}

}
