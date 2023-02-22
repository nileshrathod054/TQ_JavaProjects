package assignmentOnMapStackAndArrayList18thFeb;

import java.util.Stack;

public class Q2StackEx {
	int size;
	int arr[];
	int top;

	Q2StackEx(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public void push(int pushedElement) {
		if (!isFull()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed Element : " + pushedElement);
		} else {
			System.out.println("Stack is Full..!");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped Element : " + arr[returnedTop]);
			return arr[returnedTop];
		} else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}

	public int peek() {
		if (!this.isEmpty()) {
			return arr[top];
		} else {
			System.out.println("Stack is Empty");
			return -1;

		}
	}

	public static void main(String[] args) {
		Q2StackEx st = new Q2StackEx(10);
		st.pop();
		System.out.println("====================");
		st.push(10);
		st.push(30);
		st.push(50);
		st.push(40);
		System.out.println("====================");
		st.pop();
		st.pop();
		System.out.println("====================");
	}
}
