package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.pom.Loginpage2;

public class mainMetodcls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/RemoveText.html");
		Loginpage2 l=new Loginpage2(driver);
		l.Selectallcheckbox();
		driver.close();
		}

}

