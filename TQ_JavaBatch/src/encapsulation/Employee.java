package encapsulation;

public class Employee {

	public String e_name = "Nilesh";
	protected String mo_no = "7507249988";
	String email_id = "nrghdk@gmail.com";
	private String verification_code = "1234";

	public Employee() {

	}

	public Employee(String n, String m, String em, String ve) {
		e_name = n;
		mo_no = m;
		email_id = em;
		verification_code = ve;

	}

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.verification_code);
	}
}
