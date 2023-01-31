package assignment_28thJanException;
class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String msg)
	{
		System.out.println(msg);
	}

}
public class Q11InsufficientBalanceException {
	public static void main(String[] args) {
		int acc[] = {1001,1002,1003,1004,1005};
		String name[] = {"Ram","Shyam","Payal","Pooja","Sonam"};
		int balance[] = {1000,2000,3000,999,5000};
		
		System.out.println("Account No.\tName\tBalance");
		for(int i=0;i<acc.length;i++)
		{
			System.out.println(acc[i]+"\t"+name[i]+"\t"+balance[i]);
			try {
				check(balance[i]);
			} catch (InsufficientBalanceException e) {
				System.out.println("Insufficient Balance");
				e.printStackTrace();
			}
		}
		
	}
	static void check(int bal) throws InsufficientBalanceException
	{
		if(bal < 1000)
		{
			throw new InsufficientBalanceException("Insufficient balance");
		}
	}
}


