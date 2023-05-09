package ssmock;

import java.util.HashMap;

public class ProductMain {
	public static void main(String[] args) {
		Customer c1 = new Customer(1, "Nilesh", new Product(11, "Milk"));
		Customer c2 = new Customer(2, "Suraj", new Product(12, "Milk"));
		Customer c3 = new Customer(3, "Himalay", new Product(13, "Milk"));

		HashMap<Customer, Integer> orders = new HashMap<>();
		orders.put(c1, 3);
		orders.put(c2, 4);
		orders.put(c3, 5);
		
		  for (Customer customer : orders.keySet()) {
	            if (orders.get(customer) > 3) {
	               orders.put(customer, orders.get(customer));
	            }
	            System.out.println(orders);
	        }
		
	}
}
