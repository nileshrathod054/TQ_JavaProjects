package kamock;

public class RemoveDuplicates {
	public static void main(String[] args) {

		char arr[] = { 'a', 'b', 'b', 'n', 'u', 'y', 'x', 's', 'y' };
		int index = 0;
		int size = arr.length;
		int count;
		char[] antiduplicate = new char[size];
		int i, j;
		System.out.println("Before removing duplicate from the array");
		for (i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
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
				antiduplicate[index] = arr[i];
				index++;
			}
		}
		for (i = 0; i < index; i++) {
			arr[i] = antiduplicate[i];
		}
		System.out.println("\nAfter removing duplicate element");
		for (i = 0; i < index; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
