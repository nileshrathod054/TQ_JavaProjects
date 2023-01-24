package basic;

public class TernaryLeapYear {

	public static void main(String[] args) {

		int year = 2000;

		String result;

		result = ((year % 4 == 0 && year % 100 != 0) ? "is a loop year."

				: (year % 400 == 0) ? "is a loop year." : "is not a loop year.");

		System.out.println(year + " " + result);
	}

}
