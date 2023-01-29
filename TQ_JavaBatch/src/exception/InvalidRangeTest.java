package exception;

public class InvalidRangeTest {
	public static void main(String[] args)  {
		InvalidRange r=new InvalidRange();
		
		try {
			r.check(999999);
		} catch (InvalidRange e) {
			System.out.println("handled");
		}
		
		System.out.println("rest of the code");
		
		InvalidRange1 r1=new InvalidRange1();
		r1.check(9999999);
	}
}
