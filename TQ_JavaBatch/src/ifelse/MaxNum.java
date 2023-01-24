package ifelse;

public class MaxNum {

	public static void main(String[] args) {

		int num1 = 45, num2 = 30, num3 = 35;

		int max = Math.max(num1, Math.max(num2, num3));
		
		System.out.println("Maximum between three numbers is: " + max);
	}
}
