package HomeWorkSpace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18JavaAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		// 2 types of Alerts - Web Alerts and Java Alerts
		// Web Alerts are find using driver  - through xpath, css etc
		// Java Alerts are find using alert method - need to switch from driver to alert class/method

		driver.findElement(By.cssSelector("input[value='Confirmation Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(5000);
		//driver.switchTo().alert().sendKeys("abcd"); // to send something
		driver.switchTo().alert().accept(); // accept() - for position checks like ok, yes, done etc
		//driver.switchTo().alert().dismiss(); // dismiss() - for negative checks like cancel etc
		driver.close();
	}

}
