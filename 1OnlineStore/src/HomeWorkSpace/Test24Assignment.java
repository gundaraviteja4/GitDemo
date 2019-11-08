package HomeWorkSpace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test24Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); // to disable browser notifications
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(2000L);
		
		Select s1= new Select(driver.findElement(By.id("Adults")));
		s1.selectByIndex(8);
		Thread.sleep(2000L);
		
		Select s3= new Select(driver.findElement(By.id("Infants")));
		s3.selectByVisibleText("1");
		Thread.sleep(2000L);
		driver.findElement(By.id("MoreOptionsLink")).click();
		Select s4= new Select(driver.findElement(By.id("Class")));
		s4.selectByValue("Business");
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("SpiceJet (SG)");
		WebElement e = driver.findElement(By.id("homeErrorMessage"));
		System.out.println(e.isDisplayed());
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(e.isDisplayed());
		if(e.isDisplayed())
		{
			System.out.println(e.getText());
			driver.close();
		}
		else
		{
			driver.close();
		}
		
		
		
		
	}

}
