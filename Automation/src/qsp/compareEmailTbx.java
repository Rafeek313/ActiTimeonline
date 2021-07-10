package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to compare the height of email and pwd textbox equal or not?
public class compareEmailTbx {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://touch.facebook.com/?_rdr");
		int HeightEmail = driver.findElement(By.name("email")).getSize().getHeight();
		int Heightpwd = driver.findElement(By.id("m_login_password")).getSize().getHeight();
		if(HeightEmail==Heightpwd)
		{
			System.out.println("height of the email & password textbox are equal "+HeightEmail);
		}
		else {
			System.out.println("height of the email & password textbox are not equal " +HeightEmail+' ' +Heightpwd);
		}
  driver.close();	}

}
