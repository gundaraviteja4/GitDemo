import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementUsingText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		
		driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();    
		
		driver.close();
	}

}
