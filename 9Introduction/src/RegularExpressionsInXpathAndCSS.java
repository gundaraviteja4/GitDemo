import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegularExpressionsInXpathAndCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://login.salesforce.com/");
		
		//regular expression is used to find elements using subtext
		//Regular expression for xpath: //tagname[contains(@attribute,'value')]
		
		driver.findElement(By.xpath("//input[contains(@id,'userna')]")).sendKeys("abcdefd");   //value is subtext here
		
		
		//Regular expression for css: tagname[attribute*='value']
		driver.findElement(By.cssSelector("input[value*='Log I']")).click();   //value is subtext here
		
	}

	
	
	
}
