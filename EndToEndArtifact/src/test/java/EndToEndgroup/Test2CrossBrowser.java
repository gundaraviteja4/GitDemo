package EndToEndgroup;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2CrossBrowser {

	
	WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void TestLoginMethod(String a) 
	{
		
		if(a.equalsIgnoreCase("chrome"))
		{
			System.out.println("browser = " + a);
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if(a.equalsIgnoreCase("firefox"))
		{
			System.out.println("browser = " + a);
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\Drivers\\geckodriver.exe");
			
			DesiredCapabilities capabilities = new DesiredCapabilities();

			 capabilities = DesiredCapabilities.firefox();
			 capabilities.setBrowserName("firefox");
			 capabilities.setVersion("your firefox version");
			 capabilities.setPlatform(Platform.WINDOWS);
			 capabilities.setCapability("marionette", false);

			driver=new FirefoxDriver(capabilities);
		}
		
		driver.get("https://www.google.com/");
		
		driver.close();
		
	}
}
