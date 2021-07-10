package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Handlingexcell {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("CreateCustomer");
			Row row = sheet.getRow(1);
			Cell cell = row.getCell(1);
			String value = cell.getStringCellValue();
			System.out.println(value);
	}

}
