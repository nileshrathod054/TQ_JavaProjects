package ifelse;

import java.util.Scanner;

public class MarksGrade {

	public static void main(String[] args) {
		float Physics, Chemistry, Mathematics, Biology, English;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Physics marks");
		Physics = sc.nextFloat();
		System.out.println("Enter Chemistry marks");
		Chemistry = sc.nextFloat();
		System.out.println("Enter Mathematics marks");
		Mathematics = sc.nextFloat();
		System.out.println("Enter Biology marks");
		Biology = sc.nextFloat();
		System.out.println("Enter English marks");
		English = sc.nextFloat();

		// Marks of the five subjects
//
//		float Physics = 30;
//		float Chemistry = 38;
//		float Mathematics = 35;
//		float Biology = 38;
//		float English = 35;

		// Calculate the total, average and percentage

		float totalMarks = Physics + Chemistry + Mathematics + Biology + English;

		System.out.println("Total Marks obtained = " + totalMarks);

		float avgMarks = totalMarks / 5;

		System.out.println("Average of total Marks obtained = " + avgMarks);
		float percentage = (totalMarks / 500) * 100;
		System.out.println("Total Percentage obtained = " + percentage);

		// Grades

		if (percentage >= 90) {

			System.out.println("Grade: A+");
		} else if (percentage >= 80 && percentage < 90) {

			System.out.println("Grade: A");
		} else if (percentage >= 70 && percentage < 80) {

			System.out.println("Grade: B+");
		} else if (percentage >= 60 && percentage < 70) {

			System.out.println("Grade: B");
		} else if (percentage >= 50 && percentage < 60) {

			System.out.println("Grade: C+");
		} else if (percentage >= 40 && percentage < 50) {

			System.out.println("Grade: C");
		} else if (percentage >= 35 && percentage < 40) {

			System.out.println("Grade: D");
		} else

			System.out.println("Fail");

	}

}
