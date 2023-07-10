package JavascriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleDesablewebelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/admin/Desktop/ram.html");
		
		//identify web element
		driver.findElement(By.id("i1")).sendKeys("admin");
		// driver.findElement(By.id("i2")).sendKeys("manager");
			Thread.sleep(2000);
			
			
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			
			
			
			// To handle Disabled WebElement
			Thread.sleep(2000);
			jse.executeScript("document.getElementById('i2').value='manager'");
			
		
	
	}

}
