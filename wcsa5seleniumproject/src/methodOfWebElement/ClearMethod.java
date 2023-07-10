package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// driver.findElement(By.name("username")).sendKeys("mahesh");
		// driver.findElement(By.name("password")).sendKeys("mahesh@123");
		 // Thread.sleep(2000);
		   // driver.findElement(By.name("username")).clear();
		   // driver.findElement(By.name("password")).clear();
		   
		 
		WebElement usnTB = driver.findElement(By.name("username"));
		 usnTB.sendKeys("mahesh");
		 WebElement pwdTB = driver.findElement(By.name("password"));
		 pwdTB.sendKeys("mahesh@123");
		 Thread.sleep(2000);
		   usnTB.clear();
		   pwdTB.clear();

	}

}
