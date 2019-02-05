package com.seleniumfw.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonLib {
	public static final int DEFAULT_OBJECT_WAIT_TIME = 60;
	public static WebDriver driver;
	
	public static void clickLink(String linkVisibleText) {
		String xpath = "//a[contains(text(),'" + linkVisibleText + "')]";
		String xpath1 = "//a[text()[contains(.," + linkVisibleText + ")]]";
		driver.findElement(By.linkText(linkVisibleText));
		
	}

}
