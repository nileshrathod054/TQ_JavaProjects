package ssmock;

public class Product {
	int p_id;
	String p_name;

	public Product() {

	}

	public Product(int p_id, String p_name) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
	}

	@Override
	public String toString() {
		return String.format("Product [p_id=%s, p_name=%s, orders=%s]", p_id, p_name);
	}

}