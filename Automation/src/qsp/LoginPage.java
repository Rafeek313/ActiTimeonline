package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement untbx;
	private WebElement pwdtbx;
	private WebElement lgbtn;
	public LoginPage(WebDriver driver) {
		untbx=driver.findElement(By.id("username"));
		pwdtbx=driver.findElement(By.name("pwd"));
		lgbtn=driver.findElement(By.xpath("//div[.='Login ']"));
	}
	public void setuser(String un,String pwd) {
		untbx.sendKeys(un);
		pwdtbx.sendKeys(pwd);
		lgbtn.click();
	}

}
