package wrapperClasses;

public class ChangingValue {
//	int a1 = 10;
//	void add(  ChangingValue cv)
//	{
//		this.a1=this.a1+10;
//		System.out.println(a1);
//	}
//
//	public static void main(String[] args) {
//		
//		ChangingValue c=new ChangingValue();
//		
//		c.add(c);
//		System.out.println(c.a1);
//	}

	int a1 = 10;

	void add(int a1) {
		this.a1 = this.a1 + 10;
		System.out.println(this.a1);
	}

	public static void main(String[] args) {

		ChangingValue c = new ChangingValue();

		c.add(10);
		System.out.println(c.a1);
	}
}
