package mock;

//Find the duplicate values in two arrays
public class DupEleInTwoArrays {
	public static void main(String[] args) {

		int arr1[] = { 4, 7, 3, 9, 2 };
		int arr2[] = { 3, 2, 12, 9, 4 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}
}
