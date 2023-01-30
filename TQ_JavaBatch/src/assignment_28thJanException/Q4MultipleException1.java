package assignment_28thJanException;

public class Q4MultipleException1 extends Exception {
	public static void main(String[] args) {
		try
		{
			int [] arr=new int [5];
			arr[10]=0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch( ArithmeticException e)
		{
		   e.printStackTrace();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Rest of the code");

	}
}
