package collectionTest;

import java.util.HashMap;

public class Demo {
	public static void main(String[] args) {
		String s2 = new String("Vijay");
		String s3 = s2.intern();
		//System.out.println(s2 == s3);
		
		
		HashMap hm=new HashMap();
		hm.put(12, "Pune");
		hm.put(15,"Nashik");
		hm.put(16, "Nagar");
		System.out.println(hm.put(13, "Mumbai"));
	}
}
