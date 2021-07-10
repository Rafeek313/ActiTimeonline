package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS TO CHECK WHETHER ACTITIME LOGO DISPLAYED OR NOT?
public class LogoDisplay {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement logo = driver.findElement(By.className("atLogoImg"));
		if(logo.isDisplayed())
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo not displayed");
		}
		driver.close();
	}

}
