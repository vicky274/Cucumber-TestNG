package java8;


interface demo {

	
	void show();
	default void get(){
		System.out.println("implemented interface get method");
	}
	

}



public class Check implements demo{

	public void get(){
		System.out.println("implemented class method");
	}
	
	
	public static void main(String[] args)
	{
		
		demo d = new demo(){

			@Override
			public void show() {
				
				System.out.println("anonymous method show");
			}
			
			
		};
		
		//d.show();
		//d.get();
		
		Check o = new Check();
		o.show();
		o.get();

	}

	@Override
	public void show() {
		System.out.println("method show");
		
	}
	
	
}
