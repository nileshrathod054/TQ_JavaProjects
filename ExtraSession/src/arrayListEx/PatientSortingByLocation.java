package arrayListEx;

import java.util.Comparator;

public class PatientSortingByLocation implements Comparator<Patient> {

	@Override
	public int compare(Patient o1, Patient o2) {
		if (o1.location.charAt(0) < o2.location.charAt(0)) {
			return 1;
		} else if (o1.location.charAt(0) >o2.location.charAt(0)) {
			return -1;
		}
		return o2.p_name.compareTo(o1.p_name);

	}
}