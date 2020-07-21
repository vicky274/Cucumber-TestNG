package JavaConcept;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class LinkedListClass {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Similarly deleting and inserting an element from the array is also a performance wise expensive 
		 * operation because all the elements after the deleted element have to be shifted left.
		 * 
		 * 
		 * 
		 * Insert and delete operations in the Linked list are not performance wise expensive because adding and 
		 * deleting an element from the linked list does’t require element shifting, only the pointer of 
           previous and the next node requires change.
		 */
		
		LinkedList<Integer> arraylist = new LinkedList<Integer>();
		
		
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		arraylist.addFirst(0);
		arraylist.addLast(5);
		arraylist.stream().iterator().forEachRemaining(System.out::println);
		
		
	}

}
