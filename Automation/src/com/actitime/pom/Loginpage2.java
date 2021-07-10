package com.actitime.pom;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {
@FindBy(xpath="//input[@type='checkbox']")
private List<WebElement> allcheckBox;
public Loginpage2(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void Selectallcheckbox() {
	for(int i=0;i<allcheckBox.size();i++) {
		allcheckBox.get(i).click();
	}
}
}
