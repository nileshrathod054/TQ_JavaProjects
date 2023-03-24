package marchWritten;
//3.Print 1 2 3 4 5 one below the other but using recursive method only  1 2 3 4 5
public class Q3RecursiveMethod {
	public static void main(String[] args) {

		print(1);
	}

	public static void print(int num) {
		if (num <= 5) {
			System.out.println(num);
			print(num +1);
		}
	}

}
