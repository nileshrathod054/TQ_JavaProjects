package inheritance.multilevel;

class Car {
	String model_name;
	int price;
	int speed;

	Car(String model_name, int price, int speed) {
		this.model_name = model_name;
		this.price = price;
		this.speed = speed;
	}

	public String toString() {
		return "Model name" + model_name + "\n" + "price is" + price + "\n" + "Speed is" + speed;
	}
}

class Honda extends Car {
	String music_player = "Available";

	Honda() {
		super("Honda", 300000, 120);
	}

	public String toString() {
		System.out.println(super.toString());
		return "Music Player" + music_player;
	}
}
 
class Honda5 extends Honda {
	String bluetoothSystem = "Available";
	String automatic_gearing = "Available";

	public String toString() {
		System.out.println(super.toString());
		return "Bluetooth System" + bluetoothSystem + "Automatic Gearing" + automatic_gearing;
	}

}

public class SuperConstructor {
	public static void main(String[] args) {
		Honda5 h = new Honda5();
		System.out.println(h);
	}
}
