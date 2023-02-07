package arrayListEx;

class Bank {
	Loan applyLoan() {
		System.out.println("applying loan");
		return new Loan();
	}

}

class HDFC extends Bank {
	GoldLoan applyLoan() {
		System.out.println("Gold loan");
		return new GoldLoan();// 0x200

	}
}

public class BankMain {

	public static void main(String[] args) {
		Bank b = new HDFC();
		Loan l = b.applyLoan();

		System.out.println(l);

		Loan l1 = new GoldLoan();
		GoldLoan g = (GoldLoan) l1;
		System.out.println(g);

	}

}
