package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatocssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.zomato.com/india");
	  
	  driver.findElement(By.linkText("Sign up")).click();
	  
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 dFkpnp']")).sendKeys("qspider");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("input[width='100%']")).sendKeys("rohit");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("section[class='sc-ileJJU fhCIbg']")).click();

	}

}
