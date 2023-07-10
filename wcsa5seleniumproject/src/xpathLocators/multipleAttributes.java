package xpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleAttributes {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=10524024802025504583&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-10573980&hydadcr=14453_2316415");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@spellcheck='false' and @autocomplete='off'] ")).sendKeys("Nike Air Shoes");
	Thread.sleep(2000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@class='s-image' and @src='https://m.media-amazon.com/images/I/71JqI+GoiXL._AC_UL400_.jpg']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit' and @name='submit.buy-now']")).click();
	
	
	
	}

}
