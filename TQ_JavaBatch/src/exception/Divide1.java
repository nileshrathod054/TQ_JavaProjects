package exception;

import java.util.Scanner;

public class Divide1 {

	void check(int num1, int num2) {

		int res = 0;
		try {
			int arr[] = { 1, 2, 3, 4 };

			System.out.println(arr[2]);

			res = num1 / num2;

		}

//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("you are going out of range");
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("Divididng by zero");
//		}

		/*
		 * catch(IndexOutOfBoundsException e) {
		 * System.out.println("you are going out of range"); }
		 */
		catch (IndexOutOfBoundsException | ArithmeticException e) {
			/*
			 * Class c=e.getClass(); String s=c.getName(); //System.out.println(s);
			 * if(s.equals("java.lang.ArithmeticException")) {
			 * System.out.println("Divide by zero");
			 * 
			 * } else if(s.equals("java.lang.ArrayIndexOutOfBoundsException")) {
			 * System.out.println("You are going out of range");; }
			 */

			System.out.println("Error Occured");

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 st number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt();
		Divide1 d = new Divide1();

		d.check(num1, num2);

		System.out.println("rest of the code");

	}

}
