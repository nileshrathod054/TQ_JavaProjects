package string;

public class ReverseWithStringBuffer {

	public static void main(String[] args) {
		String s = "hello";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();

		System.out.println(sb);

	}

}
