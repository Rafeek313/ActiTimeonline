package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//was to select all option present in mtr listbox and deselect in reverse order
public class DeselectReverse {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/Hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlistbox);
		List<WebElement> alloption = s.getOptions();
		int count = alloption.size();
		for(int i=0;i<count;i++)
		{
			Thread.sleep(1000);
			s.selectByIndex(i);
			
		}
		for(int i=count-1;i>=0;i--)
		{
			Thread.sleep(1000);
			s.deselectByIndex(i);
		}
		
		driver.close();
	}

}
