package basic;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		int id;
		String name;
		float salary;
		String designation;
		
		Scanner sc=new Scanner(System.in);//0x1000
		System.out.println(sc);
		System.out.println("Enter id");
		 id=sc.nextInt();
		 System.out.println("Enter name");
		 name=sc.next();
		 System.out.println("Enter salary");
		 salary=sc.nextFloat();
		 System.out.println("Enter Designation");
		 designation =sc.next();
		
		System.out.println("customer id is,,"+id);
		System.out.println("customer name..."+name);
        System.out.println("customer salary.."+salary);
        System.out.println("customer designation.."+designation);
		
	}

}
