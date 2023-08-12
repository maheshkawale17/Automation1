package testNG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Enter;

public class Demo {
  @Test
  public void method1() throws InterruptedException {
	  
	 // System.out.println("hello world");
	  
	 // Reporter.log("hello world");
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
		
	  Reporter.log("hello world",true);
	  
	  
	  
  }
}
