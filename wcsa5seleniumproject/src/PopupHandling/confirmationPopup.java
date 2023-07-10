package PopupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class confirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.edge.driver","./drivers/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/admin/Desktop/confirm.html");
        
		driver.findElement(By.tagName("input")).click();
		
		// handle the alert popup 
		
		 Alert al = driver.switchTo().alert();
	      Thread.sleep(2000);
	      
	   // al.accept();      // for accept the alert popup
	      //al.dismiss();        //for dismiss the alert popup
	      System.out.println(al.getText());
	      

	}

}
