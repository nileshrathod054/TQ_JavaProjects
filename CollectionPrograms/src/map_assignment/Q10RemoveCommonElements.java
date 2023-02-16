package map_assignment;

public class Q10RemoveCommonElements {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 1, 2, 7, 8, 9 };

		
		int size = arr1.length + arr2.length;

		int[] result = new int[size];

		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			boolean found = false;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					found = true;
					break;
				}
			}

			if (!found) {
				result[count++] = arr1[i];
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			result[count++] = arr2[i];
		}

		
		System.out.println("The new array after removing common elements is : ");
		for (int i = 0; i < count; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
