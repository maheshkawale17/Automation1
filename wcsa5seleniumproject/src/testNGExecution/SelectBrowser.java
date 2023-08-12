package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
  @Test
  @Parameters({"browser","Url","Vusername","Vpassword"})
  public void chromemethod(String browservalue,String Url,String usn,String pass) throws InterruptedException {
	  
	  if(browservalue.equalsIgnoreCase("chrome")) {
		  
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://desktop-30fqtri/login.do"); 
			
			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(pass);
			driver.findElement(By.id("loginButton")).click();
	  }
	  else if(browservalue.equalsIgnoreCase("firefox")){
		  
		  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://desktop-30fqtri/login.do"); 
			
			
			
			driver.findElement(By.name("username")).sendKeys(usn);
	        driver.findElement(By.name("pwd")).sendKeys(pass);
			driver.findElement(By.id("loginButton")).click();
	  
	  }
	}
 }
 
	  

