package class_object;

public class ObjectClass {
	void add(Object... a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		ObjectClass o = new ObjectClass();
		o.add(1, "Hello", true);
	}
}
