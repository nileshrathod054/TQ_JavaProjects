package marchWritten;

//8.	What is the output of the program [0.5M]
class Test1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Hi");
	}

}

public class Q8MainClassLevel {
	public static void main(String[] args) {
		Test1 th = new Test1();

		th.start();
		System.out.println("Main");
	}
}
