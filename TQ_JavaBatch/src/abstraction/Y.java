package abstraction;

interface X {
	void methodX();
}

class Y implements X {
	public void methodX() {
		System.out.println("Method X");
	}

	public static void main(String[] args) {
		Y y = new Y();
		y.methodX();
	}
}
