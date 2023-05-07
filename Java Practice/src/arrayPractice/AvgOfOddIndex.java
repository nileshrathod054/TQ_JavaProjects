package arrayPractice;

public class AvgOfOddIndex {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int oddSum = 0, oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				oddSum = oddSum + arr[i];
				oddCount++;
			}
		}
		int avg = oddSum / oddCount;
		System.out.println("Aerage of odd : "+avg);
	}
}
