package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is generic class for data driven testing
 * @author eppys
 *
 */
public class filelib {
	/**
	 * generic method to reading the data from property file
	 * @param key
	 * @return String
	 * @throws IOException
	 */
	public  String getPropertyValue(String key)throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		

}
	/**
	 * generic method to reading the data from Excel file
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return String
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetname, int rownum,int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
		return data;
		
}
	public void setExcelData(String sheetname, int rownum,int cellnum,String setvalue) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).setCellValue(setvalue);
		 FileOutputStream fos=new FileOutputStream("./data/testScript.xlsx");
		 wb.write(fos);
		 wb.close();
		
	}
}
