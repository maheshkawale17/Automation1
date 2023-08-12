package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod2 {
  @Test
  public void testmethod3() {
	  
	  long threadId3=Thread.currentThread().getId();
		 
		 Reporter.log("thread id of testmethod1:"+threadId3,true);
	  }
	  
	  
	  
	  @Test
	  public void testmethod4() {
		  
		 long threadId4=Thread.currentThread().getId();
		 
		 Reporter.log("thread id of testmethod1:"+threadId4,true);
	  }
  }

