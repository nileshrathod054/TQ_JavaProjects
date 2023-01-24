package assignment_31stDec;

public class CalculateArea {

	void area(float side) {
		float sq = side * side;
		System.out.println("Area of Square is = " + sq);
	}

	void area(float length, float width) {
		float rect = length * width;
		System.out.println("Area of Rectangle is = " + rect);
	}

	public static void main(String[] args) {
		CalculateArea ar = new CalculateArea();
		ar.area(4);
		ar.area(10, 5);
	}
}
