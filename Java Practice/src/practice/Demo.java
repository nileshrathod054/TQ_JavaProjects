package practice;

public class Demo {
	static int a = 10;
	static int n;
	static int b = 5;
	static int c;
	{
		b = 30;
		n = 20;
	}
	static {
		a = 60;
	}

	public static void main(String[] args) {

		System.out.println(a + "," + b + "," + n + "," + c);
	}

}