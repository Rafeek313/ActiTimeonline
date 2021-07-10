package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a program to navigate to google and type qspiders in search text box, capture all the  autosuggestion and print it on the console  and select the last auto suggestion in it.
public class qspider {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("qspiders");
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'qspiders')or contains(text(),'QSpiders')]"));
		int count = allsugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = allsugg.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}

}
