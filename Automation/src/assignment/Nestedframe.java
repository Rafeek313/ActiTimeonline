package assignment;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//go to frame3 click on 'ok' button,come back page1 click on 'yes' button
public class Nestedframe {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/page1.html");
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("b2")).click();
		driver.close();
	}

}
