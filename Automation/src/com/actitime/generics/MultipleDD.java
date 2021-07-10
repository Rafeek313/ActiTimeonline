package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDD {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet("Invalidlogin").getLastRowNum();
		for(int i=0;i<rowcount;i++) {
			String un = wb.getSheet("Invalidlogin").getRow(i).getCell(0).getStringCellValue();
			String pwd = wb.getSheet("Invalidlogin").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+"\t"+pwd);
		}

	}

}
