package practice;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int index = 0;
		char[] arr = {'a','b','b','n','u','y','x','s','y'};
		int size = arr.length;
		int count;
		char[] anti_dup = new char[size];
		int i, j;
		System.out.println("Before removing duplicate from the array:");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

		for (i = 0; i < size; i++) {
			count = 0;
			for (j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					count = count + 1;
					break;
				}

			}
			if (count == 0) {
				anti_dup[index] = arr[i];
				index++;
			}
		}

		for (i = 0; i < index; i++) {
			arr[i] = anti_dup[i];
		}
		System.out.println("\nAfter removing duplicate from the array");
		for (i = 0; i < index; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
