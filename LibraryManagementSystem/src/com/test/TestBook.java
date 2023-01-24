package com.test;

import java.util.Scanner;

import com.dao.BookDetails;
import com.pojo.Book;
import com.pojo.Branch;

public class TestBook {

	public static void main(String[] args) {
    int flag=0;
    int i=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Information_Technology");
		System.out.println("Electronics_Engineering");
		System.out.println("Mechanical_Engineering");
		System.out.println("Civil_Engineering");
		System.out.println("Stories");

		System.out.println("Enter Your Choice");
        String branch=in.next();
        
        Branch br1=BookDetails.showInformation_Technology();
        Branch br2=BookDetails.showElectronics_Engg();
        Branch br3=BookDetails.showMechanical_Engg();
        Branch br4=BookDetails.showCivil_Engg();
        Branch br5=BookDetails.showStories();
        
        //BookDetails bd=new BookDetails();
        
        switch(branch)
        {
        case "Information_Technology":
        	Book bk[]=br1.getBooks();
        	for(i=0;i<bk.length;i++)
        	{
        		System.out.println(bk[i].getId()+" "+bk[i].getName()+" "+bk[i].getPrice()+" "+bk[i].getNo_of_copies());
        	}
        	
        	System.out.println("Enter Book You Want Choose");
        	String c_book=in.next();
        	
            for(i=0;i<bk.length;i++)
            {
			if(bk[i].getName().equals(c_book))
        	{
            	flag=1;
            	break;
        	}
            }
            
        	if(flag==1)
        	{
        	 System.out.println("Enter How Many Books Do you Want");
        	  int n_book=in.nextInt();
        	    if(n_book>bk[i].getNo_of_copies())
        	       {
        		       System.out.println(bk[i].getNo_of_copies()+ " Copies are Available");
        	        }
        	else
        	{
        	   System.out.println("Please Enter Your Name");
        	   String u_name=in.next();
        	
        	System.out.println(" Hi "+u_name+", Ruturn Book Within 7 Days");
        	}
        	}
        	else
        		System.out.println("Book Is Not Available");
        	
        	break;
 
        case "Electronics_Engineering":
        	Book bk1[]=br2.getBooks();
        	for(i=0;i<bk1.length;i++)
        	{
        		System.out.println(bk1[i].getId()+" "+bk1[i].getName()+" "+bk1[i].getPrice()+" "+bk1[i].getNo_of_copies());
        	}

        	System.out.println("Enter Book You Want Choose");
        	String c_book1=in.next();
        	
            for( i=0;i<bk1.length;i++)
            {
			if(bk1[i].getName().equals(c_book1))
        	{
            	flag=1;
            	break;
        	}
            }
        	if(flag==1)
        	{
        	 System.out.println("Enter How Many Books Do you Want");
        	  int n_book=in.nextInt();
        	  if(n_book>bk1[i].getNo_of_copies())
   	       {
   		       System.out.println(bk1[i].getNo_of_copies()+ " Copies are Available");
   	        }
        	  else {
        	System.out.println("Please Enter Your Name");
        	String u_name=in.next();
        	
        	System.out.println(" Hi "+u_name+", Ruturn Book Within 7 Days");
        	}
        	}
        	else
        		System.out.println("Book Is Not Available");
        break;
        
        case "Mechanical_Engineering":
        	Book bk2[]=br3.getBooks();
        	for(i=0;i<bk2.length;i++)
        	{
        		System.out.println(bk2[i].getId()+" "+bk2[i].getName()+" "+bk2[i].getPrice()+" "+bk2[i].getNo_of_copies());
        	}

        	System.out.println("Enter Book You Want Choose");
        	String c_book2=in.next();
        	
            for( i=0;i<bk2.length;i++)
            {
			if(bk2[i].getName().equals(c_book2))
        	{
            	flag=1;
            	break;
        	}
            }
        	if(flag==1)
        	{
        	 System.out.println("Enter How Many Books Do you Want");
        	  int n_book=in.nextInt();
        	  if(n_book>bk2[i].getNo_of_copies())
   	       {
   		       System.out.println(bk2[i].getNo_of_copies()+ " Copies are Available");
   	        }
        	  else {
        	System.out.println("Please Enter Your Name");
        	String u_name=in.next();
        	
        	System.out.println(" Hi "+u_name+", Ruturn Book Within 7 Days");
        	}
        	}
        	else
        		System.out.println("Book Is Not Available");
        break;
        
        case "Civil_Engineering":
        	Book bk3[]=br4.getBooks();
        	for( i=0;i<bk3.length;i++)
        	{
        		System.out.println(bk3[i].getId()+" "+bk3[i].getName()+" "+bk3[i].getPrice()+" "+bk3[i].getNo_of_copies());
        	}

        	System.out.println("Enter Book You Want Choose");
        	String c_book3=in.next();
        	
            for( i=0;i<bk3.length;i++)
            {
			if(bk3[i].getName().equals(c_book3))
        	{
            	flag=1;
            	break;
        	}
            }
        	if(flag==1)
        	{
        	 System.out.println("Enter How Many Books Do you Want");
        	  int n_book=in.nextInt();
        	  if(n_book>bk3[i].getNo_of_copies())
   	       {
   		       System.out.println(bk3[i].getNo_of_copies()+ " Copies are Available");
   	        }
        	  else {
        	System.out.println("Please Enter Your Name");
        	String u_name=in.next();
        	
        	System.out.println(" Hi "+u_name+", Ruturn Book Within 7 Days");
        	}
        	}
        	else
        		System.out.println("Book Is Not Available");
        break;
        
        case "Stories":
        	Book bk4[]=br5.getBooks();
        	for(i=0;i<bk4.length;i++)
        	{
        		System.out.println(bk4[i].getId()+" "+bk4[i].getName()+" "+bk4[i].getPrice()+" "+bk4[i].getNo_of_copies());
        	}

        	System.out.println("Enter Book You Want Choose");
        	String c_book4=in.next();
        	
            for(i=0;i<bk4.length;i++)
            {
			if(bk4[i].getName().equals(c_book4))
        	{
            	flag=1;
            	break;
        	}
            }
        	if(flag==1)
        	{
        	 System.out.println("Enter How Many Books Do you Want");
        	  int n_book=in.nextInt();
        	  if(n_book>bk4[i].getNo_of_copies())
   	          {
   		       System.out.println(bk4[i].getNo_of_copies()+ " Copies are Available");
   	          }
        	  else {
        	System.out.println("Please Enter Your Name");
        	String u_name=in.next();
        	
        	System.out.println(" Hi "+u_name+", Ruturn Book Within 7 Days");
        	}
        	}
        	else
        		System.out.println("Book Is Not Available");
        break;
        
        	default:
        		System.out.println("Wrong Choice...!!!");
        } 
        }
   }