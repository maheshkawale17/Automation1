package PopupHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uploadPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://desktop-30fqtri/login.do");
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement( By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		
		//click on setting module
		driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
		
		//click on logo colour
		driver .findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		
		//click on use coustom logo
		driver.findElement(By.id("uploadNewLogoOption")).click();
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		
	}

}
