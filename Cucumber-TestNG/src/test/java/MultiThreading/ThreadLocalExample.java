package MultiThreading;

import java.text.SimpleDateFormat;
import java.util.Random;

/*In thread local, you can set any object and this object will be local and global to the specific 
thread which is accessing this object.*/

public class ThreadLocalExample implements Runnable{

	
    // SimpleDateFormat is not thread-safe, so give one to each thread
    private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue()
        {
            return new SimpleDateFormat("yyyyMMdd HHmm");
        }
    };
    
  
    @Override
    public void run() {
        System.out.println("Thread Name= "+Thread.currentThread().getName()+" default Formatter = "+formatter.get().toPattern());
        
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        
        
        //formatter pattern is changed here by thread, but it won't reflect to other threads
        formatter.set(new SimpleDateFormat("dd/MM/YY HH:mm:SS"));
        
        System.out.println("Thread Name= "+Thread.currentThread().getName()+" formatter = "+formatter.get().toPattern());
    }

    
    
    
    public static void main(String[] args) throws InterruptedException {
    	System.out.println("Thread Execution started");
    	
        ThreadLocalExample obj = new ThreadLocalExample();
        
        for(int i=1 ; i<=10; i++){
            Thread t = new Thread(obj, "Thread :"+i);
            Thread.sleep(1000);
            t.start();
        }
        
    }

}
