package stackAndQueue;

import java.util.Stack;

public class CurrencyMain {

	public static void main(String[] args) {
		Currency c1 = new Currency(10, "Ten Ruppes", 887878);
		Currency c2 = new Currency(20, "Twenty Ruppes", 78787);
		Currency c3 = new Currency(50, "Fifty Ruppes", 65656);
		Currency c4 = new Currency(100, "Hudnred Ruppes", 878);

		Stack<Currency> st = new Stack<>();

		st.push(c1);
		st.push(c2);
		st.push(c3);
		st.push(c4);

		System.out.println(st);
		System.out.println("------");
		Currency cu = st.peek();
		System.out.println(cu);

		Currency cu1 = st.get(2);
		System.out.println(cu1);

	}

}
