package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int X1 = driver.findElement(By.id("username")).getLocation().getX();
		int X2 = driver.findElement(By.name("pwd")).getLocation().getX();
		if(X1==X2)
		{
			System.out.println("ALLINGNMENT IS PROPER" +X1);
		}
		else
		{
			System.out.println("ALLIGNMENT NOT PROPER" +X1 +X2);
		}
		driver.close();
	}

}
