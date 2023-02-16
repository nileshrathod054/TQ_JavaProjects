package treemapEx;

import java.util.Date;

public class Order {
	int o_id;
	Date date;
	String location;

	public Order(int o_id, Date date, String location) {
		super();
		this.o_id = o_id;
		this.date = date;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Order Id=" + o_id + ", Date=" + date + ", Location=" + location;
	}
}
