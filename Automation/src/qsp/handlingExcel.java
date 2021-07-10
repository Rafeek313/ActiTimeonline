package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class handlingExcel {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
           String value = wb.getSheet("CreateCustomer").getRow(1).getCell(2).getStringCellValue();
           System.out.println(value);
	}

}
