package stackAndQueue;

import java.util.Enumeration;
import java.util.Stack;

public class Stack_Integer {

	public static void main(String args[]) {

		Stack<Integer> st = new Stack<>();

		st.add(10);
		st.addElement(20);
		st.push(30);

		System.out.println(st);

		System.out.println(st.pop());

		System.out.println(st);

		System.out.println(st.peek());
		System.out.println(st);

		Enumeration<Integer> en = st.elements();

		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

	}
}
