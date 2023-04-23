package practice;

public class Solution5 {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		first: {
			second: {
				third: {
					if (x == y >> 1) {
						break second;
					}
				}
				System.out.println(x);
			}
			System.out.println(y);
		}
	}
}
