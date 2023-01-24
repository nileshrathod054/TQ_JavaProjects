package arrayAssignment;

public class Q6_SumAndProdOfArrEle {

	public static void main(String args[]) {

		int arr[] = { 1, 2, 3, 4, 5 };

		int sum = 0, prod = 1;

		for (int x : arr) {

			sum = sum + x;

			prod = prod * x;

		}

		System.out.println("Sum of all array elements: " + sum);

		System.out.println("Product of all array elements: " + prod);

	}

}
