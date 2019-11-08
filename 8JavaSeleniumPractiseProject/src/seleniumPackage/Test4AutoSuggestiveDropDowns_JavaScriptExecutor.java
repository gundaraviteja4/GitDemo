package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4AutoSuggestiveDropDowns_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement LeavingFrom=driver.findElement(By.id("fromPlaceName"));
		LeavingFrom.sendKeys("BENG");
		Thread.sleep(4000);
		System.out.println(LeavingFrom.getText());   // since the textbox contains hidden text - you can see from inspect in span tag
		//Javascript DOM can extract hidden elements using Java Script Excecutor
		//Selenium cannot identify hidden elements
		
		//Java Script Excecutor
		int i=0;
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String s="return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(s);
		
		System.out.println(text); 
		
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORTsfddsaf"))
		{
			i++;
			LeavingFrom.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			text=(String) js.executeScript(s);
			System.out.println(text); 
			
			if(i>10)  //Since above is while loop, if element not found it will go into dead lock...so we are  breaking after 10 iterations
			{
				System.out.println("element not found"); 
				break;
			}
		}
		
		LeavingFrom.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		
		
		driver.close();
		
	}

}
