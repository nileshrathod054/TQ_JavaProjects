package linkedlistEx;

import java.util.LinkedList;

public class LinkedListEx2 {
public static void main(String[] args) {
	LinkedList<String>ll=new LinkedList<>();
	System.out.println(ll);
	ll.add("sds");
	ll.add("sfdsfsd");
	ll.add("wew");
	System.out.println(ll);
	
	ll.addFirst("First Element");
	ll.addLast("Last element");
	ll.add(2, "New Element");
	System.out.println(ll);
	
	//Methods to remove
	ll.removeFirst();
	ll.removeLast();
	System.out.println(ll);
	
	//To access first element from LinkedList
	String firstelement=ll.element();
	System.out.println("First element "+firstelement);
	System.out.println("First Element "+ll.get(0));
	
	//getFirst(), element() NoSuchElementException if list is empty
	String ss=ll.get(0);//throws IndexOutOfBoundsException
	System.out.println("First element with get(0) : "+ll.get(0));
	
	System.out.println("Third element with get(2) : "+ll.get(2));
	
}
}
