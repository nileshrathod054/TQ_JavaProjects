package treemapEx;

public class Customer implements Comparable<Customer> {
	int custId;
	String custName;
	String mobile;

	public Customer(int custId, String custName, String mobile) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Customer Id=" + custId + ", Customer Name=" + custName + ", Mobile=" + mobile;
	}

	@Override
	public int compareTo(Customer o) {
		if (this.custId < o.custId) {
			return -1;

		} else if (this.custId > o.custId) {
			return 1;
		} else
			return 0;
	}

}
