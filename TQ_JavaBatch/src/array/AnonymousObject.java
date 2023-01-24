package array;

public class AnonymousObject {

	static void show(int[][] arr) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		// int arr[][]= {{1,2,3},{1,4,5}};
		show(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } });

	}

}
