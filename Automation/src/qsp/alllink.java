package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alllink {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/eppys/Desktop/Link.html");
		 List<WebElement> alllink = driver.findElements(By.xpath("//a"));
		 int count = alllink.size();
	System.out.println(count);
	String text1 = alllink.get(0).getText();
	System.out.println(text1);
	driver.close();
	}

}
