package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}


	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
