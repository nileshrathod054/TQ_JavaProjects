package treemapEx;

public class Customer {
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
}
