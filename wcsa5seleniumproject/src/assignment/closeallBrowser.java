package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeallBrowser {
// How to close all the browser without using quit
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//apply Implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");
		//launch the child window
		Thread.sleep(2000);
		  WebElement childwindow=driver.findElement(By.partialLinkText("Open a popup window"));
		  Point elementloc = childwindow.getLocation();
		  int xaxis = elementloc.getX();
		  int yaxis = elementloc.getY();
		  
		 
		
		
		

	}

}
