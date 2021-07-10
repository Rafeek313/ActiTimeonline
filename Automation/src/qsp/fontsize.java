package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fontsize {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.id("loginButton"));
		String size = login.getCssValue("font-size");
		System.out.println(size);
		String colour = login.getCssValue("color");
		System.out.println(colour);
		String fontfamily = login.getCssValue("font-family");
		System.out.println(fontfamily);
		driver.close();
	}

}
