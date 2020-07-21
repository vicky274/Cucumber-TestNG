package JavaConcept;

import java.util.ArrayList;
import java.util.Vector;

public class Vectorclass {

	public static void main(String[] args) {
		
		//it increases capacity by 100 percent
		//Thread safe
		Vector v= new Vector();
		v.add(1);
		v.add(1);
		v.add(1);
		System.out.println(v.capacity());
		
		//its not thread safe
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		

	}

}
