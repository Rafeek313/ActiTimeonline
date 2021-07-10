package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseactiondropdown {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement resorces = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		Actions a=new Actions(driver);
		a.moveToElement(resorces).perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Contact ')])[1]")).click();
		 String phoneno = driver.findElement(By.xpath(" //p[contains(text(),'Bengaluru')]/../p[2]")).getText();
		System.out.println("banglore no"+" "+phoneno);
		driver.close();
	}

}
