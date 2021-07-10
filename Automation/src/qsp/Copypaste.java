package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copypaste {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/RemoveText.html");
		driver.findElement(By.xpath("//input[@type='text' and @value='A']")).sendKeys(Keys.CONTROL+"ac");
		WebElement B1extbox = driver.findElement(By.xpath("//input[@type='text' and @value='B']"));
		B1extbox.clear();
		B1extbox.sendKeys(Keys.CONTROL+"v");
		

	}

}
