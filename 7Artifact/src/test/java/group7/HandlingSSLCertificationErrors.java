package group7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HandlingSSLCertificationErrors {

	WebDriver driver;
	
	@Test
	public void method1()
	{
		
		
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(dc);
		//ChromeOptions op=new ChromeOptions();   //-- old version
		//op.merge(dc);
		//remaining code
		
		//for firefox below is the code
		
		//It create firefox profile
		//FirefoxProfile profile=new FirefoxProfile();
		 
		// This will set the true value
		//profile.setAcceptUntrustedCertificates(true);
		 
	
		//WebDriver driver=new FirefoxDriver(profile);
		
	}
	
	
}
