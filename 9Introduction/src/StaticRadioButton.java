import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaticRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://echoecho.com/htmlforms10.htm");

		driver.findElement(By.xpath("//*[@value='Cheese']")).click();
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		
		
	}

}
