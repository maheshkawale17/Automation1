package takesScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Screenshotmethod1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com");
		
	        TakesScreenshot ts = (TakesScreenshot)driver;
	        
	        File src = ts.getScreenshotAs(OutputType.FILE);
	    	
	         File dest = new File("./Screenshots/facebook1.png");
	         
	         Files.copy(src, dest);
	        
	        
	        
	        
		

		

	}

}
