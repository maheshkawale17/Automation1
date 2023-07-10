package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class ZomatoSignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/mobile");
		// to click on sign up link
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement( By.id("sc-1yzxt5f-9 dFkpnp")).sendKeys("mahesh");
		driver.findElement( By.id("sc-re4bd0-8 cGScuB")).sendKeys("pass");
		driver.findElement(By.className("sc-1yzxt5f-6 bfympp")).click();
	
	}
}
