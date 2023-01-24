package encapsulation;

public class ManagerMain {

	static Manager display() {
		MyDate m = new MyDate();// 0x200

		Manager m1 = new Manager();// 0x500
		m1.setM(m);// 0x200
		// m1.getM();//0x200

		m1.setM_id(1001);
		m1.setM_name("Mrs komal");
		m1.getM().setDay(23);
		m1.getM().setMonth(11);
		m1.getM().setYear(2015);

		System.out.println("manager id is.." + m1.getM_id());
		System.out.println("manager name is.." + m1.getM_name());

		System.out.println("hire date is" + m1.getM());

		return m1;

	}
}
