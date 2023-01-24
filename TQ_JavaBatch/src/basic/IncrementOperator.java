package basic;

public class IncrementOperator {

	public static void main(String[] args) {

		int a = 10;

		int b = 4;
		int x = a++;
		System.out.println("Post Increment");

		System.out.println(x);

		System.out.println(a);

		System.out.println("****************");

		int x1 = ++a;

		System.out.println("Pre Increment");

		System.out.println(x1);
		System.out.println(a);

		int x2 = a++ + ++b * b + --a;
		System.out.println(x2);
	}

}
