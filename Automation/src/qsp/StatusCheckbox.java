package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS TO CHECK WHETHER CHECKBOX IS SELECTED OR NOT IN ACTITIME APPLICATION?
public class StatusCheckbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement Checkbox = driver.findElement(By.xpath("//input[@type='checkbox' and @value='on']"));
      if(Checkbox.isSelected())
      {
    	  System.out.println("checkbox is selected");
      }
      else
      {
    	  System.out.println("checkbox not selected");
      }
      driver.close();
	}

}
