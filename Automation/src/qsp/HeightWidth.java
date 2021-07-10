package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		 Dimension UN= driver.findElement(By.id("username")).getSize();
		int HeightUN = UN.getHeight();
		int WidthUN = UN.getWidth();
		Dimension PW = driver.findElement(By.name("pwd")).getSize();
		int Heightpw = PW.getHeight();
		int Widthpw =PW.getWidth();
		if(HeightUN==Heightpw &&  WidthUN==Widthpw )
		{
			System.out.println("height and width are same" +Heightpw);
		}
		else
		{
			System.out.println("height and width are diffrent" +Widthpw);
		}
		driver.close();	
	}
	

}
