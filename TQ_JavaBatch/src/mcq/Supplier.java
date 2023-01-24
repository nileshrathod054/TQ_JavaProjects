package mcq;

public class Supplier {
String name="Mr suresh";
	
	
	
	void calculate(int quantity)
	{           //ox200
		Book b1=BookMain.showDetails();
		
		int total_bill=quantity*b1.getPrice();
		System.out.println("your total bill is..."+total_bill);
	}

	public static void main(String[] args) {
		
		Supplier s=new Supplier();
		s.calculate(10);

	}

}
