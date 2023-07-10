package ActionclassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Coins ']")).click();
		driver.findElement(By.xpath("//span[text(0='1 gram']")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//div[@class='mousetrap']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(target).perform();
		driver.quit();
	

	}

}
