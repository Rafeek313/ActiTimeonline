package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class compareWidthFb {
////WAS to compare the width of email and pwd textbox equal or not?
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://touch.facebook.com/?_rdr");
		int WidthEmail = driver.findElement(By.name("email")).getSize().getWidth();
		int Widthpwd = driver.findElement(By.id("m_login_password")).getSize().getWidth();
		if(WidthEmail==Widthpwd)
		{
			System.out.println("height of the email & password textbox are equal "+WidthEmail);
		}
		else 
		{
			System.out.println("height of the email & password textbox are not equal " +WidthEmail+' ' +Widthpwd);
		}
  driver.close();	
  }
	

	}



