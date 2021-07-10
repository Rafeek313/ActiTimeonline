package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Was to print only duplicate option present in the mtr listbox
public class onlyDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/Hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		HashSet<String> hs=new HashSet<>();
		Select s=new Select(mtrlistbox);
		List<WebElement> alloption = s.getOptions();
		for(int i=0;i<alloption.size();i++) {
			String text = alloption.get(i).getText();
			if(hs.add(text)==false) {
				System.out.println(text);

			}
		}
		driver.close();

	}

}
