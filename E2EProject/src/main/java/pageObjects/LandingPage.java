package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class LandingPage {

	
	public WebDriver driver;
	

	
	
	private By signin=By.xpath("//div[@class='container-fluid']/nav/ul/li[4]/a"); //we can declare variables as private since public methods of this can access it and these public methods will only can be accessed from other extend class, we can restrict variables like this way
	private By NewsLetterNoThanksButton = By.xpath("//button[text()='NO THANKS']"); // This means we have achieved data encapsulation
	private By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	private By NavBar = By.cssSelector("ul[class='nav navbar-nav navbar-right']");
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	
	
}
