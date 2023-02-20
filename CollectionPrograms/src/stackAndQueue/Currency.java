package stackAndQueue;

public class Currency {

	int number;
	String name;
	int serial_no;

	public Currency(int number, String name, int serial_no) {
		super();
		this.number = number;
		this.name = name;
		this.serial_no = serial_no;
	}

	@Override
	public String toString() {
		return "Currency [number=" + number + ", name=" + name + ", serial_no=" + serial_no + "]";
	}

}