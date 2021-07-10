package com.actitime.generics;

import java.util.ArrayList;

public class arraylst {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("https://demo.actitime.com/login.do");
		al.add("admin");
		al.add("chrome");
		al.add("manager");
		
		System.out.println(al.get(2));
	}

}
