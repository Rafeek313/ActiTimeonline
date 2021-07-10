package qsp;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//HOWDO YOU CLOSE ALL THE TAB WITHOUT USING FOR EACH LOOP
public class handlingtabsiterator{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		 driver.findElement(By.linkText("actiTIME Inc.")).click();
		 Set<String> alltabs = driver.getWindowHandles();
		   Iterator<String> it = alltabs.iterator();
		   String parentwh = it.next();
		   String childwh = it.next();
		   driver.switchTo().window(childwh);
		   driver.close();
		   driver.switchTo().window(parentwh);
		   driver.close();
	}

}
