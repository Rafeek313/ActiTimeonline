package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//WAS TO SELECT DOB IN FACEBOOK APPLICATION?

public class HandlingListbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/campaign/landing.php");
	    WebElement day = driver.findElement(By.id("day"));
	    Select s=new Select(day);
	    s.selectByIndex(19);
	    WebElement month = driver.findElement(By.id("month"));
	    Select s1=new Select(month);
	    s1.selectByValue("1");
	    WebElement year = driver.findElement(By.id("year"));
	    Select s2=new Select(year);
	    s2.selectByVisibleText("1996");
	    Thread.sleep(2000);
	    driver.close();



	}

}
