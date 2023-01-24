package abstraction;

abstract class Mobile {
	static String name = "Samsung";
	int price = 3000;

	Mobile(String color) {
		System.out.println("Constructor called.");
	}

	public void frontCamera() {
		System.out.println("Mobile with front camera.");
	}

	public void frontFlash() {

		System.out.println("Mobile with front flash.");
	}
}

class CameraWithFlash extends Mobile {
	CameraWithFlash(String color) {
		super(color);
	}

	@Override
	public void frontFlash() {
		System.out.println("Providing functionality");
		;
		System.out.println("Providing 5 mega pixel camera with flash option");
	}
}

public class CameraMain {
	public static void main(String[] args) {
		Mobile m = new CameraWithFlash("Silver");
		m.frontCamera();
		m.frontFlash();
	}
}
