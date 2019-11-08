package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGClass1 {

	WebDriver driver;
	
	@BeforeTest
	@Parameters ("Browser")
	public void LaunchBrowser(String Browser)
	{
		if(Browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	
	@Test
	@Parameters ("Value")
	public void sendKeys1(String Value)
	{
		driver.findElement(By.linkText("SIGN-UP")).click();
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#ch_signup_email")).sendKeys(Value);
		driver.findElement(By.id("ch_signup_phone")).sendKeys("7386121262");
		driver.findElement(By.id("ch_signup_password")).sendKeys("password");
		driver.findElement(By.id("ch_signup_btn")).click();
		
	}
	
	@AfterTest
	public void closeAllWindows()
	{
		driver.quit();
	}
	
}
