package com.seleniumfw.src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver safariDriver = new SafariDriver();
		safariDriver.get("http://www.google.com");
		safariDriver.manage().window().maximize();
		

	}

}
