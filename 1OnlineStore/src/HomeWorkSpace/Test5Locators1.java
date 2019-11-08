package HomeWorkSpace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5Locators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver2.46\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e= driver.findElement(By.id("email"));
		e.clear();
		e.sendKeys("gundaraviteja");
		WebElement p= driver.findElement(By.name("pass"));
		p.clear();
		p.sendKeys("gundaraviteja");
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.close();
		
		
	}

}
