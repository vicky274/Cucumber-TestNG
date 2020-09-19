package MultiThreading;

//Multithreading is process of executing/ working on multiple threads simultaneously.

public class MyLocalThread extends Thread{

	@Override
	public  void run() {
		
		for(int i=1;i<6;i++){
	
			System.out.println("Thread :" + Thread.currentThread().getId()+"   "+i);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		//MyLocalThread MyLocalThread = new MyLocalThread();
		//t1.join();

		MyLocalThread t1 = new MyLocalThread();
		MyLocalThread t2 = new MyLocalThread();
	
		t1.start();  
		t2.start();
		
		
		
		
	}
}





