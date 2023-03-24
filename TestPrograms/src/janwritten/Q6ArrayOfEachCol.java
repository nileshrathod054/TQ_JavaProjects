package janwritten;

import java.util.Arrays;

public class Q6ArrayOfEachCol {
	public static void main(String[] args) {

		int[][] nums = { { 2, 4, 9, 7 }, { 6, 5, 3, 10 }, { 7, 3, 6, 4 } };
		System.out.println(Arrays.toString(averageColumns(nums)));
	}

	static int[] averageColumns(int matrix[][]) {
		int max = matrix[0].length;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i].length > max) {
				max = matrix[i].length;
			}
		}

		int i, j;
		int[] average = new int[max];
		for (i = 0; i < average.length; i++) {
			int sum = 0;
			int count = 0;
			for (j = 0; j < matrix.length; j++) {
				if (matrix[j].length - 1 >= i) {
					sum += matrix[j][i];
					count++;
				}
			}
			average[i] = sum / count;
		}
		return average;
	}
}
