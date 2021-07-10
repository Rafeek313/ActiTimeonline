package qsp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//WAS to print all the options present in the mtr listbox in alphabetic order
public class arraylistalphabetic {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/Hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		ArrayList<String> al=new ArrayList<>();
		Select s=new Select(mtrlistbox);
		List<WebElement> alloption = s.getOptions();
		for(int i=0;i<alloption.size();i++) {
			String text = alloption.get(i).getText();
			al.add(text);
		}
		Collections.sort(al);
		for(String option:al) {
			System.out.println(option);
		}
		driver.close();

	}

}
