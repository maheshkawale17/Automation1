package takesScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;



public class ScreenshotMethod4 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.selenium.dev/");
	
	File src2 = driver.getScreenshotAs(OutputType.FILE);
	
	File dest2 = new File("./Screenshots/selenium4.png");
	Files.copy(src2, dest2);
	
	
	
	
	
	}

}
