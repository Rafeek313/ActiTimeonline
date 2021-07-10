package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvalidLogin {
	static  {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	@Test(dataProvider="getlogin")
	public void testlogin(String un,String pw) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		WebElement errormsg = driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
		//Reporter.log("username= "+un+"\t"+"password= "+pw,true);
     if(errormsg.isDisplayed()) {
    	 String text = errormsg.getText();
    	 System.out.println(text);
    	 driver.close();
     }
     else
     {
    	 System.out.println("error message is not displaying");
     }
     
	}
	@DataProvider
	public Object[] [] getlogin() throws InterruptedException {
		Object[] [] obj=new Object [2] [2];
		obj[0][0]="admin1";
		obj[0][1]="manager1";
		obj[1][0]="admin2";
		obj[1][1]="manager2";
		return obj;
	}

}
