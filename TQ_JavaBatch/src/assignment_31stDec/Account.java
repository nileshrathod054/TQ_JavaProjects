package assignment_31stDec;

public class Account {
	private String accName;
	private String accNumber;
	private double balance;

	public void insert(String accName, String accNumber, double balance) {
		this.accName = accName;
		this.accNumber = accNumber;
		this.balance = balance;
	}

	public void display() {
		System.out.println("Account Holder Name: " + accName);
		System.out.println("Account Number: " + accNumber);
		System.out.println("Balance: " + balance);
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount of " + amount + " has been deposited.");
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient balance.");
			return;
		}

		balance = balance - amount;
		System.out.println("Amount of " + amount + " has been withdrawn.");
	}

	public void checkBalance() {
		System.out.println("Current balance: " + balance);
	}

	public static void main(String[] args) {
		
		Account ac = new Account();
		ac.insert("Nilesh Rathod", "12344567", 25000);
		ac.display();
		ac.deposit(5000);
		ac.withdraw(2000);
		ac.checkBalance();
	}
}
