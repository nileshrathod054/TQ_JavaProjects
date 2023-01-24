package encapsulation;

public class Owner {

	public static void main(String[] args) {
		Manager m1 = ManagerMain.display();
		System.out.println(m1.getM().getDay());

	}

}
