package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to find height and width of email textbox in facebook.com?
public class Heightwidthfb {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://touch.facebook.com/?_rdr");
		WebElement Email = driver.findElement(By.name("email"));
		int EMheight = Email.getSize().getHeight();
		int EMwidth = Email.getSize().getWidth();
		System.out.println("height of email textbox "+EMheight);
		System.out.println("width of email textbox "+EMwidth);
		driver.close();
		
	}

}
