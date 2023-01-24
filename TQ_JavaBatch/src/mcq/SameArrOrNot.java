package mcq;

public class SameArrOrNot {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 1, 2, 3 };
		if (arr1 == arr2)
			System.out.println("Same");
		else
			System.out.println("Not same"); //Not same because there memory address are different

	}
}
