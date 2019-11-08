package HomeWorkSpace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver2.46\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement e=driver.findElement(By.cssSelector("input[id='email']"));
		e.clear();
		e.sendKeys("gundar");
		WebElement p=driver.findElement(By.cssSelector("[type='password']"));
		p.clear();
		p.sendKeys("gundar");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		driver.findElement(By.cssSelector("input#pass")).sendKeys("demo");
		
		//driver.findElement(By.cssSelector("button._42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy")).click();
		
		
		driver.close();
	}

}
