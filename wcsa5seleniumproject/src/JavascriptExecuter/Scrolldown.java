package JavascriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrolldown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// maximze the vrowser
		driver.manage().window().maximize();
		// apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		
		//To perform Scrolling Operation
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  // scroll down
	  Thread.sleep(2000);
	  jse.executeScript("window.scrollBy(0,500)");
	  
	  // scroll up with help of scroll down
	  Thread.sleep(2000);
	  jse.executeScript("window.scrollBy(0,-500)");
	  
	  
	}

}
