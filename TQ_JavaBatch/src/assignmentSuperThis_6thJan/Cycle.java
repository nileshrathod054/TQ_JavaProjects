package assignmentSuperThis_6thJan;

public class Cycle {

	int accountNo;
	int noOfWheels;

	// Default constructor
	Cycle() {
		System.out.println("I am a default constructor.");
	}

	// Parameterized constructor
	Cycle(int accountNo, int noOfWheels) {
		this();
		this.accountNo = accountNo;
		this.noOfWheels = noOfWheels;
		System.out.println("I am another constructor");
	}

	public static void main(String[] args) {
		 Cycle c1=new Cycle();

// When we create an object of a class the default constructor gets called
// automatically.
		Cycle c2 = new Cycle(235476, 2);

	}
}
