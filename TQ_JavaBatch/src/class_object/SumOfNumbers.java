package class_object;

public class SumOfNumbers {
	int sum = 0;

	int sum1() {

		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfNumbers s = new SumOfNumbers();
		System.out.println(s.sum1());
	}
}