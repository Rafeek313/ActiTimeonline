package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//was to print all option present in the mtr listbox without using looping statement
public class wrappedElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/Hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlistbox);
		WebElement alloption = s.getWrappedElement();
		String text = alloption.getText();
		System.out.println(text);
		driver.close();
	}

}
