package arrayListEx;

import java.util.Comparator;

public class PatientSortingByName implements Comparator<Patient> {

	@Override
	public int compare(Patient o1, Patient o2) {

		if (o1.p_name.charAt(0) > o2.p_name.charAt(0)) {
			return 1;
		} else if (o1.p_name.charAt(0) < o2.p_name.charAt(0)) {
			return -1;
		}
		return o2.location.compareTo(o1.location);
	}

}
