package abstraction;

class Demo {
	public final int x = 10; // We can not change the value of final variables once its declared as final.

	public final void display() {
		System.out.println(x);
	}
}

//final class DemoChild extends Demo { // We can not override the final methods.
//	public void display() {
//		System.out.println("DemoChild class");
//		System.out.println(x);
//	}
//}

//class DemoChild1 extends DemoChild { // We can not extend the final class
//
//}

public class DemoMain {
	public static void main(String[] args) {

		Demo d = new Demo();
		d.display();
	}
}