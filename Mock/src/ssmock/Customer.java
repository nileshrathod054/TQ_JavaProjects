package ssmock;

public class Customer {
	int c_id;
	String c_name;
	Product p;

	public Customer() {

	}

	public Customer(int c_id, String c_name, Product p) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.p = p;
	}

	@Override
	public String toString() {
		return String.format("Customer [c_id=%s, c_name=%s, p=%s]", c_id, c_name, p);
	}

}
