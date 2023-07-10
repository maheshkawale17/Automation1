package xpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathcase4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[contains(@name,'usern')]")).sendKeys("admin");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[contains(@type,'word')]")).sendKeys("admin123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[contains(@class,'oxd-button')]")).click();
	  

	}

}
