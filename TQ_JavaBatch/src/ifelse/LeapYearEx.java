package ifelse;

public class LeapYearEx {

	public static void main(String[] args) {

		int year = 2025;

		if (year % 4 == 0 && year % 100 != 0) {

			System.out.println(year + " is a leap year.");

		} else if (year % 100 == 0 && year % 400 == 0) {

			System.out.println(year + " is a leap year.");

		} else

			System.out.println(year + " is not a leap year");
	}

}
