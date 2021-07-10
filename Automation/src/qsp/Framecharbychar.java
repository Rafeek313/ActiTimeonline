package qsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS TO PRINT 'JSP' IN T2 TEXTBOX AND 'QSP'IN T1 TEXTBOX CHAR BY CHAR
public class Framecharbychar {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("d2")).sendKeys("j");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("d1")).sendKeys("q");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("d2")).sendKeys("s");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("d1")).sendKeys("s");
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.id("f1"));
		driver.switchTo().frame(e);
		driver.findElement(By.id("d2")).sendKeys("p");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("d1")).sendKeys("p");
	
	
	}

}
