package hashMapEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortingCourseValues {

	public static void main(String[] args) {
		HashMap<Student,Course> hs=new HashMap();
		LinkedHashMap<Student,Course> hs1=new LinkedHashMap();
		ArrayList<Course> al=new ArrayList<Course>();
		Student s1=new Student(1,"pooja");
		Student s2=new Student(2,"ram");
		Student s3=new Student(3,"alex");
		Student s4=new Student(4,"bob");
		
		Course c1=new Course("Software",40000);
		Course c2=new Course("Machine",45000);
		Course c3=new Course("hardware",30000);
		
		
		hs.put(s1, c1);
		hs.put(s2, c2);
		hs.put(s3, c1);
		hs.put(s4, c3);
		
		//1 st step we have to find out values and put in arraylist
		
	Collection<Course> col=	hs.values();
	
	Iterator<Course> it=   col.iterator();
	
	while(it.hasNext())
	{
		  Course c=   it.next();
		  al.add(c);
	}
	Collections.sort(al);
	System.out.println(al);
	
	
	Iterator<Course> it1=al.iterator();
	while(it1.hasNext())
	{
		Course c=it1.next();
		
		Set<Entry<Student,Course>> set=hs.entrySet();
		
		for(Map.Entry<Student, Course> map:set)
		{
			Course co=map.getValue();
			
			if(c.price==co.price)
			{
				Student st1=map.getKey();
				hs1.put(st1, c);
				
			}
		}
	}
	System.out.println("----");
	System.out.println(hs1);

	}

}
