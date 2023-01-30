package assignment_28thJanException;

public class Q5ReturnInTryBlock {
	public static int div(int x, int y) {
		try {
			int div = x / y;
			return div;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			int z = 89;
			return z;
		}

	}

	public static void main(String[] args) {
		//System.out.println(div(20, 5));
		System.out.println(div(20,0));
		System.out.println("Rest of the code");

	}
}
