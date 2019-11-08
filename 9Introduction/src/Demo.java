import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://login.salesforce.com/");
	
		
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("Raviteja");
		driver.findElement(By.cssSelector("#password")).sendKeys("password");
		driver.findElement(By.id("Login")).click();
		
		System.out.println(driver.findElement(By.id("error")).getText());
		
		driver.close();
	}

}
