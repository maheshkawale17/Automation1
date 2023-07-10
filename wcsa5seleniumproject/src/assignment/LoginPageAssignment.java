package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000); 
		driver.findElement(By.id("id_userLoginId")).sendKeys("mahesh@123gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("kawale tatya");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).click();
		
		
		

	}

	
}
