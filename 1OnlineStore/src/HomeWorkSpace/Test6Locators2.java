package HomeWorkSpace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6Locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver2.46\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		WebElement e= driver.findElement(By.id("username"));
		e.clear();
		e.sendKeys("gundaraviteja");
		WebElement p= driver.findElement(By.name("pw"));
		p.clear();
		p.sendKeys("gundaraviteja");
		driver.findElement(By.id("Login")).click();
		driver.close();
		
		
	}

}
