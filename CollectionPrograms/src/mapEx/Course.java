package mapEx;

public class Course implements Comparable<Course> {

	String c_name;
	int price;

	public Course(String c_name, int price) {
		super();
		this.c_name = c_name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Course [c_name=" + c_name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Course o) {
		if (this.price > o.price)
			return 1;
		else if (this.price < o.price)
			return -1;
		return 0;
	}

}
