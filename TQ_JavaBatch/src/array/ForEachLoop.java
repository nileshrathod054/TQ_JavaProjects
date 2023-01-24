package array;

public class ForEachLoop {

	public static void main(String[] args) {
		int arr[] = { 34, 45, 67, 39, 56 };

		System.out.println("--forward---");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("--backward---");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

		// for each loop->collection
		// for(datatype_variablename: collection)
		System.out.println("-- frowrd----");
		for (int a : arr) {
			System.out.println(a);
		}

	}

}
