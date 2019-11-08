package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpiceJetHomePage {

	
	WebDriver driver;
	public SpiceJetHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	By From = By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT");
	By ClickDepartureCity= By.xpath("//a[@value='GOI']");
	By ClickArrivalCity = By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR'] //a[@value='HYD']");
	
	By date=By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']");
	By Search = By.cssSelector("input.bookbtn");
	
	public WebElement ClickFrom()
	{
		return driver.findElement(From);
	}
	
	public WebElement SelectDepartureCity()
	{
		return driver.findElement(ClickDepartureCity);
	}
	
	public WebElement SelectArrivalCity()
	{
		return driver.findElement(ClickArrivalCity);
	}
	public WebElement Selectdate()
	{
		return driver.findElement(date);
	}
	public WebElement Submit()
	{
		return driver.findElement(Search);
	}
}
