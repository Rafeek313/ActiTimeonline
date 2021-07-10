package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class Loginpage1 {

		@FindBy(id="username")
		private WebElement untbx;
		@FindBy(name="pwd")
		private WebElement pwdtbx;
		@FindBy(xpath="//div[.='Login ']")
		private WebElement lgbtn;
		public Loginpage1(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void setuser(String un,String pwd) {
		untbx.sendKeys(un);
		pwdtbx.sendKeys(pwd);
		lgbtn.click();
	}
	}
