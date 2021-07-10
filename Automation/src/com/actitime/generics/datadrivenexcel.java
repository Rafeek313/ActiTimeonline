package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//WAP to read the data from excel
public class datadrivenexcel {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet("CreateCustomer").getRow(1).getCell(2).getStringCellValue();
		System.out.println(value);
		wb.close();
		
		
	}

}
