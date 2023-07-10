package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practicehandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://omayo.blogspot.com/");
			//To perform Scrolling Operation
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  // scroll down
		  Thread.sleep(2000);
		  jse.executeScript("window.scrollBy(0,1500)");
		  
		
		  Thread.sleep(4000);
		  WebElement target =  driver.findElement(By.id("uploadfile"));
			Actions act = new Actions(driver);
			Thread.sleep(4000);
			act.doubleClick(target).perform();
			
			
			
			
			
			
		 
		

	}

}
