package encapsulation;
//POJO (Plain old java object)
public class Customer {

	private int c_id;
	private int balance;
	private int acc_no;

	// setter for customer_id
	public void setC_id(int c) {
		c_id = c;
	}

	// getter for customer_id
	public int getC_id() {
		return c_id;
	}

	// setter for balance
	public void setBalance(int b) {
		balance = b;
	}

	// getter for balance
	public int getBalance() {
		return balance;
	}

	// setter for Account no
	public void setAcc_no(int a) {
		acc_no = a;
	}

	// getter for Account no
	public int getAcc_no() {
		return acc_no;
	}
}
