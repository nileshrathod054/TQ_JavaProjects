package assignement_27thDec;

 class VolumeCalculator {

	double calculateVolume(double radius, double height) {
		return (3.14 * radius * radius * height);
	}

	double calculateVolume(int length, int breadth, int height) {
		return length * breadth * height;
	}
}
