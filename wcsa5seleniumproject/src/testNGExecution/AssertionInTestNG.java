package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class AssertionInTestNG {
       
	@Test
  public void Assetion() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-30fqtri/login.do");
	
		
		//SOFT ASSERT
		
	 String expectedtitle = driver.getTitle();
	
	 
	 SoftAssert sa = new SoftAssert ();
	 sa.assertEquals(driver.getTitle(), expectedtitle);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement( By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("title is matched test case pass");
	   sa.assertAll();
		
		
		//HARD ASSERT
		String homepage = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), homepage);
		
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("title match test is pass ");
		
		driver.quit();
		
	
		
	      
	
		
	
		
		

	
		
	
		
		
	
  }
}
