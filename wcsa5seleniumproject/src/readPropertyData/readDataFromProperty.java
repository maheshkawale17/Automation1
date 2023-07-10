package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readDataFromProperty {

	public static void main(String[] args) throws IOException {
		
		//read the data from config.properties file
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//create a object for properties
		Properties prop = new Properties();
		
		//to make a read file to read
		 
		prop.load(fis);
		
		//to read the property from file
		
		String data = prop.getProperty("Browser");
		System.out.println(data);
	}

}
