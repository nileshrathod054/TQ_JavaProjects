package markerInterface.Serializable;

//custom marker interface
interface Car {

}

//custom marker interface
interface Engine {

}

//class that implements the car marker interface
class Vehicle implements Car {
	static void isVehicle() {
		System.out.println("Car is a vehicle");
	}
}

//class that implements the engine marker interface
class Status implements Engine {
	static void isWorking() {
		System.out.println("Yes, Engine is working");
	}
}

//main class
public class CustomMarkerInterfaceEx {
//invoking the methods of the class
	public static void main(String[] args) {
		Vehicle.isVehicle();
		Status.isWorking();
	}
}
