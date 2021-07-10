package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggtionflipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> Autosugg = driver.findElements(By.xpath("//span[contains(text(),'iphone')]"));
		int count = Autosugg.size();
		System.out.println(count);
		for(WebElement allsugg:Autosugg)
		{
			String text = allsugg.getText();
			System.out.println(text);
		}
	}

}
