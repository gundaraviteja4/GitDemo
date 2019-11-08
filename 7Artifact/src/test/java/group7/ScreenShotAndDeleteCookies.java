package group7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotAndDeleteCookies {

	
	WebDriver driver;
	
	@Test
	public void ScreenShotAndDeleteCookiesMethod() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // To delete all cookies
		//driver.manage().deleteCookieNamed("CookieName"); // To delete single cookie
		driver.get("https://www.spicejet.com/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("D:\\selenium\\screenshot1.png"));
		
		
		
		
		
	}
}
