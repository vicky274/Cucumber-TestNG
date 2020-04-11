package demo;

import java.util.ArrayList;

class Generics<T> {

	T value;
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void run(){
		System.out.println("Run -" +value);
	}
	
    public T list(ArrayList<? extends Number> list){
    	
		return null;
    	
    }
}

public class GenericsConcept{

	
public static void main(String[] args) {
		
	Generics<Integer> generics = new Generics<Integer>();
	generics.setValue(10);
	generics.run();
	generics.list(new ArrayList<Integer>());
	
		

	}

}