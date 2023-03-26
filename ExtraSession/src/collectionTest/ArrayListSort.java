package collectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSort {
public static void main(String[] args) {
	Employee e1=new Employee(3,"Ajit");
	Employee e2=new Employee(4,"Suman");
	Employee e3=new Employee(2,"Radhika");
	Employee e4=new Employee(1,"Sameer");
	
	ArrayList<Employee>al=new ArrayList<>();
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	
	Collections.sort(al);
	
	Iterator<Employee>it=al.iterator();
	while(it.hasNext()) {
		Employee e=it.next();
		System.out.println(e);
	}
	
}
}
