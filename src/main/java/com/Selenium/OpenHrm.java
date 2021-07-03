package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenHrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	      System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	      
	 	 WebDriver driver = new ChromeDriver();
	      // browser type and chromedrover.exe path as parameters
	      String url = " https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	      driver.get(url);
	}

}
