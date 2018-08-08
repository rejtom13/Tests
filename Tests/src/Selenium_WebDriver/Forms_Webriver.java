package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Forms_Webriver {
	public static void main (String[] args) {
		String projectloc = System.getProperty("user.dir");
		String firefoxloc = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
		
		System.setProperty("webdriver.gecko.driver", projectloc+"\\Library\\gecko\\geckodriver.exe");
		System.setProperty("webdriver.firefox.driver", firefoxloc);
		WebDriver driver = new FirefoxDriver();
		
		String testUrl = "http://demo.guru99.com/test/login.html";
		String testemail = "abcd@gmail.com";
		String testpassword = "abcdfghijkl";
		
		driver.get(testUrl);
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.id("passwd"));
		
		email.sendKeys(testemail);
		password.sendKeys(testpassword);
		
		email.clear();
		password.clear();
		
		email.sendKeys(testemail);
		password.sendKeys(testpassword);
		
		WebElement loginbutton = driver.findElement(By.id("SubmitLogin"));
		loginbutton.click();
		
		String endUrl = driver.getCurrentUrl();
		String expectedUrl = "http://demo.guru99.com/test/success.html";
		
		if(endUrl.contentEquals(expectedUrl)) {
			System.out.println("Login test passed");
		}else {
			System.out.println("Login test failed");
			
		}
		
		String testUrl2 = "http://demo.guru99.com/test/radio.html";
		driver.get(testUrl2);
		
		WebElement radio1 = driver.findElement(By.id("vfb-7-2"));
		radio1.click();
		
		WebElement checkbox1 = driver.findElement(By.id("vfb-6-1"));
		checkbox1.click();
		
		if(checkbox1.isSelected())
		{
			System.out.println("Checkbox is Toggled on");
		} else {
			System.out.println("Checkbox is Toogled off");
		}
		
		driver.close();
		
		
		
	}
}
