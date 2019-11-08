package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {

public static WebDriver driver;  //static - once the object is initialized till it got null where we use driver then it will use this driver object only, but if we want to run tests parallely then remove static since static means permanent memory location/so it creates single copy 
public Properties p;
	public WebDriver InitializeDriver() throws IOException
	{
		p=new Properties();
		//System.getProperty("user.dir") -- This will give project path
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\Data.properties");
		p.load(fis);
		
		String browserName=System.getProperty("browser"); // It will consider the parameters sent from maven commands, so from maven command we can send browser which we want to use
									// maven command - mvn test -Dbrowser=chrome
		if(browserName.equals("chromeheadless"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("headless");
			driver=new ChromeDriver(options);
			
		}
		else if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\geckodriver.exe");
			DesiredCapabilities capabilities = new DesiredCapabilities();

			 capabilities = DesiredCapabilities.firefox();
			 capabilities.setBrowserName("firefox");
			 capabilities.setVersion("your firefox version");
			 capabilities.setPlatform(Platform.WINDOWS);
			 capabilities.setCapability("marionette", false);

			driver=new FirefoxDriver(capabilities);
		}
		else if(browserName.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public void getscreenshot(String result) throws IOException 
	{
		System.out.println("Taking Screenshot");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println("Took Screenshot");
		FileUtils.copyFile(src,new File("D:\\selenium\\screenshot\\"+result+"screenshot1.png"));
		System.out.println("Copied Screenshot");
		
	}
	
}
