package qsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingdisable {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/disable.html");
		driver.findElement(By.id("t1")).sendKeys("admin");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("document.getElementById('t2').value='manager'");
		driver.findElement(By.id("b1")).click();
		//driver.close();
	}

}
