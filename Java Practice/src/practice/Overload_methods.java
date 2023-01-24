package practice;

class overload {
	int x;
	int y;

	void add(int a) {
		x = a + 1;
	}

	void add(int a, int b) {
		x = a + 2;
	}
}

class Overload_methods {
	public static void main(String[] args) {
		overload obj = new overload();
		int a = 0;
		obj.add(6);
		System.out.println(obj.x);
	}
}
