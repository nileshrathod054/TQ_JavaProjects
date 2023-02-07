package arrayListExtraAssignment;

import java.util.ArrayList;

public class Days {
	 public static void main(String[] args) 
	    { 
	        // creating an ArrayList 
	        ArrayList<String> list = new ArrayList<String>(); 
	  
	        // Adding elements 
	        list.add("Monday"); 
	        list.add("Tuesday"); 
	        list.add("Wednesday"); 
	        list.add("Thursday");
	        list.add("Friday"); 
	        list.add("Saturday"); 
	        list.add("Sunday"); 
	  
	        // Iterate through the list 
	        for (int i = 0; i < list.size(); i++) { 
	            if (list.get(i).length() > 7) 
	                list.remove(i); 
	        } 
	  
	        // print ArrayList 
	        System.out.println("ArrayList after removing elements: " + list); 
	    } 
}
