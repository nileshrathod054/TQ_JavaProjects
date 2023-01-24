package ifelse;

public class IfLadder {

	public static void main(String[] args) {
		int age=16;
		int weight=40;
		
		if(age>18)
		{
			if(weight>50)
			{
				System.out.println("Eligible to donate blood");
			}
			else
				System.out.println("under weight");
		}
		else
			System.out.println("age is not above 18");

	}
}
