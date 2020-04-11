package Singletonclass;

public class EnumSingleton {

	public static void main(String[] args) {
	 Single s= Single.INSTANCE;
	 System.out.println(s.getClass().hashCode());
	 s.show();
    
	}

}

enum Single{
	INSTANCE;
	int a=10;
	
	public void show(){
		System.out.println("value is :"+a);
	}
}
