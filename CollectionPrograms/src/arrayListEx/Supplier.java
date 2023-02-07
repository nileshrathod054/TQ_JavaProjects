package arrayListEx;

public class Supplier {

	String s_name;
	String s_location;
	Item i;

	public Supplier(String s_name, String s_location, Item i) {
		super();
		this.s_name = s_name;
		this.s_location = s_location;
		this.i = i;
	}

	@Override
	public String toString() {
		return "Supplier [s_name=" + s_name + ", s_location=" + s_location + ", i=" + i + "]";
	}

}
