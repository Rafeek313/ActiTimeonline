package com.actitime.generics;

import java.io.FileInputStream;
import java.io.IOException;

public class DataDriven {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		filelib f=new filelib();
		String url = f.getPropertyValue("url");
		String un = f.getPropertyValue("username");
		String pwd = f.getPropertyValue("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		
		String e = f.getExcelData("invalidlogin", 1, 1);
		System.out.println(e);
		
		f.setExcelData("CreateCustomer", 1, 5, "failboy");
		
	}

}
