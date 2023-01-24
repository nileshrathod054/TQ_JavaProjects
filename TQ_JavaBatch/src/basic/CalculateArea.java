package basic;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		//Area of circle 3.14f*r*r;
		
		//float r=3.7f;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius");
		float r=sc.nextFloat();
		
		float area=3.14f*r*r;
		
		System.out.println("Area of circle is  "+area);
	//	sc.close();

	}

}
