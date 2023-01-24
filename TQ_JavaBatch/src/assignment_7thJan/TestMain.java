package assignment_7thJan;

import java.util.Scanner;

class Person {
	private String name;
	private char gender;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getGender() {
		return gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

class Busticket {
	private int ticketNo;
	private float ticketPrice;
	private float totalAmount;
	Person person;
	float dis;
	char gender = 'f';
	float x, y;

	public void setX(float x) {
		this.x = x;
	}

	public float getX() {
		return x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getY() {
		return y;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public int getticketNo() {
		return ticketNo;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void calculateTotal() {
		Scanner sc = new Scanner(System.in);
		Busticket b = new Busticket();
		Person p = new Person();
		System.out.println("Enter the Gender (M or F)");
		p.setGender(sc.next().charAt(0));
		System.out.println("Enter the Age");
		p.setAge(sc.nextInt());
		System.out.println("Enter Ticket No");
		b.setTicketNo(sc.nextInt());
		System.out.println("Enter the Ticket Price");
		b.setTicketPrice(sc.nextInt());
		if (p.getAge() <= 16) {
			dis = 0.5f;
			x = b.getTicketPrice() * dis;
		} else if (p.getAge() >= 60) {
			dis = 0.25f;
			x = b.getTicketPrice() * dis;
		} else if (p.getGender() == gender) {
			dis = 0.1f;
			x = b.getTicketPrice() * dis;
		} else {
			System.out.println("No Discount Available");
		}

		y = totalAmount = b.getTicketPrice() - x;
		x = b.getTicketPrice();

	}
}

public class TestMain {
	public static void busTicket_getTicketDetails() {
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		System.out.println("Enter Passenger Name");
		p.setName(sc.next());
		Busticket b = new Busticket();
		b.calculateTotal();

		System.out.println("Ticket No :" + b.getticketNo());
		System.out.println("Passenger Name :" + p.getName());
		System.out.println("Price of a Ticket :" + b.getX());
		System.out.println("Total Amount :" + b.getY());
	}

	public static void main(String[] args) {
		busTicket_getTicketDetails();
	}
}
