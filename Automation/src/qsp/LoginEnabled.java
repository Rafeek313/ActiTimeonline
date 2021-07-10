package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginEnabled {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement login = driver.findElement(By.xpath("//button[.='Log In']"));
		if (login.isEnabled())
		{
			System.out.println("login is enabled");
		}
		else
		{
			System.out.println("login is not enabled");
		}
		driver.close();

	}

}
