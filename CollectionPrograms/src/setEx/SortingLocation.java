package setEx;

import java.util.Comparator;

public class SortingLocation implements Comparator<Manager> {

	@Override
	public int compare(Manager o1, Manager o2) {
		return o2.location.compareTo(o1.location);
	}

}
