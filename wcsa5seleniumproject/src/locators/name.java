package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class name {

	public static void main(String[] args) {
			System.setProperty("webDriver.chrome.driver","./drivers/chromeDriver.exe");
			WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  WebElement usn = driver.findElement(By.name("email"));
		  usn.sendKeys("qspider");
		  WebElement pwd = driver.findElement(By.name("pass"));
		  pwd.sendKeys("qspiders1");


	}

}
