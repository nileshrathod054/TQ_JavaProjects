package assignmentOnMapStackAndArrayList18thFeb;

import java.util.ArrayList;
import java.util.Collection;

/*

Clear()
The clear() method is used to remove all elements from a Collection. 
This method does not take any parameter and does not return any value.

RemoveAll()
The removeAll() method is used to remove all elements that are contained in a specified collection from 
the current collection. 
This method takes a Collection as a parameter and returns a boolean value.
*/
public class Q10ClearAndRemoveAllMethods {
	public static void main(String args[]) {

		Collection<String> c = new ArrayList<String>();
		c.add("A");
		c.add("B");
		c.add("C");
		System.out.println("Elements in Collection: " + c);
		// Clear all elements from the Collection
		c.clear();
		System.out.println("After using clear methodElements in Collection: " + c);
		
		Collection<String> c1 = new ArrayList<String>();
		c1.add("Mobile");
		c1.add("Laptop");
		c1.add("TV");
		System.out.println("Elements in Collection : "+c1);
	
		Collection<String> c2 = new ArrayList<String>();
		c2.add("Mobile");
		c2.add("TV");
		// Remove all elements from c that are present in c1
		boolean result = c1.removeAll(c2);
		System.out.println("Elements in Collection: " + c1);
		System.out.println("Removed element from Collection: " + result);
	}
}
