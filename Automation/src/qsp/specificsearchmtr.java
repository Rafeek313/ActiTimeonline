package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//was to search for the specific option present in mtr listbox
public class specificsearchmtr {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		System.out.println("enter the item which you want to search");
		Scanner sc=new Scanner(System.in);
		String Expecteditem = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/Hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloption = s.getOptions();
		int counter=0;
		for(int i=0;i<alloption.size();i++) {
			String text = alloption.get(i).getText();
			if(text.equals(Expecteditem)) {
				counter++;
			}
		}
		if(counter==0) {
			System.out.println(Expecteditem+" is not present");
		}
		else if(counter==1) {
			System.out.println(Expecteditem+" is present without duplicate");
		}
		else {
			if(counter>1) {
				System.out.println(Expecteditem+" is present but  with duplicate value");
			}
		}
		driver.close();
	}

}
