package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class filedownload {
	static {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}

	public static void main(String[] args) throws AWTException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//td[text()='Java']/../td[6]//a[text()='Download']")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.close();

	}

}
