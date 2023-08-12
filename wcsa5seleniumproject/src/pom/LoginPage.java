package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	

//it is a webelement repository

	@FindBy(xpath="//*[@name='username']") private WebElement usnTB;
	@FindBy(xpath="/*[@name='pwd']") private WebElement pssTb;
	@FindBy(xpath="//*[@id='loginButton'") private WebElement loginbutton;
	@FindBy(xpath="//*[@id='keepLoggedInCheckBox']")private WebElement checkBox;
	@FindBy(partialLinkText ="Actimind Inc.") private WebElement actiMindlink;
	
	
	
	//intialization
	
	
  public LoginPage(WebDriver driver)
  {
 	 PageFactory.initElements(driver,this);
  }


	
	
	// utilaization



	public WebElement getUsnTB() {
		return usnTB;
	}




	public WebElement getPssTB() {
		return pssTb;
	}




	public WebElement getLoginButton() {
		return loginbutton;
	}




	public WebElement getCheckBox() {
		return checkBox;
	}




	public WebElement getActiMindLink() {
		return actiMindlink;
	}
	

	// operational Methods
	public void validLoginMethod(String validUsername,String validPassword)
	{
		usnTB.sendKeys(validUsername);
		pssTb.sendKeys(validPassword);
		loginbutton.click();
	}



}