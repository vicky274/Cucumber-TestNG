package TestNGSampleTest;

import org.testng.annotations.Test;

public class TestSampleGroups {
  
	  @Test(groups = { "functest", "checkintest" })
	  public void testMethod1() {
		  System.out.println("TestMethod 1");
	  }
	 
	  @Test(groups = {"functest", "checkintest"} )
	  public void testMethod2() {
		  System.out.println("TestMethod 2");
	  }
	 
	  @Test(groups = { "checkintest" })
	  public void testMethod3() {
		  System.out.println("TestMethod 3");
	  }

	  
}
