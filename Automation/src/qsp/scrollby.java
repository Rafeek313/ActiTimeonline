package qsp;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//was to scroll 2000 pixel vertically by bbc.com
public class scrollby {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,2000)");
		//driver.close();
	}

}
