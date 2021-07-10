package com.actitime.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to test login feature of the actitime application by taking input from external resource file
public class actilog {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String URL = p.getProperty("url");
		String UN = p.getProperty("username");
		String PWD = p.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(UN);
		driver.findElement(By.name("pwd")).sendKeys(PWD);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
        driver.close();

	}

}
