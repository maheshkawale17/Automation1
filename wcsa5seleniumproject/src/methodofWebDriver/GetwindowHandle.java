package methodofWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//apply Implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");
		// get the handle or adressof current or parent window
		String parenthandle = driver.getWindowHandle();
		System.out.println("Adress of child window:"+parenthandle);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		//get the handle or adress of child window
		String childhandle = driver.getWindowHandle();
		System.out.println("Adress of child window:"+childhandle);
		//get the adress of child window only
		Set<String> allhandles = driver.getWindowHandles();
		//read address by using looping statements
		for(String al:allhandles)
		{
			System.out.println(al);
		}
		}
		
	}


