package ifelse;

public class GreatestNum {

	public static void main(String[] args) {
		int num1=134,num2=56,num3=89;
	/*	//System.out.println(num1);
		
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+" is greater");
		}
		
		else if(num2>num1 && num2>num3)
		{
			System.out.println(num2+" is greater");
		}
		
		else
			System.out.println(num3 +"is greater");*/
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println(num1+" is greater");
			}
			else
				System.out.println(num3+" is greater");
		}
		else
			if(num2>num3)
			{
				System.out.println(num2+" is greater");
			}
			else
				System.out.println(num3+" is greater");
		
		

	}
}
