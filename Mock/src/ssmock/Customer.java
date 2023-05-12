package ssmock;

public class Customer {
	int c_id;
	String c_name;
	int order;
	Product p;

	public Customer() {

	}

	public Customer(int c_id, String c_name, int order, Product p) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.order = order;
		this.p = p;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return String.format("Customer [c_id=%s, c_name=%s, order=%s, p=%s]", c_id, c_name, order, p);
	}

}
