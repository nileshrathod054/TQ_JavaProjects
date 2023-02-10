package arrayListCRUDoperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCRUDOperation {
	public static void main(String[] args) throws IOException {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Virat Kohli");
		al.add("Hardik Pandya");
		al.add("Rohit Sharma");
		al.add("K. L. Rahul");
		int choice = 0;

		do {
			System.out.println("Welcome to our platform..!!");
			System.out.println("0 : Display players list");

			System.out.println("1 : Add Player");
			System.out.println("2 : Remove Player");
			System.out.println("3 : Update Player");
			System.out.println("4 : Exit");
			System.out.println("Enter your choice");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());

			String name;
			int pos;
			switch (choice) {
			case 0:
				System.out.println("Players currently present in ArrayList are ");
				Iterator<String> it = al.iterator();
				while (it.hasNext()) {
					System.out.println(it.next() + " ");
				}
				break;
			case 1:
				System.out.println("Enter player name");
				name = br.readLine();
				System.out.println("Enter position in list");
				pos = Integer.parseInt(br.readLine());
				al.add(pos - 1, name);
				break;
			case 2:
				System.out.println("Enter player name to remove from the Arraylist");
				name = br.readLine();
				al.remove(name);
				break;
			case 3:
				System.out.println("Enter position in list to update the player name");
				pos = Integer.parseInt(br.readLine());
				System.out.println("Enter player name");
				name = br.readLine();
				al.set(pos - 1, name);
				break;
			default:
				System.out.println("Exit ");
				System.out.println("Thank you for visiting us..!!");
				return;
			}
		} while (choice !=4);
	}
}
