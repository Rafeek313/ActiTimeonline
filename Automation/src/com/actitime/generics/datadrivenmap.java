package com.actitime.generics;

import java.util.HashMap;

public class datadrivenmap {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		HashMap<String, String> hs=new HashMap<>();
		hs.put("url", "https://demo.actitime.com/login.do");
		hs.put("username", "admin");
		hs.put("browser", "chrome");
		hs.put("password", "manager");
		System.out.println(hs.get("password"));
		System.out.println(hs.get("browser"));
	}

}
