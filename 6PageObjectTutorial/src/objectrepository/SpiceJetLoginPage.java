package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpiceJetLoginPage {

	
	WebDriver driver;
	public SpiceJetLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By Username = By.xpath("//input[@id='ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID']");
	By password = By.name("ControlGroupLoginView$MemberLoginView2LoginView$PasswordFieldPassword");
	By Login = By.xpath("//input[@value='Login']");
	By alert = By.id("popup_ok");
	By SpiceJet= By.className("spicejet_logo");
	
	public WebElement PhoneNumber()
	{
		return driver.findElement(Username);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(Login);
	}
	public WebElement ClickAlert()
	{
		return driver.findElement(alert);
	}
	public WebElement SpiceJetHomePage()
	{
		return driver.findElement(SpiceJet);
	}
}
