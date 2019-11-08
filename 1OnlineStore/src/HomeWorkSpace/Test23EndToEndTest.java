package HomeWorkSpace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class Test23EndToEndTest {

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))  //the value will be 1 if the round trip is selected
		{
			// will select departure city and arrival city using parent child traverse
			driver.findElement(By.xpath("//input[@value='Departure City']")).click();
			driver.findElement(By.xpath("//a[@value='ATQ']")).click();
			
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GAU']")).click();
			
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
			
			Thread.sleep(2000L);
			WebElement e= driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
					e.click();
					
					Thread.sleep(2000L);
			for(int x=1; x<=4; x++) // to select 5 adults
			{
			driver.findElement(By.id("hrefIncAdt")).click();
			}
			driver.findElement(By.id("btnclosepaxoption")).click();
			
			System.out.println(e.getText());
			Assert.assertEquals(e.getText(), "5 Adult");
			Select s= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
			s.selectByValue("AED");
			driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
			Thread.sleep(2000L);
			driver.close();
			
			
		}
		else
		{
			driver.close();
		}
		

	}

}
