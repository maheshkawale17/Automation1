package xpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathcase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://twitter.com/i/flow/login");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='text']")).sendKeys("mahesh123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='Next']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mk123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='Log in']")).click();
	  
	
	}

}
