package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixCss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.netflix.com/in/");
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Sign In")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("input[name ='userLoginId']")).sendKeys("qspider");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("input[name='password']")).sendKeys("rohit");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
	  
	  
	  
	}

}
