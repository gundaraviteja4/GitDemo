package HomeWorkSpace;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16AutoSuggestiveDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver2.46\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement e = driver.findElement(By.id("fromCity"));
		// e.clear();
		e.click();
		WebElement p = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(2000L);
		p.sendKeys("mum");
		p.sendKeys(Keys.ARROW_DOWN);
		p.sendKeys(Keys.ENTER);
		Thread.sleep(2000L);
		// WebElement e1 = driver.findElement(By.id("toCity"));
		// e1.click();
		WebElement p1 = driver.findElement(By.xpath("//input[@placeholder='To']"));
		p1.sendKeys("hyd");
		Thread.sleep(2000L);
		p1.sendKeys(Keys.ARROW_DOWN);
		p1.sendKeys(Keys.ENTER);
		
		driver.close();
	}

}
