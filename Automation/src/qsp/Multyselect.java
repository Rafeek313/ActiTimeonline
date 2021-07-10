package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multyselect {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/eppys/Desktop/Hotel.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s =new Select(mtr);
		Thread.sleep(2000);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("d");
		Thread.sleep(2000);
		s.selectByVisibleText("vada");
		Thread.sleep(2000);
		if(s.isMultiple()==true)
		{
		  s.deselectByValue("v");
			Thread.sleep(2000);
			s.deselectByIndex(1);
			Thread.sleep(2000);
			s.deselectByVisibleText("idly");
		}
	}

}
