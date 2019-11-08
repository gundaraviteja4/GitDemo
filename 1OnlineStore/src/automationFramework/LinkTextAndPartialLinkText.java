package automationFramework;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;



public class LinkTextAndPartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
	driver.get("https://www.nopcommerce.com/");
	
	WebElement element=driver.findElement(By.name("Log in"));
	element.click();
	
	
	WebElement element1=driver.findElement(By.linkText("Forgot password or username?"));
	element1.click();
	//driver.close();
			
		
		
		
	}

}
