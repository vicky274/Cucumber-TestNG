package ParallelTest;

import org.testng.annotations.Test;

public class MethodsParalleltwo {


	  @Test(priority=0)
	  public void login2() {
		  
		  System.out.println("login2 started  "+Thread.currentThread().getName());
	  }
	  
	  @Test(priority=1,dependsOnMethods="login2")
	  public void titletest2() {
		  System.out.println("titletest2 started  "+Thread.currentThread().getName());
	  }
	  
	  @Test(priority=2,dependsOnMethods="titletest2")
	  public void searchtest2() {
		  System.out.println("searchtest2 started  "+Thread.currentThread().getName());
	  }
	  
	  @Test(priority=3,dependsOnMethods="searchtest2")
	  public void logotest2() {
		  System.out.println("logotest2 started  "+Thread.currentThread().getName());
	  }
	  
	  
}
