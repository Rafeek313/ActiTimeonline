package qsp;

import java.awt.AWTException;
//WAS TO SCROLL TILL THE END PAGE OF THE WEB PAGE AFTER  SCROLL TOP OF THE PAGE
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		j.executeScript("window.scrollTo(0,0)");
	}

}
