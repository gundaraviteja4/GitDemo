package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	
		
		WebElement E1=driver.findElement(By.name("firstname"));
		E1.sendKeys("Raviteja");
		
		WebElement E2=driver.findElement(By.name("lastname"));
		E2.sendKeys("Gunda");
		
		WebElement E3=driver.findElement(By.id("submit"));
		E3.click();
		
		driver.findElement(By.partialLinkText("Partial")).click();;
		System.out.println("partial link text is clicked");
		
		String s=driver.findElement(By.tagName("button")).toString();
		System.out.println("button is clicked: "+s +" done");
		
		
		driver.findElement(By.linkText("Link Test")).click();;
		System.out.println("link text is clicked");
		
		
		driver.navigate().back();
	}

}
