package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2Calender {

public static void main(String[] args) throws InterruptedException 
{
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("travel_date")).click();
		Thread.sleep(3000);
		//Select 23rd May 2021
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).getText().equalsIgnoreCase("May 2021"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
		}
		
		List<WebElement> daylist = driver.findElements(By.cssSelector(".day"));
		int count=daylist.size();
		for(int i=0; i<count; i++)
		{
			if(daylist.get(i).getText().equals("23"))
			{
				daylist.get(i).click();
				break;
			}
				
		}
	
		
		driver.close();
		
}
}
