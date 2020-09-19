package MultiThreading;

/*There are two types of synchronization

Process Synchronization
Thread Synchronization

There are two types of thread synchronization mutual exclusive and inter-thread communication.

Mutual Exclusive
Synchronized method.
Synchronized block.
static synchronization.
Cooperation (Inter-thread communication in java)*/

/*	Synchronization is built around an internal entity known as the lock or monitor. Every object has an lock associated 
with it. By convention, a thread that needs consistent access to an object's fields has to acquire the object's lock
before accessing them, and then release the lock when it's done with them.
*/	

/*If a thread acquired that object lock it has to finish the execution and another thread will start execution once parent is done.
Note:Not only that method any other synchronous method in that class can't be accessed before execution completes for before thread
*/
class table {
	
	public synchronized void run() {

		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread :" + Thread.currentThread().getId()+"   "+i);
			try{Thread.sleep(10);}catch(InterruptedException e){System.out.println(e);}  
		}
	}

//this is not synchronized so this can be accessed by 2nd thread before 1st completes/started
public void a() {

		
		System.out.println("another method sync");
	}
	
}
class ThreadclassSync extends Thread{
	
	table t;
	ThreadclassSync(table t){

		this.t=t;
		System.out.println(Thread.holdsLock(this.t));
	}
	
	public  void run() {

		t.run();
	}


}


class ThreadclassSync2 extends Thread{
	
	table t;
	ThreadclassSync2(table t){
		this.t=t;
	}
	
	public  void run() {
        t.a();
		t.run();
	}
}


public class synchronization {

	public static void main(String[] args) {
		
		final table obj= new table();
		
		ThreadclassSync t1 = new ThreadclassSync(obj);
		ThreadclassSync2 t2 = new ThreadclassSync2(obj);
		
	
		t1.start();
		t2.start();

	}

}
