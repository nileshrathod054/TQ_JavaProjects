package inheritance.aggregation;

public class Supplier {
	int s_id;
	String s_name;
	Item i;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public Item getI() {
		return i;
	}

	public void setI(Item i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return s_id + "" + s_name + "" + i;
	}
}
