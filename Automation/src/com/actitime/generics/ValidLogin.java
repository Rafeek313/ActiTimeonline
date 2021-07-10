package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		filelib f=new filelib();
		WebDriverCommonLib wb=new WebDriverCommonLib();
		WebDriver driver=new ChromeDriver();
		wb.pagetoload(driver);
		driver.get(f.getPropertyValue("url"));
		driver.findElement(By.id("username")).sendKeys(f.getPropertyValue("username"));
		driver.findElement(By.name("pwd")).sendKeys(f.getPropertyValue("password"));
		driver.findElement(By.xpath("//a[.='Login ']")).click();
		Thread.sleep(2000);
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
