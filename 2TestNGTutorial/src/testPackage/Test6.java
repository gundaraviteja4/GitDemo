package testPackage;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test6 {

	
	WebDriver driver;
	@Parameters({"Username1","Password1"})
	@Test 
	public void ParameterExample2(String x, String y)
	{
		System.out.println("ParameterExample2");
		System.out.println("Username: "+ x + "Password: " + y );
	}
	
	
	@Test
	public void FetchFromPropertiesFile() throws IOException   //below code is to get data from properties file
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\gundar\\workspace\\2TestNGTutorial\\src\\testPackage\\GlobalProperties.properties");
		p.load(fis);
		
		if(p.getProperty("browser").equals("firefox"))
		{
			driver = new FirefoxDriver();
			driver.get(p.getProperty("url"));
			
		}
		else if(p.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(p.getProperty("url"));
		}
		else
		{
			System.setProperty("webdriver.ie.driver", "D:\\selenium\\Drivers\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			driver.get(p.getProperty("url"));
		}
		
		System.out.println("Username = \t" + p.getProperty("Username") + "\t Password = \t" + p.getProperty("Password"));
		
		
		
		
	}


	
	
}
