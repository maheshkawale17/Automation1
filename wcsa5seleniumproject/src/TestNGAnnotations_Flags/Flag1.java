package TestNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description = "login method")
  public void method1() 
  {
	  Reporter.log("method1 from flag1",true);
	  
  }
  
  
  @Test(description = "logout method")
  public void method2()
  {
	  Reporter.log("method1 from flag2",true);
  }
}
