package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {


		
		  //to store generic reusable method
	//all the methods are non static
	
	// it is use to read the data from excel  sheet
	public  String readExcelData(String excelpath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
	
	FileInputStream fis = new FileInputStream(excelpath);//provide file of the path
	   Workbook wb = WorkbookFactory.create(fis);//make the file for ready to read
   Sheet sheet = wb.getSheet(sheetName);//get into the sheet
	      Row row = sheet.getRow(rowCount);//get into desire row
	      Cell cell = row.getCell(cellCount);//get inside the desire cell/column
	      String data = cell.getStringCellValue();
	     return data;
	}
	// it is use to get last row count of row where we store data
	public int getLastRowCount(String excelpath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException    
	{
		FileInputStream fis = new FileInputStream(excelpath);//provide file of the path
		   Workbook wb = WorkbookFactory.create(fis);//make the file for ready to read
	        Sheet sheet = wb.getSheet(sheetName);//get into the sheet
		    int rc=sheet.getLastRowNum();
		    return rc;
	}
	
	// it is use to write the data from excel  sheet
public void writeExcelData(String excelpath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream(excelpath);//provide file of the path
	   Workbook wb = WorkbookFactory.create(fis);//make the file for ready to read
      Sheet sheet = wb.getSheet(sheetName);//get into the sheet
	      Row row = sheet.getRow(rowCount);//get into desire row
	      Cell cell = row.createCell(cellCount);//get inside the desire cell/column
	     
		cell.setCellValue(data);
	      
	      
	      
	      
	      FileOutputStream fos = new FileOutputStream(excelpath);
		 wb.write(fos);
		
    }
	
public String readPropertyData(String proppath,String key) throws IOException
{
	FileInputStream fis = new FileInputStream(proppath);
	Properties prop = new Properties();
	prop.load(fis);
	String data = prop.getProperty(key);
	return data;
	
}

}






