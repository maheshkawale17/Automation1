package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("file:///C:/Users/admin/Desktop/flipkart-app.html");
	  Thread.sleep(2000);
	  driver.findElement(By.partialLinkText("flip")).click();
	}

}
