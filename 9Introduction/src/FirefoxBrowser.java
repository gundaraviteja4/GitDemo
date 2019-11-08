import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//System.setProperty("webdriver.gecko.driver", "D:\\selenium\\.exe");
		WebDriver driver= new FirefoxDriver();
		
		
		driver.get("https:www.google.com");
		System.out.println("Title: "+driver.getTitle());
		System.out.println("current URL: " + driver.getCurrentUrl()); 
		//driver.wait(3000);
		//System.out.println("PageSource: "+driver.getPageSource());
		driver.get("https:www.yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("raviteja");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("raviteja");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		driver.close();
	}

}
