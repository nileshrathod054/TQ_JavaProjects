package treemapEx;

import java.util.Comparator;

public class CustomerSortingById implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if (o1.custId > o2.custId) {
			return 1;
		} else if (o1.custId < o2.custId) {
			return -1;
		} else
			return 0;
	}

}
