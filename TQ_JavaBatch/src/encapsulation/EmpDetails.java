package encapsulation;

public class EmpDetails {
	int id;
	String name;

	EmpDetails(int id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		return "EmpDetails [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		EmpDetails e = new EmpDetails(1, "Pooja");
		System.out.println(e);

	}

}
