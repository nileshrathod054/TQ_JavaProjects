package exception;

public class NotEligibleToVote extends Exception {
	void check(int age) throws NotEligibleToVote {
		if (age < 18) {
			throw new NotEligibleToVote();

		}
	}

	public static void main(String[] args) {
		NotEligibleToVote n = new NotEligibleToVote();
		try {
			n.check(16);
		} catch (NotEligibleToVote e) {
			e.printStackTrace();
		}
	}

}
