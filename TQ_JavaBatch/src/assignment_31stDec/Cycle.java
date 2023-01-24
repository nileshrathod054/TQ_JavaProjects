package assignment_31stDec;

public class Cycle {
	int accountNo;
	int noOfWheels;

//Default constructor
	Cycle() {
		System.out.println("I am a default constructor.");
	}

//Parameterized constructor
	Cycle(int accountNo, int noOfWheels) {
		this();
		this.accountNo = accountNo;
		this.noOfWheels = noOfWheels;
		System.out.println("I am another constructor.");
	}

	void display() {
		System.out.println("Account number : " + accountNo);
		System.out.println("No of wheels : " + noOfWheels );
	}

	public static void main(String[] args) {
		Cycle c = new Cycle(1234, 4);
		c.display();
	}
}
