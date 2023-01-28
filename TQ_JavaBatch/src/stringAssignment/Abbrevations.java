package stringAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Abbrevations {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your full name----> First Name first");
		String name = br.readLine();
		String copy[] = name.split(" ");
		String firstName = copy[0];
		String secondName = copy[1];
		String thirdName = copy[2];
		for (int i = 0; i < copy.length; i++) {
			if (copy[i] == firstName) {
				System.out.print(firstName.charAt(0) + ".");
			}
			if (copy[i] == secondName) {
				System.out.print(secondName.charAt(0) + ".");
			}
			if (copy[i] == thirdName) {
				System.out.print(copy[i]);
			}
		}
	}
}
