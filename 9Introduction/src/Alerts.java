import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://tizag.com/javascriptT/javascriptalert.php");
		
		driver.findElement(By.cssSelector("input[value='Confirmation Alert']")).click();
		//if html alert is opened we can go normally but now an java alert is opened, which cannot be find using the Webdriver so we use switchTo().alert()
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();//accept: ok/ done
		//driver.switchTo().alert().dismiss();//if we want to cancel the alert---but here cancel button is not there
		
	}

}
