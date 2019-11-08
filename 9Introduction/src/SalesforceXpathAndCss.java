import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesforceXpathAndCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new FirefoxDriver();
		
		
		//Syntax: //tagname[@attribute='value']
		//To Validate Xpath in console syntax: $x("xpath")
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Ravi"); //instead of input(tagname) we can give * in xpath
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("teja");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		
		//with css
		//	Syntax: tagname[attribute='value']  or tagname#id or tagname.classname
		//To Validate CSS in console Syntax: $("CSS")
		driver.findElement(By.cssSelector("input#username")).sendKeys("Gunda"); //instead of input(tagname) we can give space in xpath
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("Raviteja");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		driver.close();
	}

}
