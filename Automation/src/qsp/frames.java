package qsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS TO PRINT JSP IN T2 TEXTBOX AND QSP IN T1 TESTBOX
public class frames {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/eppys/Desktop/page1.html");
	driver.switchTo().frame(0);
	driver.findElement(By.id("d2")).sendKeys("jsp");
	driver.switchTo().parentFrame();
	driver.findElement(By.id("d1")).sendKeys("qsp");
	driver.close();
	}

}
