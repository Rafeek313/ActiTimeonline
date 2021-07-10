package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingtabs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		 driver.findElement(By.linkText("actiTIME Inc.")).click();
		 Set<String> alltabs = driver.getWindowHandles();
		 int count = alltabs.size();
			System.out.println(count);
			for(String tab:alltabs) {
				driver.switchTo().window(tab);
				String title = driver.getTitle();
				System.out.println(title);	
			}
			driver.quit();

	}

}
