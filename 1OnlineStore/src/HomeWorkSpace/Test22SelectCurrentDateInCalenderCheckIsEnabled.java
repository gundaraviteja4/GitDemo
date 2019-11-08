package HomeWorkSpace;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test22SelectCurrentDateInCalenderCheckIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement x= driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		x.click();
		WebElement e = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']"));   //there will be a space between parent and child
		e.click();
		
		WebElement p = driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR'])")); // since not to use indexes we use parent and child travers
		p.click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); // to select current date
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); // click on round trip, then some attribute like style is changed, using that we are confirming it enabled
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Arrival date is enabled");  // we are checking using get attribute since IsEnabled is true always
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
		driver.close();
	}

}
