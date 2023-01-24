package inheritance.aggregation;

import java.util.Scanner;

public class SupplierMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter supplier id : ");
		int id = sc.nextInt();
		System.out.println("Enter supplier name : ");
		String i_name = sc.next();
		System.out.println("Enter item price : ");
		int price = sc.nextInt();
		Supplier s = new Supplier();
		s.setS_id(id);
		s.setS_name(i_name);
		Item i = new Item();
		s.setI(i);
		s.getI().setPrice(price);
		
		System.out.println("Supplier id...." + s.getS_id());
		System.out.println("Supplier name...." + s.getS_name());
		System.out.println("Item name....." + s.getI().getI_name());
		System.out.println("Item price is....." + s.getI().getPrice());

	}
}
