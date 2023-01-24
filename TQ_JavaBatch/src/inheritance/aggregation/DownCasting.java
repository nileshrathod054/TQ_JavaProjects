package inheritance.aggregation;

public class DownCasting {
	static Department d;
	public static void main(String[] args) {
		Object s = "hello";

		// Object s1=new Employee();

		String s1 = (String) s;
		System.out.println(s1);

		Object o1 = new Employee(1, "NR", d);
		Employee e3 = (Employee) o1;

	}

}
