package mock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 6; i++) {
			al.add(sc.nextInt());
		}
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			
			int num = it.next();
			if (num % 2 == 0) {
				
				it.remove();
			}else
				System.out.print(num+" ");
		}
	}
}
