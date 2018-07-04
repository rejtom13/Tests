//------------------------
//Guru_99 tutorial 
//First WebDriver Script 
//03.07.2018
//------------------------


package Selenium_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test_1 {

	public static void main(String[] args) {
		
		String projectlocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.gecko.driver", projectlocation+"\\Library\\gecko\\geckodriver.exe");
		System.setProperty("webdriver.firefox.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		driver.get(baseUrl);
		
		actualTitle = driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
		
		//driver.close();
	}

}
