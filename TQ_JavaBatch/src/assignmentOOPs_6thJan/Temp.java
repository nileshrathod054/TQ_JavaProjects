package assignmentOOPs_6thJan;

abstract class Abs1 {

	void doAbs1() {
		System.out.println("doAbs1 method of class Abs1");
	}
}

abstract class Abs2 {
	void doAbs2() {
		System.out.println("doAbs2 method of class Abs2");
	}
}

public class Temp extends Abs1 {
	// We can not extend multiple abstract classes simultaneously.
	public static void main(String[] args) {

		Abs1 ab = new Temp();
		ab.doAbs1();
	}
}
