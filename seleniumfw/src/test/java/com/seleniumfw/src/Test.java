package com.seleniumfw.src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.gecko.driver", "/Users/rahuls/eclipse-workspace/selenium/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.getTitle();
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.getWindowHandle();
		driver.getClass();
		driver.quit();//to quit the browser with all opened windows 
		driver.close();//close only the current selected window/tab
		
	}

}
