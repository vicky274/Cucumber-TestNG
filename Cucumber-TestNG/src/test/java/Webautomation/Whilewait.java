package Webautomation;

import java.util.concurrent.TimeUnit;

public class Whilewait {

	public static void main(String[] args) throws InterruptedException {
		
		long start = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		
		Thread.sleep(5000);
		
		long current = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		
		
		
		// do stuff
		System.out.println(current-start);
		
		/*int wait=5;
	
		   while(wait<seconds){
		        
		
			   
		   }*/
		   
		

	}

}
