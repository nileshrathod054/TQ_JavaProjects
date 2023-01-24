package loops;

public class FabonacciSeries {

	public static void main(String[] args) {
		int num = 34652;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			int flag = 0;
			for (int i = 2; i < rem; i++) {
				if (rem % i == 0) {
					flag = 1;
				}
			}
			num = num / 10;
			if (flag == 0) {
				System.out.println(rem);
				if (flag == 0) {
					sum =sum+ rem;
					System.out.println(sum);
				}

			}
		}

	}
}
