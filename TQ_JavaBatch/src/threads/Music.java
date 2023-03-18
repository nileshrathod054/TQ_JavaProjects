package threads;

import java.util.Scanner;

public class Music extends Thread {
	public void run()// Running
	{
//		while(true)
//		{
//			String s=Thread.currentThread().getName();
//			System.out.println(s+ "is playing");
//			System.out.println("do you want to continue");
//			Scanner sc=new Scanner(System.in);
//			String ans=sc.next();
//			if(ans.equals("false"))
//			{
//				break;
//			}
//			else
//				continue;
//		}

		for (int i = 0; i < 3; i++) {
			String s = Thread.currentThread().getName();
			System.out.println(s + "is playing");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Music m = new Music();// new
		m.setName("Jazz Music");
		m.start();// Runnable
		Music m1 = new Music();
		m1.setName("classical Music");
		m1.start();

	}

}
