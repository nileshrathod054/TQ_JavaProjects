package basic;

public class Ternary1 {

	public static void main(String[] args) {

		int num1 = 20, num2 = 10, num3 = 40;

		int res = (num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2 > num3) ? num2 : num3;

		System.out.println(res);
	}
}
