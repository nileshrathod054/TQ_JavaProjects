package assignment_31stDec;

public class ThisKeyword {
	int id;
	String name;
	Long mo_no;
	String address;

	ThisKeyword() {

	}

	ThisKeyword(int id, String name, Long mo_no, String address) {
		this();
		this.id = id;
		this.name = name;
		this.mo_no = mo_no;
		this.address = address;
		System.out.println("this keyword with parameterized constructor");
	}

	void display() {

		System.out.println("Id = " + id + "  \nName =" + name + " \nMo. No =" + mo_no + "\nAddress = " + address);
	}

	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword(1, "Nilesh", 8605709787L, "Amravati");
		tk.display();
	}
}
