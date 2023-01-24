package ifelse;

public class GreaterNum {

	public static void main(String[] args) {

		int num1 = 340, num2 = 56, num3 = 88;

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1+" is a greater number");
	
		} else if (num2 > num1 && num2 > num3) {

			System.out.println(num2 + " is a greater number.");

		} else

			System.out.println(num3 + " is a greater number.");

	}

}
