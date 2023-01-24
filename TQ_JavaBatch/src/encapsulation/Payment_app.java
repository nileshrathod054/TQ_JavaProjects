package encapsulation;

public class Payment_app {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setC_id(1000001);
		c.setBalance(20000);
		c.setAcc_no(12335);

		System.out.println(c.getC_id());
		System.out.println(c.getBalance());
		System.out.println(c.getAcc_no());

		int x = c.getBalance() - 2000;
		c.setBalance(x);
		System.out.println("Amount debited");
		System.out.println("Current balance is.." + c.getBalance());
	}
}
