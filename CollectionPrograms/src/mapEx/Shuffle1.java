package mapEx;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle1 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(67);
		al.add(789);
		al.add(45);
		
		Collections.shuffle(al);
		
		System.out.println(al);
		
	}

}
