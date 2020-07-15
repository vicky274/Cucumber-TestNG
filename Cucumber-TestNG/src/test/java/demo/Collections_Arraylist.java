package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Collections_Arraylist {

	public static void main(String[] args) {
		
		//collection doesnt allow index insertion and it doesnt support sort
		//Collection<Student> list = new ArrayList<Student>();
		
		//so use list
		List<Student> arraylist = new LinkedList<Student>();
		arraylist.add(new Student("vignesh", 22));
		arraylist.add(new Student("john", 66));
		arraylist.add(new Student("Abey", 88));
		arraylist.add(new Student("woo", 77));
		arraylist.add(new Student("zooohn", 11));
		
		 
		Collections.sort(arraylist);
		//Collections.reverse(arraylist);
		Iterator<Student> itr = arraylist.iterator();
		
		while(itr.hasNext()){
			
			Student str = itr.next();
			System.out.println(str.toString());
		}
		
		System.out.println("-----------------------Sorting by Age-----------------------------------");
		Collections.sort(arraylist, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) 
			{
				
				return (o1.getStudentage()>o2.getStudentage()?-1:o1.getStudentage()==o2.getStudentage()?0:1);
			}
			
		});
		
		arraylist.forEach(new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				System.out.println(t);
				
			}
		});
		System.out.println("-----------------------Java 8-----------------------------------");
		arraylist.stream().map(x-> x.getStudentname()).distinct().forEach(System.out::println);
	}

}
