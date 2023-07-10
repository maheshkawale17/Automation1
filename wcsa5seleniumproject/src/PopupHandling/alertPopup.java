package PopupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alertPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webDriver.edge.driver","./drivers/msedgedriver.exe");
         WebDriver driver= new EdgeDriver();
         driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 		driver.get("file:///C:/Users/admin/Desktop/alert.html");
         
 		driver.findElement(By.xpath("//button[@type='button']")).click();
 		
 		
 		// handle the alert popup by using robot class
 		
 	     // Robot robot = new Robot();
 	      
 	    //  robot.keyPress(KeyEvent.VK_ENTER);
 	   //   robot.keyRelease(KeyEvent.VK_ENTER);
 	      
 	     // Thread.sleep(2000);
 	     //robot.keyPress(KeyEvent.VK_ENTER);
	      //robot.keyRelease(KeyEvent.VK_ENTER);
	      
	      Alert al = driver.switchTo().alert();
	      Thread.sleep(2000);
	      
	     // al.accept();       for accept the alert popup
	     // al.dismiss();        for dismiss the alert popup
	      System.out.println(al.getText());
 	      

	}

}
