package test1;

public class Main {
	public static void main(String[] args) {
		int firstInt = 3;
		int secondInt = 6;
		int thirdInt = 7;

		String str = "";
		if ((firstInt + secondInt) >= (firstInt + thirdInt)) {
			firstInt++;
			str = "ab";
			secondInt--;
		} else if ((firstInt + secondInt + thirdInt) >= 14) {
			thirdInt++;
			str = "cd";
		}
		System.out.println(thirdInt + str);
	}
}
