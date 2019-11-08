package HomeWorkSpace;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test30Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//System.out.println(driver.findElements(By.tagName("iframe")).size()); //to find the number of frames in the web page
		//driver.switchTo().frame(0); //switch to frame using index
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); //switch to frame using WebElement
		WebElement e=driver.findElement(By.id("draggable"));
		e.click();
		Actions a= new Actions(driver);
		a.dragAndDrop(e, driver.findElement(By.id("droppable"))).build().perform();
		Thread.sleep(5000L);
		driver.switchTo().defaultContent(); //switch from frame to normal html page to access other elements other than in frame
		driver.close();
	}

}
