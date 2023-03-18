package accenture;

public class HeadTails {
	public static int minCoinsReversed(int[] coins) {
		int count = 0;
		int current = coins[0];
		for (int i = 1; i < coins.length; ++i) {
			if (coins[i] == current) {
				count++;
			}
			current = coins[i];
		}
		return count;
	}

	public static void main(String[] args) {
		int[] coins = { 0,1,1,0};
		System.out.println(minCoinsReversed(coins));
	}
}
