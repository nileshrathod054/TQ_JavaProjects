package exception;

public class ExceptionEx1 {
	public static void main(String[] args) {
		int arr[] = { 1, 2 };
		try {
			System.out.println("The 10th value of aray is : " + arr[10]);
		} catch (Exception e) {
			System.out.println("The exception : " + e);
		}
	}
}
