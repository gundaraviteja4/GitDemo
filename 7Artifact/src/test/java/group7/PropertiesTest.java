package group7;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class PropertiesTest {

	WebDriver driver;

	@Test 
	public void GetDataFromPropertiesFile() throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\gundar\\7Artifact\\src\\test\\java\\group7\\GetData.properties");
		p.load(fis);
		
		if(p.getProperty("browser").equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", p.getProperty("driverpath"));	
			
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			System.out.println("execution completed");
		}
		else if(p.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", p.getProperty("driverpath"));	
			driver = new FirefoxDriver();
			driver.get(p.getProperty("url"));
		}
		else if(p.getProperty("browser").equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", p.getProperty("driverpath"));	
			driver = new InternetExplorerDriver();
			driver.get(p.getProperty("url"));
		}
		else
		{
			driver.close();
		}
		
		
	}
	
}
