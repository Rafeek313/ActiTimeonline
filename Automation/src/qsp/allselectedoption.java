package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
//WAS TO PRINT ALL SELECTED OPTION PRESENT IN SLVLISTBOX
public class allselectedoption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/Hotel.html");
		WebElement slvlistbox = driver.findElement(By.id("slv"));
		ISelect s=new Select(slvlistbox);
		List<WebElement> allsoption = s.getAllSelectedOptions();
		int count = allsoption.size();
		for(int i=0;i<count;i++)
		{
			String option = allsoption.get(i).getText();
			System.out.println(option);
		}
		
       driver.close();
	}

}
