package ssmock;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductMain {
	public static void main(String[] args) {
		Customer c1 = new Customer(1, "Nilesh", 3, new Product(11, "Milk"));
		Customer c2 = new Customer(2, "Suraj", 4, new Product(12, "Milk"));
		Customer c3 = new Customer(3, "Himalay", 5, new Product(13, "Milk"));

		ArrayList<Customer> al = new ArrayList<>();
		al.add(c1);
		al.add(c2);
		al.add(c3);

		Iterator<Customer> it = al.iterator();
		while (it.hasNext()) {
			Customer c = it.next();
			if (c.order > 3) {
				System.out.println(c.c_name);
			}
		}
	}
}
