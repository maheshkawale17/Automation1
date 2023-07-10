package FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bluestoneframehandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.bluestone.com/");
		 driver.findElement(By.id("denyBtn")).click();
		 
//		// WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='fc_widget']"));
//		 
//		 // To handle frame to switch control
//		 //driver.switchTo().frame(5);
	   driver.switchTo().frame("fc_widget");
	   driver.findElement(By.id("chat-icon")).click();
	   Thread.sleep(2000);
	  driver.switchTo().defaultContent();
      
     driver.findElement(By.id("chat-fc-name")).sendKeys("mahesh");
     driver.findElement(By.id("chat-fc-email")).sendKeys("mahesh@123");
     driver.findElement(By.id("chat-fc-phone")).sendKeys("987654321");
//	   // driver.switchTo().frame(frameElement);
//	   
//	  driver.findElement(By.id("chat-icon")).click();
//	   // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	   //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("\"//div[@class='d-hotline h-btn animated zoomIn faster     ']\""))).click();
//	    Thread.sleep(2000);
//            driver.switchTo().defaultContent();
//            Thread.sleep(2000);
//            driver.findElement(By.id("//input[@id='chat-fc-name']")).sendKeys("mahesh");
//            driver.findElement(By.id("//input[@id='chat-fc-email']")).sendKeys("mahesh@123");
//            driver.findElement(By.id("//input[@id='chat-fc-phone']")).sendKeys("987654321");
//            
	}

}
