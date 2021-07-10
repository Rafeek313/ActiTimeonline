package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This is generic class of WebDriver
 * @author eppys
 *
 */
public class WebDriverCommonLib {
	/**
	 * This is ImplicitlyWait for an element present in GUI
	 * @param driver
	 */
	public void pagetoload(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * ExplicitWait for an element present in GUI
	 * @param driver
	 * @param element
	 */
	public void WaitforElement(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * CustomWait for an element present in GUI
	 * @param element
	 * @throws InterruptedException
	 */
	public void CustomWaitElement(WebElement element) throws InterruptedException {
		int count=0;
		while(count<=20)
		try {
			element.isEnabled();
			break;
		}
		catch(Exception e){
			Thread.sleep(1000);
			count++;
			
		}
	}

public void Select(WebElement element,String text) {
	Select s=new Select(element);
	s.selectByVisibleText(text);
}
public void Select(WebElement element,int index) {
	Select s=new Select(element);
	s.selectByIndex(index);
}
}

