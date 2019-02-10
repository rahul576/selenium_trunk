package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonLib implements Browsers,Timeouts{
	
	public static final String BROWSER = CHROME_BROWSER;
	public static final String OS;
	public static final int DEFAULT_OBJECT_WAIT_TIME = 60;
	public static final String CHROME_EXE_PATH ="";
	public static final String FIREFOX_EXE_PATH = "";
	public final String IE_EXE_PATH="" ;
	public static WebDriver driver;
	static {
		OS = getOperatingSystem();
	}
	
	public static void init() {
		if (driver==null) {
			String os = getOperatingSystem();
			if(os.toUpperCase().contains("MAC")) {
				
			}
			System.setProperty("webdriver.gecko.driver", "/Users/rahuls/eclipse-workspace/selenium/drivers/geckodriver");
		}
	}
	
	public static void clickLink(String linkVisibleText) {
		String xpath = "//a[contains(text(),'" + linkVisibleText + "')]";
		String xpath1 = "//a[text()[contains(.," + linkVisibleText + ")]]";
		driver.findElement(By.linkText(linkVisibleText));
		//kjhj
	}
   public static void javaScriptExecutor(String javaScript, String xpath) {
	   javaScriptExecutor(javaScript, xpath);
	   
   }
   
   public static WebElement getWebElement(String xpath) {
	   
	   WebElement element= driver.findElement(By.xpath(xpath));
	   return element;
   }
   
   public static String getOperatingSystem() {
	   return System.getProperty("os.name") ;
	 //Mac OS X
   }
}
