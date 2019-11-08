package HomeWorkSpace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9RegularExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver2.46\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("a[title*='Already']")).click();  //regular expression
		driver.findElement(By.cssSelector("input#login1")).sendKeys("raviteja");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("raviteja");
		driver.findElement(By.xpath("//input[contains(@name,'proce')]")).click();
	}

}
