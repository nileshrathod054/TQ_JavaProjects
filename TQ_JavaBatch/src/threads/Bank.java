package threads;

import java.util.Scanner;

class Husband implements Runnable {
	Thread t;
	Bank b;// 0x200

	Husband(Bank b)// 0x200
	{
		this.b = b;
		t = new Thread(this, "husbandthread");
		t.start();

	}

	@Override
	public void run() {
		try {
			b.deposit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Wife implements Runnable {

	Thread t;
	Bank b;// 0x200

	Wife(Bank b)// 0x200
	{
		this.b = b;
		t = new Thread(this, "wifethread");
		t.start();

	}

	@Override
	public void run() {
		try {
			b.withdraw();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

public class Bank {

	private int balance = 20000;
	private int depamount;
	private int withamount;

	public int deposit() throws InterruptedException {
		System.out.println("welcome to kuber bank;");
		synchronized (this) {
			Scanner sc = new Scanner(System.in);
			System.out.println("balance before deposit..." + balance);

			Thread.sleep(1000);
			System.out.println("enter new amount to be deposited");
			depamount = sc.nextInt();
			balance = balance + depamount;
			Thread.sleep(1500);
			System.out.println("Balance after deposit..." + balance);
			return balance;
		}
	}

	public int withdraw() throws InterruptedException {
		System.out.println("welcome to kuber bank ");
		synchronized (this) {
			Scanner sc = new Scanner(System.in);
			System.out.println("balance before withdraw..." + balance);

			Thread.sleep(1000);
			System.out.println("enter new amount you want to withdraw");
			withamount = sc.nextInt();
			balance = balance - withamount;
			Thread.sleep(1500);
			System.out.println("Balance after withdraw..." + balance);
			return balance;
		}
	}

	public static void main(String[] args) {
		Bank b = new Bank();
		Husband h = new Husband(b);
		Wife w = new Wife(b);

	}
}
