package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/file1.html");
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		int count = AllLinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement link = AllLinks.get(i);
			String text = link.getText();
			System.out.println(text);
		}
		driver.close();

	}

}
