package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.WebDriverCommonLib;
import com.actitime.generics.filelib;

public class TaskModule extends BaseClass {	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	WebDriver driver;
@Test
public void createTask() throws EncryptedDocumentException, IOException, InterruptedException {
	filelib f=new filelib();
	Thread.sleep(100000);
	driver.findElement(By.xpath("//span[.='New']")).click();
	driver.findElement(By.xpath("(//div[@class='dropdownButton'])[5]")).click();
	driver.findElement(By.xpath("(//div[.='- New Customer -'])[1]")).click();
	String customername = f.getExcelData("CreateCustomer", 1, 2);
	driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name']")).sendKeys("customername");
	String projectname = f.getExcelData("CreateCustomer", 1, 3);
	driver.findElement(By.xpath("//input[@placeholder='Enter Project Name']")).sendKeys("projectname");
	String taskname = f.getExcelData("CreateCustomer", 1, 1);
	driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]")).sendKeys("taskname");
	driver.findElement(By.xpath("//div[.='Create Tasks']")).click();
}
}
