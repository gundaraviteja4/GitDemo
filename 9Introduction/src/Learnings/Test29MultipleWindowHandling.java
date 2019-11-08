package Learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test29MultipleWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.linkText(" about why we ask for this information.")).click();
	}

}
