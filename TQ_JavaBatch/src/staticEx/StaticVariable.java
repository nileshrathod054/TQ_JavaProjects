package staticEx;

public class StaticVariable {

	int i = 1;

	void display() {
		i++;
	}

	public static void main(String[] args) {
		StaticVariable s = new StaticVariable();
		System.out.println(s.i);
		s.display();
		System.out.println(s.i);
		System.out.println("------2 object");
		StaticVariable s2 = new StaticVariable();

		s2.display();
		System.out.println(s2.i);
		s2.display();
		System.out.println("------3 object");

		StaticVariable s3 = new StaticVariable();
		s3.display();

		System.out.println(s3.i);
	}

}
