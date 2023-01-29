package exception;

public class Finally1 {
	public static void main(String[] args) {
		int x = 0;
		try {
			int res = 12 / x;
			
		} catch (Exception e) {
			System.out.println("Handled");
	
		} 
		
		finally {
			System.out.println("Code handled");
			
		}
	}
}
