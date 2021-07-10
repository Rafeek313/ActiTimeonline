package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//WAS TO PRINT ALL THE OPTION PRESENT IN THE MTR LISTBOX
public class allOptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/Hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlistbox);
		List<WebElement> alloption = s.getOptions();
		for(WebElement options:alloption)
		{
			String text = options.getText();
			System.out.println(text);
		}
		
   driver.close();
	}

}
