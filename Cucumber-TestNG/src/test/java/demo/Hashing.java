package demo;

import java.util.HashMap;

class Employee{
	/**
	 * 
	 * The phenomenon when two keys have same hash code is called hash collision. 
	 * If hashCode() method is not implemented properly, there will be higher number of hash collision and map 
	 * entries will not be properly distributed causing slowness in the get and put operations. 
	 * This is the reason for prime number usage in generating hash code so that map entries are properly 
	 * distributed across all the buckets.
	 * @return
	 */
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

	int id;
	
	Employee(int id){
		this.id=id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	//author -vicky
/*	@Override
	public boolean equals(Object obj){
		
		if(this==obj)
			return true;
		if(obj==null || obj.getClass()!=this.getClass())
			return false;
		
		Employee Employee =(Employee) obj;
		
		return (Employee.id==this.id);
	}
	
	 @Override
	    public int hashCode() 
	    { 
		 
		 return this.id; 
		 
	    }*/
}

public class Hashing 
{

	public static void main(String[] args) 
	{
		String obj1 = new String("hello");
		String obj2 = new String("hello");
		
		//string literal
		//if value is same the object will share the same memory address.(reference will point to the same address)
		String s1="hello";
		String s2="hello";
		
		System.out.println(s1==s2); //compares object reference
		System.out.println(s1.equals(obj2)); //compares two strings are equal
		
		
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(1);
		Employee e3 = new Employee(2);
		
		
		  if(e1.hashCode() == e2.hashCode()) 
	        { 
	  
	            if(e1.equals(e2)) {
	                System.out.println("Both Objects are equal. "); 
	            }
	            else{
	                System.out.println("Both Objects are not equal. "); 
	      
	        } }
	        else{
	        System.out.println("Both Objects are not equal. ");  
	    }  
	
		HashMap<Object,String> value = new HashMap<Object,String>();
		
		value.put(e1, "vicky");
		value.put(e2, "vicky");
		value.put(e3, "abc");
		
		value.forEach(( t,  u) -> { System.out.println("key :" +t +" value :"+u);});
	}

	
}
