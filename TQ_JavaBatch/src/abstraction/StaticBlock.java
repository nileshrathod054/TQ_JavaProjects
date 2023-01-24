package abstraction;

public class StaticBlock {

	{
		System.out.println("Hello Everyone");
	}
	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {
		StaticBlock s = new StaticBlock();

	}

}
