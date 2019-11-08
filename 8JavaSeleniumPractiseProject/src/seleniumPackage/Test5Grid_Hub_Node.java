package seleniumPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test5Grid_Hub_Node {

	public static void main(String[] args) throws MalformedURLException
	{
		DesiredCapabilities dc =new DesiredCapabilities();
		//dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, "true");
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN8);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://172.24.42.79:4444/wd/hub"),dc);
		driver.get("https://www.google.com/");
		
		
		
	}
}
