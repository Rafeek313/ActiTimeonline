package qsp;


import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//WAS TO PRINT ALL THE OPTION PRESENT IN THE MTR LISTBOX IN ALPHABETIC ORDER without dublicate
public class alphabeticoption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/Hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		TreeSet<String> ts=new TreeSet<>();
		Select s = new Select(mtrlistbox);
		List<WebElement> alloption = s.getOptions();
		for(int i=0;i<alloption.size();i++) {
			String text = alloption.get(i).getText();
			ts.add(text);
		}
		for(String option:ts) {
			System.out.println(option);
		}
		driver.close();
	}

}
