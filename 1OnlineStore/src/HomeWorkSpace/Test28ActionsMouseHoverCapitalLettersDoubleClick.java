package HomeWorkSpace;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test28ActionsMouseHoverCapitalLettersDoubleClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		a.moveToElement(e1).click().keyDown(Keys.SHIFT).sendKeys("apple").doubleClick().build().perform(); //hover, capital letters, double click the text
		
		WebElement e2=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(e2).build().perform(); //hover
		a.moveToElement(e2).contextClick().build().perform(); //right click
		driver.close();
		
		
		
	}

}
