package Selenium_WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownBox {

	public static void main(String[] args) {
		String projectloc = System.getProperty("user.dir");
		String firefoxloc = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
		
		System.setProperty("webdriver.gevko.driver", projectloc+"\\Library\\gecko\\geckodriver.exe");
		System.setProperty ("webdriver.firefox.driver", firefoxloc);
		WebDriver driver = new FirefoxDriver(); 
		
		String testUrl = "http://demo.guru99.com/test/newtours/register.php";
		
		driver.get(testUrl);
		
		Select dropCountry = new Select (driver.findElement(By.name("country")));
		dropCountry.selectByVisibleText("POLAND");
		
		
		String testUrl2 = "http://jsbin.com/osebed/2";
		driver.get(testUrl2);
		Select fruits = new Select (driver.findElement(By.id("fruits")));
		fruits.selectByIndex(0);
		fruits.selectByVisibleText("Apple");
		System.out.println("Test passed");
		
		driver.close();
		
		
		
	}

}
