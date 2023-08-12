package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod3 {
  @Test
  public void testmethod5() {
	  
	  long threadId5=Thread.currentThread().getId();
		 
		 Reporter.log("thread id of testmethod1:"+threadId5,true);
	  }
	  @Test
	  public void testmethod6() {
		  
		 long threadId6=Thread.currentThread().getId();
		 
		 Reporter.log("thread id of testmethod1:"+threadId6,true);
	  }
  }

