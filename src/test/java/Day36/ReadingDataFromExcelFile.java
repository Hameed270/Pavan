package Day36;

import org.apache.poi.*;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		// TODO Auto-generated method stub
		
		
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Pavan_Selenium\\testdata\\test.xlsx");
		
        //get perticulat data 
		//String a = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		//System.out.println(a);
		
		//get all deta 
		
		int r=WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		//int c=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();		
		System.out.println(r);
		//System.out.println(c);
	}
	
	

}
