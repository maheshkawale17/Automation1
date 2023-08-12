package testNGExecution;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(CustomListener.class)

public class TestCase extends BaseTest {


	@Test
	public void loginMethod() 
	{
		SoftAssert sa = new SoftAssert();

		WebElement usn = driver.findElement(By.name("username"));
		sa.assertNotEquals(usn.isDisplayed(),true);
		usn.sendKeys("admin");

		WebElement pass = driver.findElement(By.name("pwd"));
		sa.assertNotEquals(pass.isDisplayed(),true);
		pass.sendKeys("manager");


		driver.findElement(By.id("loginButton")).click();
		sa.assertAll();
	}



	@Test(dependsOnMethods = "loginMethod")
	public void createUser()
	{
		String expected= driver.getTitle();
		Assert.assertEquals(driver.getTitle(),expected);
		driver.findElement(By.xpath("//div[text()='Users']/ancestor::a/img"));
	}



	@Test(dependsOnMethods = "createUser")
	public void logout()
	{
		driver.findElement(By.partialLinkText("Log")).click();


	}

}
