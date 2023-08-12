package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiTimeDataProvider {
 
	
	@Test(dataProvider = "actitimedata")
	public void invalidloginmethod(String usn,String pass)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-30fqtri/login.do");
		
		
		driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement( By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		
        driver.findElement(By.name("username")).clear();
		
	}
		
     @DataProvider(name="actitimedata")
	 public Object[][] testdata() {
		
		Object[][]testdata1=new Object[5][2];
		
		testdata1[0][0]="ad_min";
		testdata1[0][1]="man_ager";
		
		testdata1[1][0]="admin1234";
		testdata1[1][1]="managerb";
		
		testdata1[2][0]="@admin";
		testdata1[2][1]="@manager";
		
		testdata1[3][0]="admin123";
		testdata1[3][1]="manager123";
		
		testdata1[4][0]="123admin";
		testdata1[4][1]="123manager";
		
		return testdata1;
		
  }
}
