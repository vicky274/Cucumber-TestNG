package java8;

interface inter {
	
	public void sound();
}

class A implements inter{
	
	public void show(){
		System.out.println("show method in class A");
	}
	
	public void GET(){
		System.out.println("get method in class A");
	}

	@Override
	public void sound() {
		System.out.println("sound in class A");
		
	}
	
}
public class Reference_Object extends A implements inter{

	@Override
	public void sound() {
		System.out.println("sound in class Reference");
		
	}
	
	public void GET(){
		System.out.println("get method in class Reference");
	}
	
	public void show(){
		System.out.println("show method in class Reference");
	}
	
	
	public static void main(String[] args) {
		
		A o = new Reference_Object();
		o.sound();
		o.GET();
		
		
		Reference_Object r = new Reference_Object();
		r.GET();
	}

}
