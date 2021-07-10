package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//WAP to print 'fail' in the status
public class DDstatus {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("CreateCustomer").getRow(1).getCell(5).setCellValue("fail");
		FileOutputStream fos=new FileOutputStream("./data/testScript.xlsx");
		wb.write(fos);
		 String value = wb.getSheet("CreateCustomer").getRow(1).getCell(4).getStringCellValue();
		 System.out.println(value);
		wb.close();

	}

}
