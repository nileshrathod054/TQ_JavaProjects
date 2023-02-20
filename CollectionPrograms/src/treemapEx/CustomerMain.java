package treemapEx;

import java.util.Date;
import java.util.TreeMap;

public class CustomerMain {
	   public static void main(String[] args) 
	    {
	        // Creating a TreeMap 
	        TreeMap<Customer, Order> tm = new TreeMap<Customer, Order>();
	 
	        tm.put(new Customer(15, "Ankit", "111111"), new Order(1, new Date(), "Delhi"));
	        tm.put(new Customer(10, "Aman", "222222"), new Order(2, new Date(), "Mumbai"));
	        tm.put(new Customer(20, "Sumit", "333333"), new Order(3, new Date(), "Kolkata"));
	        tm.put(new Customer(5, "John", "444444"), new Order(4, new Date(), "Chennai"));
	 
	        
	        // printing TreeMap
	        for (Customer c : tm.keySet()) 
	        {
	            System.out.println("Customer ID : " + c.custId);
	            System.out.println("Customer Name : " + c.custName);
	            System.out.println("Customer Mobile : " + c.mobile);
	            System.out.println("Order ID : " + tm.get(c).o_id);
	            System.out.println("Order Date : " + tm.get(c).date);
	            System.out.println("Order Location : " + tm.get(c).location);
	            System.out.println("--------------------------------");
	        }
	    }
}
