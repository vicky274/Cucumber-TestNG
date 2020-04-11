package ParallelTest;

import org.testng.annotations.Test;

public class Methodsparallel {
	
	
  @Test(priority=0)
  public void login1() {
	  System.out.println("login1 test  "+Thread.currentThread().getName());
  }
  
  @Test(priority=1,dependsOnMethods="login1")
  public void titletest1() {
	  System.out.println("titletest1 started  "+Thread.currentThread().getName());
  }
  
  @Test(priority=2,dependsOnMethods="titletest1")
  public void searchtest1() {
	  System.out.println("searchtest1 started  "+Thread.currentThread().getName());
  }
  
  @Test(priority=3,dependsOnMethods="searchtest1")
  public void logotest1() {
	  System.out.println("logotest1 started  "+Thread.currentThread().getName());
  }
  
  //parallel=methods
   /*login1 test  pool-1-thread-1
  login2 started  pool-1-thread-2
  titletest2 started  pool-1-thread-2
  titletest1 started  pool-1-thread-1
  searchtest1 started  pool-1-thread-1
  searchtest2 started  pool-1-thread-2
  logotest1 started  pool-1-thread-1
  logotest2 started  pool-1-thread-2*/
  
  //parallel=classes
  
  /*login1 test  pool-1-thread-1
  login2 started  pool-1-thread-2
  titletest1 started  pool-1-thread-1
  titletest2 started  pool-1-thread-2
  searchtest1 started  pool-1-thread-1
  searchtest2 started  pool-1-thread-2
  logotest1 started  pool-1-thread-1
  logotest2 started  pool-1-thread-2*/
  
  //parallel=classes group-by-instanced=true

/*login1 test  pool-1-thread-1
titletest1 started  pool-1-thread-2
searchtest1 started  pool-1-thread-2
logotest1 started  pool-1-thread-2
login2 started  pool-1-thread-1
titletest2 started  pool-1-thread-1
searchtest2 started  pool-1-thread-1
logotest2 started  pool-1-thread-1*/
}
