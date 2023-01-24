package com.dao;

import com.pojo.Book;
import com.pojo.Branch;

public class BookDetails {
	
	
	public static Branch showElectrical()
	{
		 Book book[]=new Book[3];
	book[0]=new Book(1,"Network Analysis",350,3);
	book[1]=new Book(2,"BEDC",300,4);
	book[2]=new Book(3,"DSP",400,3);
	 Branch b=new Branch("Electrical",book);
	 
	
	return b;
	}
	
	public static Branch showIT()
	{ Book book[]=new Book[4];
	
	book[0]=new Book(1,"c",350,3);
	book[1]=new Book(2,"c++",300,4);
	book[2]=new Book(3,"java",400,3);
	book[3]=new Book(4,"html",400,3);
	 Branch b=new Branch("I.T",book);
	
	
	return b;
	}
	
	
//public	static void display( )
//	{
//		for(int i=0;i<book.length;i++)
//		System.out.println(book[i].getId()+" "+book[i].getName()+" "+book[i].getPrice());
//	}


	

}
