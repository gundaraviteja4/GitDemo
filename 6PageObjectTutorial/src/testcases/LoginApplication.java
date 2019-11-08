package testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.SpiceJetHomePage;
import objectrepository.SpiceJetLoginPage;

public class LoginApplication {

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://book.spicejet.com/Login.aspx");
		SpiceJetLoginPage lp=new SpiceJetLoginPage(driver);
		lp.PhoneNumber().sendKeys("6305512192");
		lp.Password().sendKeys("pwd123456s");
		
		lp.Submit().click();
		System.out.println(lp.ClickAlert().isDisplayed());
		//driver.switchTo().alert().accept();
		if(lp.ClickAlert().isDisplayed())
		{
			
			lp.ClickAlert().click();
		}
		//driver.findElement(By.id("popup_ok")).click();
		lp.SpiceJetHomePage().click();
		SpiceJetHomePage hp=new SpiceJetHomePage(driver);
		hp.ClickFrom().click();
		hp.SelectDepartureCity().click();;
		hp.SelectArrivalCity().click();
		//hp.Selectdate().click();
		hp.Submit().click();
		
		driver.close();
		
	}
}
