package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Write a program to navigate to flipkart.com search for I phone 11 and print all the I phone product name  along with the price in below format
//Product 1   68000
//Product 2  64000 etc.
public class FlipkartAllSuggestion
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 11"+Keys.ENTER);
		List<WebElement> Allproduct = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 11') or contains(text(),'Apple iPhone 11 ')]"));
		List<WebElement> Allprice = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 11') or contains(text(),'Apple iPhone 11')]/../../div[2]/div[1]/div[1]/div[1]"));
		int count = Allprice.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) 
		{
			System.out.println(Allproduct.get(i).getText()+"==========>"+Allprice.get(i).getText());
		}
		driver.close();
	}

}