package loops;

public class OddSum_145_To_200 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 145; i <= 200; i++) {
			if (i % 2 == 1) {
				// System.out.println(i);
				sum = sum + i;

			}

		}
		System.out.println(sum);

	}
}
