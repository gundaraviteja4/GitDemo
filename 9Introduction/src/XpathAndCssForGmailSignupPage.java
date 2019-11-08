import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAndCssForGmailSignupPage {

	
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		
		//Xpath:
		
		//Syntax: //tagname[@attribute='value']
		//To Validate Xpath in console syntax: $x("xpath") i.e.  $x("//input[@id='firstName']")
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("rishikesh"); 	
		
		//Regular expression for xpath: //tagname[contains(@attribute,'value')] , if we need to find elements using subtext we will use regular expressions
		driver.findElement(By.xpath("//input[contains(@name,'lastNa')]")).sendKeys("Gunda"); 
		
		
		
		
		//CSS: css is 10 times faster than xpath
		
		//Syntax: tagname[attribute='value']  or   tagname#id    or       tagname.classname(in this syntax if there is a space in the classname, remove space and keep dot(.))
		//To validate Css in console syntax: $("CssSelector")  i.e  $("tagname[attribute='value']")
		
		
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("rishikesh13");           //tagname#id
		driver.findElement(By.cssSelector("input[name='Passwd']")).sendKeys("rishikesh13");     //tagname[attribute='value'] 
		driver.findElement(By.cssSelector("input[name='ConfirmPasswd']")).sendKeys("rishikesh13");		
		
		
		//Regular expression for css: tagname[attribute*='value']
		driver.findElement(By.cssSelector("span[class*='RveJvd']")).click();                    
		
		
		
		
		
		
	}
}
