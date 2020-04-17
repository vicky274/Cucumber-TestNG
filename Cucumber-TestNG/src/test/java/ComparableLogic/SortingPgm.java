package ComparableLogic;

import java.util.ArrayList;
import java.util.Collections;

public class SortingPgm {

	public static void main(String[] args) {
	
		     // List of objects of Author class      
		     ArrayList<Author> al=new ArrayList<Author>();        
		     al.add(new Author("Henry", "Tropic of Cancer",  45));
		     al.add(new Author("Nalo", "Brown Girl in the Ring", 56));
		     al.add(new Author("Frank", "A Song", 65));
		     al.add(new Author("Deborah", "Sky Boys", 51));
		     al.add(new Author("George R. R.", "A Song of Ice and Fire", 62));
		     /*       
		      * Sorting the list using Collections.sort() method, we       
		      * can use this method because we have implemented the        
		      * Comparable interface in our user defined class Author       
		      */      
		     System.out.println(">>>>>>>>>>>>Sorting by Author First Name:"+"\n");      
		     Collections.sort(al);
		   
		     for(Author au: al){       
		       System.out.println(au.getFirstName()+" | "+au.getBookName()+" | "+
		           au.getAuAge());        
		     } 
		     /*Sorting using AuthorAgeComparator*/      
		     System.out.println(">>>>>>>>>>>>>>Sorting by Author Age:"+"\n");
		     Collections.sort(al, new AuthorAgeComparator());
		     for(Author au: al){       
		       System.out.println(au.getFirstName()+" | "+au.getBookName()+" | "+
		          au.getAuAge());        
		     }             
		     /*Sorting using BookNameComparator*/      
		     System.out.println(">>>>>>>>>>>>>Sorting by Book Name:"+"\n");      
		     Collections.sort(al, new BookNameComparator());      
		     for(Author au: al){       
		        System.out.println(au.getFirstName()+" | "+au.getBookName()+" | "+ 
		           au.getAuAge());       
		     }    
		  }  
	

}
