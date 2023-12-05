package Com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenEbayBrowser {

	public static void main(String[] args) {
		
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://ebay.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	driver.close();
		
		
		
		
		
		
	}

}
