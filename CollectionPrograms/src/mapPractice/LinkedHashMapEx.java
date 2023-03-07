package mapPractice;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapEx {
public static void main(String[] args) {
	Map<Integer, String>m=new LinkedHashMap<>();
	m.put(23, "Kavita");
	m.put(24, "Lalit");
	m.put(45, "Kishore");
	m.put(89, "Gitanjali");
	m.put(45, "Rachit");
	
	System.out.println("LinkedHashMap keys and Values : "+m);
	
	String s=m.get(24);
	System.out.println("Value of key 24 is : "+s);
	
	System.out.println("Iterating LinedHashMap using keySet()");
	Set<Integer>st=m.keySet();
	Iterator<Integer>i1=st.iterator();
	
}
}
