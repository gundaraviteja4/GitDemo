package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage 
{
	public WebDriver driver;
	
	private By loginlink=By.xpath("//div[@class='container-fluid']/nav/ul/li[4]/a"); //we can declare variables as private since public methods of this can access it and these public methods will only can be accessed from other extend class, we can restrict variables like this way
	private By NewsLetterNoThanksButton = By.xpath("//button[text()='NO THANKS']"); // This means we have achieved data encapsulation
	private By text=By.xpath("//h2[contains(text(),'Featured Courses')]");
	private By navigationBar = By.cssSelector("ul[class='nav navbar-nav navbar-right']");
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getLogin()
	{
		return driver.findElement(loginlink);
	}
	public WebElement clickNewsLetterNoThanksButton()
	{
		return driver.findElement(NewsLetterNoThanksButton);
	}
	public WebElement getTextMethod()
	{
		return driver.findElement(text);
	}
	public WebElement navigationBarMethod()
	{
		return driver.findElement(navigationBar);
	}
	
}
