package abstraction;

interface Tax {
	public static final int a = 10;

	public abstract void payTax();
}

interface Loan {
	void loanFacility();
}

class Employee implements Tax, Loan {
	@Override
	public void payTax() {
		System.out.println("Employee paying tax");

	}

	@Override
	public void loanFacility() {
		System.out.println("Employee uses the loan facility");
	}

}

class Politician implements Tax {
	@Override
	public void payTax() {
		System.out.println("Politiciaan paying tax");

	}

}

public class InterfaceMain {
	public static void main(String[] args) {
		Tax t;

		t = new Employee();
		t.payTax();
		t = new Politician();
		t.payTax();
	}
}
