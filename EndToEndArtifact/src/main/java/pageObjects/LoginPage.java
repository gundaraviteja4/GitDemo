package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{

WebDriver driver;

By emailId=By.id("user_email");
By password=By.id("user_password");
By submit=By.xpath("//input[@value='Log In']");


public LoginPage(WebDriver driver)
{
	this.driver=driver;
}
public WebElement sendEmailId()
{
	return driver.findElement(emailId);
}

public WebElement sendPassword()
{
	return driver.findElement(password);
}
	

public WebElement clickOnSubmit()
{
	return driver.findElement(submit);
}



}
