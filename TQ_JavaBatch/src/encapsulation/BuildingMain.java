package encapsulation;

public class BuildingMain {

	static String b_name = "Sapna Residency";
	int flat_no;
	int no_of_members;

	static char wing;
	static {
		wing = 'A';
	}

	public BuildingMain(int flat_no, int no_of_members) {

		this.flat_no = flat_no;
		this.no_of_members = no_of_members;
	}

	void display() {
		System.out.println("wing is..." + wing);
		System.out.println("flat no is..." + flat_no);
		System.out.println("no of members..." + no_of_members);
	}

	static void gardenArea() {
		System.out.println("gardern area common to all residents");

	}

	public static void main(String[] args) {

		b_name = "Sapna Residency co.ltd";
		System.out.println("building name is...." + b_name);
		gardenArea();

		BuildingMain b1 = new BuildingMain(101, 3);

		b1.display();
		System.out.println(b1.flat_no);
		BuildingMain b2 = new BuildingMain(102, 4);
		b2.display();
		BuildingMain b3 = new BuildingMain(103, 2);
		b3.display();
		wing = 'C';
		BuildingMain b4 = new BuildingMain(104, 5);
		b4.display();

	}

}
