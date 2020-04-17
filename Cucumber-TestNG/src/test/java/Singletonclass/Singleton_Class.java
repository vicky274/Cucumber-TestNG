package Singletonclass;

public class Singleton_Class {

	
	public static void main(String[] args) {
		 
		 
	}

}

class Single_Design{
	
	private static Single_Design Single_Design;
	
	
	private Single_Design() {
		
	}
	
	public static Single_Design getinstance(){
		 if(Single_Design==null){
			 Single_Design=new Single_Design();		 
		 }
		return Single_Design;
	}
}
