package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.instagram.com/");
	  Thread.sleep(2000);
	 
	  driver.findElement(By.cssSelector("input[aria-label*='be']")).sendKeys("qspider");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("input[aria-label*='Pas']")).sendKeys("rohit1");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
	  
	  

	}

}
