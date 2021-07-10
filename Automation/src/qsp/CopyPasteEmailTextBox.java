package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteEmailTextBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email' ]")).sendKeys(Keys.CONTROL+"ac");
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password' ]"));
        pwd.clear();
        pwd.sendKeys(Keys.CONTROL+"v");
        driver.close();
	}

}
