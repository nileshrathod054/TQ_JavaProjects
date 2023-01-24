package abstraction;

interface LightBulbOn {
	void SwitchOn();
}

interface LightBulbOff {
	void SwitchOff();
}

public class LightBulb implements LightBulbOn,LightBulbOff {

	public void SwitchOn() {
		System.out.println("The light bulb is on");

	}

	public void SwitchOff() {
		System.out.println("The light bulb is off");

	}

	public static void main(String[] args) {
		LightBulb lb = new LightBulb();
		lb.SwitchOn();
		lb.SwitchOff();
	}
}
