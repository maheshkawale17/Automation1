package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class plaingoldscenario17 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement targetcoins = driver.findElement(By.xpath("//a [text()='Coins ']"));
		
		 Actions act = new Actions(driver);
		 act.moveToElement(targetcoins).perform();
		 driver.findElement(By.xpath("//span [text()='50 gram'and @data-p='gold-coins-weight-50gms,m']")).click();
			WebElement coin = driver.findElement(By.id("5925"));
			if(coin.isDisplayed())
			{
				Thread.sleep(2000);
				driver.quit();
			}
			else {
				System.out.println("Exception!!!");
			}
		
	}


	}

