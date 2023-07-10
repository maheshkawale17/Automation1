package methodsofelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		driver.findElement(By.linkText("sign up")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sc-1yzxt5f-9 dFkpnp")).sendKeys("ram");
		Thread.sleep(2000);
		driver.findElement(By.id("sc-1yzxt5f-9 dFkpnp")).sendKeys("pass");
		Thread.sleep(2000);
		driver.findElement(By.className("sc-gMcBNU AyHts")).click();
	}

}
