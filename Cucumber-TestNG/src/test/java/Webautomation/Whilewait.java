package Webautomation;

import java.util.concurrent.TimeUnit;

public class Whilewait {

	public static void main(String[] args) throws InterruptedException {
		
		/*long start = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		System.out.println(start);
		Thread.sleep(5000);
		
		long current = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		System.out.println(current);*/
		
		
		long start_time = System.currentTimeMillis();
		System.out.println(start_time);
		long wait_time = 10000;
		long end_time = start_time + wait_time;

		while (System.currentTimeMillis() < end_time) {
		 
			Thread.sleep(1000);
			System.out.println("inside loop");
		}

	}

}
