package pom;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTestCase {

	public static void main(String[] args) throws IOException {
		
		
		BaseTestCase bt = new BaseTestCase();
		bt.setUp();
		
		Flib flib = new Flib();
		
		// to call the webelements of login page create the obj of loginpage class
		LoginPage lp = new LoginPage(driver);
	    lp.validLoginMethod(flib.readPropertyData(PROP_PATH,"Username"),flib.readPropertyData(PROP_PATH, "Password"));
	}

}
	
